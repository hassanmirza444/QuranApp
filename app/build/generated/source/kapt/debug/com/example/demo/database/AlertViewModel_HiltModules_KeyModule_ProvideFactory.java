// Generated by Dagger (https://dagger.dev).
package com.example.demo.database;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AlertViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static AlertViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(AlertViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final AlertViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new AlertViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}