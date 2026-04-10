package com.smartcampus.app.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002J \u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002J(\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002JP\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0002JP\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0002JP\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0002JX\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b\u00a8\u0006!"}, d2 = {"Lcom/smartcampus/app/utils/ResumePdfGenerator;", "", "()V", "addClassicSection", "", "doc", "Lcom/itextpdf/layout/Document;", "title", "", "content", "addCreativeSection", "cell", "Lcom/itextpdf/layout/element/Cell;", "addModernSection", "color", "Lcom/itextpdf/kernel/colors/DeviceRgb;", "buildClassicTemplate", "name", "email", "phone", "summary", "education", "skills", "experience", "projects", "buildCreativeTemplate", "buildModernTemplate", "generatePdf", "Ljava/io/File;", "context", "Landroid/content/Context;", "templateId", "fullName", "app_debug"})
public final class ResumePdfGenerator {
    @org.jetbrains.annotations.NotNull()
    public static final com.smartcampus.app.utils.ResumePdfGenerator INSTANCE = null;
    
    private ResumePdfGenerator() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.io.File generatePdf(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String templateId, @org.jetbrains.annotations.NotNull()
    java.lang.String fullName, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String phone, @org.jetbrains.annotations.NotNull()
    java.lang.String summary, @org.jetbrains.annotations.NotNull()
    java.lang.String education, @org.jetbrains.annotations.NotNull()
    java.lang.String skills, @org.jetbrains.annotations.NotNull()
    java.lang.String experience, @org.jetbrains.annotations.NotNull()
    java.lang.String projects) {
        return null;
    }
    
    private final void buildClassicTemplate(com.itextpdf.layout.Document doc, java.lang.String name, java.lang.String email, java.lang.String phone, java.lang.String summary, java.lang.String education, java.lang.String skills, java.lang.String experience, java.lang.String projects) {
    }
    
    private final void addClassicSection(com.itextpdf.layout.Document doc, java.lang.String title, java.lang.String content) {
    }
    
    private final void buildModernTemplate(com.itextpdf.layout.Document doc, java.lang.String name, java.lang.String email, java.lang.String phone, java.lang.String summary, java.lang.String education, java.lang.String skills, java.lang.String experience, java.lang.String projects) {
    }
    
    private final void addModernSection(com.itextpdf.layout.Document doc, java.lang.String title, java.lang.String content, com.itextpdf.kernel.colors.DeviceRgb color) {
    }
    
    private final void buildCreativeTemplate(com.itextpdf.layout.Document doc, java.lang.String name, java.lang.String email, java.lang.String phone, java.lang.String summary, java.lang.String education, java.lang.String skills, java.lang.String experience, java.lang.String projects) {
    }
    
    private final void addCreativeSection(com.itextpdf.layout.element.Cell cell, java.lang.String title, java.lang.String content) {
    }
}