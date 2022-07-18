// Generated by Dagger (https://dagger.dev).
package com.example.demo.di;

import com.example.demo.database.QuranDatabase;
import com.example.demo.database.SurahDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvidesSurahDaoFactory implements Factory<SurahDao> {
  private final Provider<QuranDatabase> userDatabaseProvider;

  public AppModule_ProvidesSurahDaoFactory(Provider<QuranDatabase> userDatabaseProvider) {
    this.userDatabaseProvider = userDatabaseProvider;
  }

  @Override
  public SurahDao get() {
    return providesSurahDao(userDatabaseProvider.get());
  }

  public static AppModule_ProvidesSurahDaoFactory create(
      Provider<QuranDatabase> userDatabaseProvider) {
    return new AppModule_ProvidesSurahDaoFactory(userDatabaseProvider);
  }

  public static SurahDao providesSurahDao(QuranDatabase userDatabase) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.providesSurahDao(userDatabase));
  }
}