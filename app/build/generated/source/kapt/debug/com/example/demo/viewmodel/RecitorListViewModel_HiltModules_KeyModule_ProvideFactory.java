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
public final class RecitorListViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static RecitorListViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(RecitorListViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final RecitorListViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new RecitorListViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
