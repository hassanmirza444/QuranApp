// Generated by Dagger (https://dagger.dev).
package com.example.demo.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ParaListViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static ParaListViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(ParaListViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final ParaListViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new ParaListViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
