package com.example.demo.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001d\u001eB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0012H\u0016J\u0014\u0010\u001b\u001a\u00020\u00142\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/example/demo/adapter/RecitorAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/demo/adapter/RecitorAdapter$MyViewHolder;", "recitorsList", "", "Lcom/example/demo/models/Recitor;", "itemClickListener", "Lcom/example/demo/adapter/RecitorAdapter$OnItemClickListener;", "context", "Landroid/content/Context;", "(Ljava/util/List;Lcom/example/demo/adapter/RecitorAdapter$OnItemClickListener;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "eachRowBinding", "Lcom/example/demo/databinding/ItemVerseRowBinding;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "list", "MyViewHolder", "OnItemClickListener", "app_debug"})
public final class RecitorAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.demo.adapter.RecitorAdapter.MyViewHolder> {
    private java.util.List<? extends com.example.demo.models.Recitor> recitorsList;
    private final com.example.demo.adapter.RecitorAdapter.OnItemClickListener itemClickListener = null;
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    private com.example.demo.databinding.ItemVerseRowBinding eachRowBinding;
    
    public RecitorAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.example.demo.models.Recitor> recitorsList, @org.jetbrains.annotations.NotNull()
    com.example.demo.adapter.RecitorAdapter.OnItemClickListener itemClickListener, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.demo.adapter.RecitorAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.demo.adapter.RecitorAdapter.MyViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.example.demo.models.Recitor> list) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u000e"}, d2 = {"Lcom/example/demo/adapter/RecitorAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "eachRowBinding", "Lcom/example/demo/databinding/ItemVerseRowBinding;", "(Lcom/example/demo/databinding/ItemVerseRowBinding;)V", "getEachRowBinding", "()Lcom/example/demo/databinding/ItemVerseRowBinding;", "setEachRowBinding", "bind", "", "data", "Lcom/example/demo/models/Recitor;", "itemClickListener", "Lcom/example/demo/adapter/RecitorAdapter$OnItemClickListener;", "app_debug"})
    public static final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.example.demo.databinding.ItemVerseRowBinding eachRowBinding;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.demo.databinding.ItemVerseRowBinding eachRowBinding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.demo.databinding.ItemVerseRowBinding getEachRowBinding() {
            return null;
        }
        
        public final void setEachRowBinding(@org.jetbrains.annotations.NotNull()
        com.example.demo.databinding.ItemVerseRowBinding p0) {
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.demo.models.Recitor data, @org.jetbrains.annotations.NotNull()
        com.example.demo.adapter.RecitorAdapter.OnItemClickListener itemClickListener) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/demo/adapter/RecitorAdapter$OnItemClickListener;", "", "onItemClicked", "", "data", "Lcom/example/demo/models/Recitor;", "app_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onItemClicked(@org.jetbrains.annotations.NotNull()
        com.example.demo.models.Recitor data);
    }
}