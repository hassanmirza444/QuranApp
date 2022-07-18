// Generated by Dagger (https://dagger.dev).
package com.example.demo.repository;

import com.example.demo.network.ApiServiceImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainRepository_Factory implements Factory<MainRepository> {
  private final Provider<ApiServiceImpl> apiServiceImplProvider;

  public MainRepository_Factory(Provider<ApiServiceImpl> apiServiceImplProvider) {
    this.apiServiceImplProvider = apiServiceImplProvider;
  }

  @Override
  public MainRepository get() {
    return newInstance(apiServiceImplProvider.get());
  }

  public static MainRepository_Factory create(Provider<ApiServiceImpl> apiServiceImplProvider) {
    return new MainRepository_Factory(apiServiceImplProvider);
  }

  public static MainRepository newInstance(ApiServiceImpl apiServiceImpl) {
    return new MainRepository(apiServiceImpl);
  }
}