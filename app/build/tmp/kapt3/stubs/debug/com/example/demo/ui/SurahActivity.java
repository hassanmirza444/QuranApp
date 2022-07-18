package com.example.demo.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0012\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001a"}, d2 = {"Lcom/example/demo/ui/SurahActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/example/demo/adapter/VerseAdapter$OnItemClickListener;", "()V", "binding", "Lcom/example/demo/databinding/ActivitySurahBinding;", "mContext", "Landroid/content/Context;", "verseAdapter", "Lcom/example/demo/adapter/VerseAdapter;", "verseListViewModel", "Lcom/example/demo/viewmodel/VerseListViewModel;", "getVerseListViewModel", "()Lcom/example/demo/viewmodel/VerseListViewModel;", "verseListViewModel$delegate", "Lkotlin/Lazy;", "callApi", "", "id", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onItemClicked", "data", "Lcom/example/demo/models/Ayah;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class SurahActivity extends androidx.appcompat.app.AppCompatActivity implements com.example.demo.adapter.VerseAdapter.OnItemClickListener {
    private com.example.demo.databinding.ActivitySurahBinding binding;
    private com.example.demo.adapter.VerseAdapter verseAdapter;
    private android.content.Context mContext;
    private final kotlin.Lazy verseListViewModel$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public SurahActivity() {
        super();
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