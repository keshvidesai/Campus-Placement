package com.smartcampus.app.ui.student

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.smartcampus.app.R
import com.smartcampus.app.api.ApiClient
import com.smartcampus.app.models.SkillRecommendation
import com.smartcampus.app.utils.SessionManager
import com.google.android.material.button.MaterialButton
import com.google.android.material.progressindicator.LinearProgressIndicator
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SkillRecommendationActivity : AppCompatActivity() {

    private lateinit var session: SessionManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill_recommendation)
        session = SessionManager(this)

        // Map button
        findViewById<MaterialButton>(R.id.btnViewMap).setOnClickListener {
            startActivity(Intent(this, SkillMapActivity::class.java))
        }

        findViewById<MaterialButton>(R.id.btnExternalJobs).setOnClickListener {
            startActivity(Intent(this, com.smartcampus.app.ui.jobs.ExternalJobsActivity::class.java))
        }

        loadRecommendations()
        loadTrending()
    }

    private fun loadRecommendations() {
        ApiClient.getApi().getPersonalizedRecommendations(session.authToken).enqueue(object : Callback<List<SkillRecommendation>> {
            override fun onResponse(call: Call<List<SkillRecommendation>>, response: Response<List<SkillRecommendation>>) {
                if (response.isSuccessful && response.body() != null) {
                    displaySkills(response.body()!!, findViewById(R.id.layoutRecommended))
                }
            }
            override fun onFailure(call: Call<List<SkillRecommendation>>, t: Throwable) {
                Toast.makeText(this@SkillRecommendationActivity, "Error loading recommendations", Toast.LENGTH_SHORT).show()
            }
        })
    }

    private fun loadTrending() {
        ApiClient.getApi().getTrendingSkills(session.authToken).enqueue(object : Callback<List<SkillRecommendation>> {
            override fun onResponse(call: Call<List<SkillRecommendation>>, response: Response<List<SkillRecommendation>>) {
                if (response.isSuccessful && response.body() != null) {
                    displaySkills(response.body()!!, findViewById(R.id.layoutTrending))
                }
            }
            override fun onFailure(call: Call<List<SkillRecommendation>>, t: Throwable) {}
        })
    }

    private fun displaySkills(skills: List<SkillRecommendation>, container: LinearLayout) {
        container.removeAllViews()
        skills.forEach { skill ->
            val card = LayoutInflater.from(this).inflate(R.layout.item_skill_recommendation, container, false)
            card.findViewById<TextView>(R.id.tvSkillName).text = skill.skillName
            card.findViewById<TextView>(R.id.tvDemandScore).text = "${skill.demandScore.toInt()}% demand"
            card.findViewById<LinearProgressIndicator>(R.id.progressDemand).progress = skill.demandScore.toInt()
            card.findViewById<TextView>(R.id.tvReason).text = skill.reason ?: skill.region ?: ""
            
            card.setOnClickListener {
                startActivity(Intent(this, SkillRoadmapActivity::class.java).apply {
                    putExtra("SKILL_NAME", skill.skillName)
                })
            }
            container.addView(card)
        }
    }
}
