package com.example.demo.ui.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001&B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u0019\u001a\u00020\u0017J$\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u000eH\u0016J\u001a\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\t\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\'"}, d2 = {"Lcom/example/demo/ui/fragment/ParaListFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/example/demo/adapter/ParaListAdapter$OnItemClickListener;", "()V", "alertViewModel", "Lcom/example/demo/database/AlertViewModel;", "getAlertViewModel", "()Lcom/example/demo/database/AlertViewModel;", "alertViewModel$delegate", "Lkotlin/Lazy;", "binding", "Lcom/example/demo/databinding/ParaListFragmentBinding;", "paraList", "", "Lcom/example/demo/models/JuzzModel;", "paraListAdapter", "Lcom/example/demo/adapter/ParaListAdapter;", "viewModel", "Lcom/example/demo/viewmodel/ParaListViewModel;", "getViewModel", "()Lcom/example/demo/viewmodel/ParaListViewModel;", "viewModel$delegate", "callApi", "", "intializeData", "intializeViews", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onItemClicked", "data", "onViewCreated", "view", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class ParaListFragment extends androidx.fragment.app.Fragment implements com.example.demo.adapter.ParaListAdapter.OnItemClickListener {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.demo.ui.fragment.ParaListFragment.Companion Companion = null;
    private com.example.demo.databinding.ParaListFragmentBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    private com.example.demo.adapter.ParaListAdapter paraListAdapter;
    private final kotlin.Lazy alertViewModel$delegate = null;
    private java.util.List<? extends com.example.demo.models.JuzzModel> paraList;
    private java.util.HashMap _$_findViewCache;
    
    public ParaListFragment() {
        super();
    }
    
    private final com.example.demo.viewmodel.ParaListViewModel getViewModel() {
        return null;
    }
    
    private final com.example.demo.database.AlertViewModel getAlertViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void intializeData() {
    }
    
    private final void callApi() {
    }
    
    public final void intializeViews() {
    }
    
    @java.lang.Override()
    public void onItemClicked(@org.jetbrains.annotations.NotNull()
    com.example.demo.models.JuzzModel data) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/demo/ui/fragment/ParaListFragment$Companion;", "", "()V", "newInstance", "Lcom/example/demo/ui/fragment/ParaListFragment;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.demo.ui.fragment.ParaListFragment newInstance() {
            return null;
        }
    }
}