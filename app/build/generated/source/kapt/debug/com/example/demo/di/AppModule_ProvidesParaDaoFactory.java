// Generated by Dagger (https://dagger.dev).
package com.example.demo.di;

import com.example.demo.database.ParaDao;
import com.example.demo.database.QuranDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvidesParaDaoFactory implements Factory<ParaDao> {
  private final Provider<QuranDatabase> userDatabaseProvider;

  public AppModule_ProvidesParaDaoFactory(Provider<QuranDatabase> userDatabaseProvider) {
    this.userDatabaseProvider = userDatabaseProvider;
  }

  @Override
  public ParaDao get() {
    return providesParaDao(userDatabaseProvider.get());
  }

  public static AppModule_ProvidesParaDaoFactory create(
      Provider<QuranDatabase> userDatabaseProvider) {
    return new AppModule_ProvidesParaDaoFactory(userDatabaseProvider);
  }

  public static ParaDao providesParaDao(QuranDatabase userDatabase) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.providesParaDao(userDatabase));
  }
}
