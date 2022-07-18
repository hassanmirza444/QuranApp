package com.example.demo.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rH\u0002J\u0012\u0010\u0019\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001f"}, d2 = {"Lcom/example/demo/ui/ParaActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/example/demo/adapter/VerseAdapter$OnItemClickListener;", "()V", "binding", "Lcom/example/demo/databinding/ActivityParaBinding;", "getBinding", "()Lcom/example/demo/databinding/ActivityParaBinding;", "setBinding", "(Lcom/example/demo/databinding/ActivityParaBinding;)V", "mContext", "Landroid/content/Context;", "para_id", "", "verseAdapter", "Lcom/example/demo/adapter/VerseAdapter;", "verseListViewModel", "Lcom/example/demo/viewmodel/VerseListViewModel;", "getVerseListViewModel", "()Lcom/example/demo/viewmodel/VerseListViewModel;", "verseListViewModel$delegate", "Lkotlin/Lazy;", "callApi", "", "id", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onItemClicked", "data", "Lcom/example/demo/models/Ayah;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class ParaActivity extends androidx.appcompat.app.AppCompatActivity implements com.example.demo.adapter.VerseAdapter.OnItemClickListener {
    public com.example.demo.databinding.ActivityParaBinding binding;
    private com.example.demo.adapter.VerseAdapter verseAdapter;
    private android.content.Context mContext;
    private final kotlin.Lazy verseListViewModel$delegate = null;
    private int para_id = 0;
    private java.util.HashMap _$_findViewCache;
    
    public ParaActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.demo.databinding.ActivityParaBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.example.demo.databinding.ActivityParaBinding p0) {
    }
    
    private final com.example.demo.viewmodel.VerseListViewModel getVerseListViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void callApi(int id) {
    }
    
    @java.lang.Override()
    public void onItemClicked(@org.jetbrains.annotations.NotNull()
    com.example.demo.models.Ayah data) {
    }
}