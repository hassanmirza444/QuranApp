// Generated by data binding compiler. Do not edit!
package com.example.demo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.example.demo.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityParaBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout clInfo;

  @NonNull
  public final ConstraintLayout header;

  @NonNull
  public final ConstraintLayout header1;

  @NonNull
  public final AppCompatImageView ivBack;

  @NonNull
  public final AppCompatImageView ivInfo;

  @NonNull
  public final RecyclerView rvVersesList;

  @NonNull
  public final TextView tvInfo;

  @NonNull
  public final AppCompatTextView tvParahTitle;

  protected ActivityParaBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout clInfo, ConstraintLayout header, ConstraintLayout header1,
      AppCompatImageView ivBack, AppCompatImageView ivInfo, RecyclerView rvVersesList,
      TextView tvInfo, AppCompatTextView tvParahTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.clInfo = clInfo;
    this.header = header;
    this.header1 = header1;
    this.ivBack = ivBack;
    this.ivInfo = ivInfo;
    this.rvVersesList = rvVersesList;
    this.tvInfo = tvInfo;
    this.tvParahTitle = tvParahTitle;
  }

  @NonNull
  public static ActivityParaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_para, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityParaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityParaBinding>inflateInternal(inflater, R.layout.activity_para, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityParaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_para, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityParaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityParaBinding>inflateInternal(inflater, R.layout.activity_para, null, false, component);
  }

  public static ActivityParaBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityParaBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityParaBinding)bind(component, view, R.layout.activity_para);
  }
}
