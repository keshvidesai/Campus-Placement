package com.smartcampus.app.ui.jobs;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u0014\u0010\u0014\u001a\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/smartcampus/app/ui/jobs/ExternalJobAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/smartcampus/app/ui/jobs/ExternalJobAdapter$JobViewHolder;", "jobs", "", "Lcom/smartcampus/app/models/ExternalJob;", "(Ljava/util/List;)V", "formatPostedDate", "", "date", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateJobs", "newJobs", "JobViewHolder", "app_debug"})
public final class ExternalJobAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.smartcampus.app.ui.jobs.ExternalJobAdapter.JobViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<? extends com.smartcampus.app.models.ExternalJob> jobs;
    
    public ExternalJobAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.smartcampus.app.models.ExternalJob> jobs) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.smartcampus.app.ui.jobs.ExternalJobAdapter.JobViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.smartcampus.app.ui.jobs.ExternalJobAdapter.JobViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void updateJobs(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.smartcampus.app.models.ExternalJob> newJobs) {
    }
    
    private final java.lang.String formatPostedDate(java.lang.String date) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0011\u0010\r\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0011\u0010\u000f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u0011\u0010\u0011\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u0011\u0010\u0013\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/smartcampus/app/ui/jobs/ExternalJobAdapter$JobViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "tvCompany", "Landroid/widget/TextView;", "getTvCompany", "()Landroid/widget/TextView;", "tvDescription", "getTvDescription", "tvJobTitle", "getTvJobTitle", "tvJobType", "getTvJobType", "tvLocation", "getTvLocation", "tvPostedAt", "getTvPostedAt", "tvSource", "getTvSource", "app_debug"})
    public static final class JobViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tvJobTitle = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tvCompany = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tvLocation = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tvDescription = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tvJobType = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tvPostedAt = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tvSource = null;
        
        public JobViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvJobTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvCompany() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvLocation() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvDescription() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvJobType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvPostedAt() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvSource() {
            return null;
        }
    }
}