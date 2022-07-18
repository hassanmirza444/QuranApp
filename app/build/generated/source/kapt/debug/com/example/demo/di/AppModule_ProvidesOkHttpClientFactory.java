// Generated by Dagger (https://dagger.dev).
package com.example.demo.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import okhttp3.OkHttpClient;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvidesOkHttpClientFactory implements Factory<OkHttpClient> {
  @Override
  public OkHttpClient get() {
    return providesOkHttpClient();
  }

  public static AppModule_ProvidesOkHttpClientFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static OkHttpClient providesOkHttpClient() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.providesOkHttpClient());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvidesOkHttpClientFactory INSTANCE = new AppModule_ProvidesOkHttpClientFactory();
  }
}
