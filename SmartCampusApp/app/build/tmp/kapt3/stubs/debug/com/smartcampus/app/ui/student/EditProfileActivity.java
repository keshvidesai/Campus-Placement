package com.smartcampus.app.ui.student;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/smartcampus/app/ui/student/EditProfileActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "etAbout", "Lcom/google/android/material/textfield/TextInputEditText;", "etBranch", "etCgpa", "etRegion", "etSemester", "session", "Lcom/smartcampus/app/utils/SessionManager;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "saveProfile", "app_debug"})
public final class EditProfileActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.smartcampus.app.utils.SessionManager session;
    private com.google.android.material.textfield.TextInputEditText etSemester;
    private com.google.android.material.textfield.TextInputEditText etBranch;
    private com.google.android.material.textfield.TextInputEditText etCgpa;
    private com.google.android.material.textfield.TextInputEditText etRegion;
    private com.google.android.material.textfield.TextInputEditText etAbout;
    
    public EditProfileActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void saveProfile() {
    }
}