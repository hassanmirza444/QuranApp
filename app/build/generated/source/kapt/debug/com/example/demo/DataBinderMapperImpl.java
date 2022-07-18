package com.example.demo;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.demo.databinding.ActivityParaBindingImpl;
import com.example.demo.databinding.ActivityQuranBindingImpl;
import com.example.demo.databinding.ActivitySelectRecitorBindingImpl;
import com.example.demo.databinding.ActivitySettingsBindingImpl;
import com.example.demo.databinding.ActivitySurahBindingImpl;
import com.example.demo.databinding.ItemParaRowBindingImpl;
import com.example.demo.databinding.ItemSurahRowBindingImpl;
import com.example.demo.databinding.ItemVerseRowBindingImpl;
import com.example.demo.databinding.ParaListFragmentBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYPARA = 1;

  private static final int LAYOUT_ACTIVITYQURAN = 2;

  private static final int LAYOUT_ACTIVITYSELECTRECITOR = 3;

  private static final int LAYOUT_ACTIVITYSETTINGS = 4;

  private static final int LAYOUT_ACTIVITYSURAH = 5;

  private static final int LAYOUT_ITEMPARAROW = 6;

  private static final int LAYOUT_ITEMSURAHROW = 7;

  private static final int LAYOUT_ITEMVERSEROW = 8;

  private static final int LAYOUT_PARALISTFRAGMENT = 9;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(9);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.demo.R.layout.activity_para, LAYOUT_ACTIVITYPARA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.demo.R.layout.activity_quran, LAYOUT_ACTIVITYQURAN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.demo.R.layout.activity_select_recitor, LAYOUT_ACTIVITYSELECTRECITOR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.demo.R.layout.activity_settings, LAYOUT_ACTIVITYSETTINGS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.demo.R.layout.activity_surah, LAYOUT_ACTIVITYSURAH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.demo.R.layout.item_para_row, LAYOUT_ITEMPARAROW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.demo.R.layout.item_surah_row, LAYOUT_ITEMSURAHROW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.demo.R.layout.item_verse_row, LAYOUT_ITEMVERSEROW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.demo.R.layout.para_list_fragment, LAYOUT_PARALISTFRAGMENT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYPARA: {
          if ("layout/activity_para_0".equals(tag)) {
            return new ActivityParaBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_para is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYQURAN: {
          if ("layout/activity_quran_0".equals(tag)) {
            return new ActivityQuranBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_quran is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSELECTRECITOR: {
          if ("layout/activity_select_recitor_0".equals(tag)) {
            return new ActivitySelectRecitorBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_select_recitor is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSETTINGS: {
          if ("layout/activity_settings_0".equals(tag)) {
            return new ActivitySettingsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_settings is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSURAH: {
          if ("layout/activity_surah_0".equals(tag)) {
            return new ActivitySurahBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_surah is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMPARAROW: {
          if ("layout/item_para_row_0".equals(tag)) {
            return new ItemParaRowBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_para_row is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSURAHROW: {
          if ("layout/item_surah_row_0".equals(tag)) {
            return new ItemSurahRowBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_surah_row is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMVERSEROW: {
          if ("layout/item_verse_row_0".equals(tag)) {
            return new ItemVerseRowBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_verse_row is invalid. Received: " + tag);
        }
        case  LAYOUT_PARALISTFRAGMENT: {
          if ("layout/para_list_fragment_0".equals(tag)) {
            return new ParaListFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for para_list_fragment is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "info");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(9);

    static {
      sKeys.put("layout/activity_para_0", com.example.demo.R.layout.activity_para);
      sKeys.put("layout/activity_quran_0", com.example.demo.R.layout.activity_quran);
      sKeys.put("layout/activity_select_recitor_0", com.example.demo.R.layout.activity_select_recitor);
      sKeys.put("layout/activity_settings_0", com.example.demo.R.layout.activity_settings);
      sKeys.put("layout/activity_surah_0", com.example.demo.R.layout.activity_surah);
      sKeys.put("layout/item_para_row_0", com.example.demo.R.layout.item_para_row);
      sKeys.put("layout/item_surah_row_0", com.example.demo.R.layout.item_surah_row);
      sKeys.put("layout/item_verse_row_0", com.example.demo.R.layout.item_verse_row);
      sKeys.put("layout/para_list_fragment_0", com.example.demo.R.layout.para_list_fragment);
    }
  }
}
