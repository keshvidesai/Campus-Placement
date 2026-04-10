package com.smartcampus.backend.service

import com.smartcampus.backend.dto.*
import com.smartcampus.backend.models.*
import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.transactions.transaction
import java.time.LocalDateTime

class RecruiterService {

    fun searchCandidates(request: CandidateSearchRequest): List<CandidateResponse> {
        return transaction {
            var query = (StudentProfiles innerJoin Users)
                .select { Users.role eq "STUDENT" }

            request.branch?.let { branch ->
                query = query.andWhere { StudentProfiles.branch eq branch }
            }
            request.minCgpa?.let { cgpa ->
                query = query.andWhere { StudentProfiles.cgpa greaterEq cgpa }
            }

            val candidates = query.map { row ->
                val profileId = row[StudentProfiles.id]
                val skills = (StudentSkills innerJoin Skills)
                    .select { StudentSkills.studentProfileId eq profileId }
                    .map { r -> r[Skills.name] }

                CandidateResponse(
                    userId = row[Users.id],
                    name = row[Users.name],
                    email = row[Users.email],
                    semester = row[StudentProfiles.semester],
                    branch = row[StudentProfiles.branch],
                    cgpa = row[StudentProfiles.cgpa],
                    skills = skills,
                    resumeUrl = row[StudentProfiles.resumeUrl]
                )
            }

            request.skill?.let { skill ->
                candidates.filter { candidate ->
                    candidate.skills.any { s -> s.equals(skill, ignoreCase = true) }
                }
            } ?: candidates
        }
    }

    fun viewResume(recruiterId: Int, studentId: Int): CandidateResponse {
        return transaction {
            ResumeViews.insert {
                it[ResumeViews.studentId] = studentId
                it[ResumeViews.recruiterId] = recruiterId
                it[viewedAt] = LocalDateTime.now()
            }

            Notifications.insert {
                it[userId] = studentId
                it[title] = "Resume Viewed"
                it[message] = "A recruiter has viewed your resume"
                it[type] = "RESUME_VIEW"
                it[isRead] = false
                it[createdAt] = LocalDateTime.now()
            }

            val row = (StudentProfiles innerJoin Users)
                .select { Users.id eq studentId }.singleOrNull()
                ?: throw IllegalArgumentException("Student not found")

            val profileId = row[StudentProfiles.id]
            val skills = (StudentSkills innerJoin Skills)
                .select { StudentSkills.studentProfileId eq profileId }
                .map { r -> r[Skills.name] }

            CandidateResponse(
                userId = row[Users.id],
                name = row[Users.name],
                email = row[Users.email],
                semester = row[StudentProfiles.semester],
                branch = row[StudentProfiles.branch],
                cgpa = row[StudentProfiles.cgpa],
                skills = skills,
                resumeUrl = row[StudentProfiles.resumeUrl]
            )
        }
    }
}
