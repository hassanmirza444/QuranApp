package com.example.demo.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0012\u0010 \u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\u0010\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020%H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/example/demo/ui/SelectRecitorActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/example/demo/adapter/RecitorAdapter$OnItemClickListener;", "()V", "binding", "Lcom/example/demo/databinding/ActivitySelectRecitorBinding;", "getBinding", "()Lcom/example/demo/databinding/ActivitySelectRecitorBinding;", "setBinding", "(Lcom/example/demo/databinding/ActivitySelectRecitorBinding;)V", "mContext", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "recitorAdapter", "Lcom/example/demo/adapter/RecitorAdapter;", "getRecitorAdapter", "()Lcom/example/demo/adapter/RecitorAdapter;", "setRecitorAdapter", "(Lcom/example/demo/adapter/RecitorAdapter;)V", "recitorListViewModel", "Lcom/example/demo/viewmodel/RecitorListViewModel;", "getRecitorListViewModel", "()Lcom/example/demo/viewmodel/RecitorListViewModel;", "recitorListViewModel$delegate", "Lkotlin/Lazy;", "type", "", "callApi", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onItemClicked", "data", "Lcom/example/demo/models/Recitor;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class SelectRecitorActivity extends androidx.appcompat.app.AppCompatActivity implements com.example.demo.adapter.RecitorAdapter.OnItemClickListener {
    public com.example.demo.databinding.ActivitySelectRecitorBinding binding;
    public com.example.demo.adapter.RecitorAdapter recitorAdapter;
    public android.content.Context mContext;
    private final kotlin.Lazy recitorListViewModel$delegate = null;
    private java.lang.String type;
    private java.util.HashMap _$_findViewCache;
    
    public SelectRecitorActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.demo.databinding.ActivitySelectRecitorBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.example.demo.databinding.ActivitySelectRecitorBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.demo.adapter.RecitorAdapter getRecitorAdapter() {
        return null;
    }
    
    public final void setRecitorAdapter(@org.jetbrains.annotations.NotNull()
    com.example.demo.adapter.RecitorAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext() {
        return null;
    }
    
    public final void setMContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    private final com.example.demo.viewmodel.RecitorListViewModel getRecitorListViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void callApi(java.lang.String type) {
    }
    
    @java.lang.Override()
    public void onItemClicked(@org.jetbrains.annotations.NotNull()
    com.example.demo.models.Recitor data) {
    }
}