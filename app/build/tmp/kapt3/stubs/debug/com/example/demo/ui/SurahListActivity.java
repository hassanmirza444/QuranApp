package com.example.demo.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0006\u0010\u001d\u001a\u00020\u0019J\u0006\u0010\u001e\u001a\u00020\u0019J\u0012\u0010\u001f\u001a\u00020\u00192\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\u0010\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\fH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\t\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/example/demo/ui/SurahListActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/example/demo/adapter/SurahListAdapter$OnItemClickListener;", "()V", "alertViewModel", "Lcom/example/demo/database/AlertViewModel;", "getAlertViewModel", "()Lcom/example/demo/database/AlertViewModel;", "alertViewModel$delegate", "Lkotlin/Lazy;", "alertsList", "", "Lcom/example/demo/models/SurahInfo;", "binding", "Lcom/example/demo/databinding/ActivitySurahListBinding;", "context", "Landroid/content/Context;", "mainViewModel", "Lcom/example/demo/viewmodel/SurahListViewModel;", "getMainViewModel", "()Lcom/example/demo/viewmodel/SurahListViewModel;", "mainViewModel$delegate", "surahListAdapter", "Lcom/example/demo/adapter/SurahListAdapter;", "callApi", "", "deleteItemFromDb", "adapterPosition", "", "intializeData", "intializeViews", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onItemClicked", "data", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class SurahListActivity extends androidx.appcompat.app.AppCompatActivity implements com.example.demo.adapter.SurahListAdapter.OnItemClickListener {
    private com.example.demo.databinding.ActivitySurahListBinding binding;
    private com.example.demo.adapter.SurahListAdapter surahListAdapter;
    private android.content.Context context;
    private final kotlin.Lazy mainViewModel$delegate = null;
    private final kotlin.Lazy alertViewModel$delegate = null;
    private java.util.List<com.example.demo.models.SurahInfo> alertsList;
    private java.util.HashMap _$_findViewCache;
    
    public SurahListActivity() {
        super();
    }
    
    private final com.example.demo.viewmodel.SurahListViewModel getMainViewModel() {
        return null;
    }
    
    private final com.example.demo.database.AlertViewModel getAlertViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void intializeViews() {
    }
    
    private final void deleteItemFromDb(int adapterPosition) {
    }
    
    private final void callApi() {
    }
    
    public final void intializeData() {
    }
    
    @java.lang.Override()
    public void onItemClicked(@org.jetbrains.annotations.NotNull()
    com.example.demo.models.SurahInfo data) {
    }
}