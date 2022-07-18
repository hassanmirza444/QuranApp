package com.example.demo.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001f B1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0013H\u0016J\"\u0010\u001c\u001a\u00020\u00152\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/example/demo/adapter/VerseAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/demo/adapter/VerseAdapter$MyViewHolder;", "resultsInArabic", "", "Lcom/example/demo/models/Ayah;", "translatedResultList", "itemClickListener", "Lcom/example/demo/adapter/VerseAdapter$OnItemClickListener;", "context", "Landroid/content/Context;", "(Ljava/util/List;Ljava/util/List;Lcom/example/demo/adapter/VerseAdapter$OnItemClickListener;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "eachRowBinding", "Lcom/example/demo/databinding/ItemVerseRowBinding;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "list", "translatedList", "MyViewHolder", "OnItemClickListener", "app_debug"})
public final class VerseAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.demo.adapter.VerseAdapter.MyViewHolder> {
    private java.util.List<? extends com.example.demo.models.Ayah> resultsInArabic;
    private java.util.List<? extends com.example.demo.models.Ayah> translatedResultList;
    private final com.example.demo.adapter.VerseAdapter.OnItemClickListener itemClickListener = null;
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    private com.example.demo.databinding.ItemVerseRowBinding eachRowBinding;
    
    public VerseAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.example.demo.models.Ayah> resultsInArabic, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.example.demo.models.Ayah> translatedResultList, @org.jetbrains.annotations.NotNull()
    com.example.demo.adapter.VerseAdapter.OnItemClickListener itemClickListener, @org.jetbrains.annotations.NotNull()
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
    public com.example.demo.adapter.VerseAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.demo.adapter.VerseAdapter.MyViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.example.demo.models.Ayah> list, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.example.demo.models.Ayah> translatedList) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u000f"}, d2 = {"Lcom/example/demo/adapter/VerseAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "eachRowBinding", "Lcom/example/demo/databinding/ItemVerseRowBinding;", "(Lcom/example/demo/databinding/ItemVerseRowBinding;)V", "getEachRowBinding", "()Lcom/example/demo/databinding/ItemVerseRowBinding;", "setEachRowBinding", "bind", "", "data", "Lcom/example/demo/models/Ayah;", "translatedAyah", "itemClickListener", "Lcom/example/demo/adapter/VerseAdapter$OnItemClickListener;", "app_debug"})
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
        com.example.demo.models.Ayah data, @org.jetbrains.annotations.Nullable()
        com.example.demo.models.Ayah translatedAyah, @org.jetbrains.annotations.NotNull()
        com.example.demo.adapter.VerseAdapter.OnItemClickListener itemClickListener) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/demo/adapter/VerseAdapter$OnItemClickListener;", "", "onItemClicked", "", "data", "Lcom/example/demo/models/Ayah;", "app_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onItemClicked(@org.jetbrains.annotations.NotNull()
        com.example.demo.models.Ayah data);
    }
}