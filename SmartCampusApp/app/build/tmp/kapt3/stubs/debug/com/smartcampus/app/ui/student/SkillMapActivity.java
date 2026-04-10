package com.smartcampus.app.ui.student;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nH\u0002J\b\u0010\u0010\u001a\u00020\rH\u0016J\u0012\u0010\u0011\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/smartcampus/app/ui/student/SkillMapActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "gson", "Lcom/google/gson/Gson;", "session", "Lcom/smartcampus/app/utils/SessionManager;", "webView", "Landroid/webkit/WebView;", "escapeJs", "", "str", "loadRegionData", "", "loadRegionSkills", "regionName", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "MapInterface", "app_debug"})
public final class SkillMapActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.smartcampus.app.utils.SessionManager session;
    private android.webkit.WebView webView;
    @org.jetbrains.annotations.NotNull()
    private final com.google.gson.Gson gson = null;
    
    public SkillMapActivity() {
        super();
    }
    
    @java.lang.Override()
    @android.annotation.SuppressLint(value = {"SetJavaScriptEnabled"})
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void loadRegionData() {
    }
    
    private final void loadRegionSkills(java.lang.String regionName) {
    }
    
    private final java.lang.String escapeJs(java.lang.String str) {
        return null;
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/smartcampus/app/ui/student/SkillMapActivity$MapInterface;", "", "(Lcom/smartcampus/app/ui/student/SkillMapActivity;)V", "onRegionSelected", "", "regionName", "", "app_debug"})
    public final class MapInterface {
        
        public MapInterface() {
            super();
        }
        
        @android.webkit.JavascriptInterface()
        public final void onRegionSelected(@org.jetbrains.annotations.NotNull()
        java.lang.String regionName) {
        }
    }
}