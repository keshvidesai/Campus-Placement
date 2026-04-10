package com.smartcampus.app.ui.student;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0002J\b\u0010\u000e\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\fH\u0016J\u0012\u0010\u0010\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/smartcampus/app/ui/student/SkillRoadmapActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "session", "Lcom/smartcampus/app/utils/SessionManager;", "skillName", "", "webView", "Landroid/webkit/WebView;", "escapeJs", "s", "loadProgress", "", "roadmapJson", "loadRoadmapData", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "RoadmapInterface", "app_debug"})
public final class SkillRoadmapActivity extends androidx.appcompat.app.AppCompatActivity {
    private android.webkit.WebView webView;
    private com.smartcampus.app.utils.SessionManager session;
    private java.lang.String skillName;
    
    public SkillRoadmapActivity() {
        super();
    }
    
    @java.lang.Override()
    @android.annotation.SuppressLint(value = {"SetJavaScriptEnabled"})
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void loadRoadmapData() {
    }
    
    private final void loadProgress(java.lang.String roadmapJson) {
    }
    
    private final java.lang.String escapeJs(java.lang.String s) {
        return null;
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/smartcampus/app/ui/student/SkillRoadmapActivity$RoadmapInterface;", "", "(Lcom/smartcampus/app/ui/student/SkillRoadmapActivity;)V", "onProgressChanged", "", "completedStepsJson", "", "app_debug"})
    public final class RoadmapInterface {
        
        public RoadmapInterface() {
            super();
        }
        
        @android.webkit.JavascriptInterface()
        public final void onProgressChanged(@org.jetbrains.annotations.NotNull()
        java.lang.String completedStepsJson) {
        }
    }
}