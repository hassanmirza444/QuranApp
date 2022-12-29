package com.example.demo.database;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class QuranDatabase_Impl extends QuranDatabase {
  private volatile SurahDao _surahDao;

  private volatile ParaDao _paraDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `SurahInfo` (`number` INTEGER NOT NULL, `name` TEXT, `englishName` TEXT, `englishNameTranslation` TEXT, `revelationType` TEXT, `numberOfAyahs` INTEGER, PRIMARY KEY(`number`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `ParaInfo` (`number` INTEGER NOT NULL, `name` TEXT, `englishName` TEXT, `englishNameTranslation` TEXT, `revelationType` TEXT, `numberOfAyahs` INTEGER, PRIMARY KEY(`number`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '77b3789b87588614a8e6d5f222683ce5')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `SurahInfo`");
        _db.execSQL("DROP TABLE IF EXISTS `ParaInfo`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsSurahInfo = new HashMap<String, TableInfo.Column>(6);
        _columnsSurahInfo.put("number", new TableInfo.Column("number", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSurahInfo.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSurahInfo.put("englishName", new TableInfo.Column("englishName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSurahInfo.put("englishNameTranslation", new TableInfo.Column("englishNameTranslation", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSurahInfo.put("revelationType", new TableInfo.Column("revelationType", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSurahInfo.put("numberOfAyahs", new TableInfo.Column("numberOfAyahs", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSurahInfo = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSurahInfo = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSurahInfo = new TableInfo("SurahInfo", _columnsSurahInfo, _foreignKeysSurahInfo, _indicesSurahInfo);
        final TableInfo _existingSurahInfo = TableInfo.read(_db, "SurahInfo");
        if (! _infoSurahInfo.equals(_existingSurahInfo)) {
          return new RoomOpenHelper.ValidationResult(false, "SurahInfo(com.example.demo.models.SurahInfo).\n"
                  + " Expected:\n" + _infoSurahInfo + "\n"
                  + " Found:\n" + _existingSurahInfo);
        }
        final HashMap<String, TableInfo.Column> _columnsParaInfo = new HashMap<String, TableInfo.Column>(6);
        _columnsParaInfo.put("number", new TableInfo.Column("number", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsParaInfo.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsParaInfo.put("englishName", new TableInfo.Column("englishName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsParaInfo.put("englishNameTranslation", new TableInfo.Column("englishNameTranslation", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsParaInfo.put("revelationType", new TableInfo.Column("revelationType", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsParaInfo.put("numberOfAyahs", new TableInfo.Column("numberOfAyahs", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysParaInfo = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesParaInfo = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoParaInfo = new TableInfo("ParaInfo", _columnsParaInfo, _foreignKeysParaInfo, _indicesParaInfo);
        final TableInfo _existingParaInfo = TableInfo.read(_db, "ParaInfo");
        if (! _infoParaInfo.equals(_existingParaInfo)) {
          return new RoomOpenHelper.ValidationResult(false, "ParaInfo(com.example.demo.models.ParaInfo).\n"
                  + " Expected:\n" + _infoParaInfo + "\n"
                  + " Found:\n" + _existingParaInfo);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "77b3789b87588614a8e6d5f222683ce5", "ace75e898e4286e510bf378af1d2df1d");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "SurahInfo","ParaInfo");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `SurahInfo`");
      _db.execSQL("DELETE FROM `ParaInfo`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(SurahDao.class, SurahDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(ParaDao.class, ParaDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public SurahDao surahDao() {
    if (_surahDao != null) {
      return _surahDao;
    } else {
      synchronized(this) {
        if(_surahDao == null) {
          _surahDao = new SurahDao_Impl(this);
        }
        return _surahDao;
      }
    }
  }

  @Override
  public ParaDao paraDao() {
    if (_paraDao != null) {
      return _paraDao;
    } else {
      synchronized(this) {
        if(_paraDao == null) {
          _paraDao = new ParaDao_Impl(this);
        }
        return _paraDao;
      }
    }
  }
}
