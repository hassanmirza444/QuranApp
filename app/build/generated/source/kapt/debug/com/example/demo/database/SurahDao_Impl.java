package com.example.demo.database;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.demo.models.SurahInfo;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class SurahDao_Impl implements SurahDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<SurahInfo> __insertionAdapterOfSurahInfo;

  private final EntityDeletionOrUpdateAdapter<SurahInfo> __deletionAdapterOfSurahInfo;

  public SurahDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSurahInfo = new EntityInsertionAdapter<SurahInfo>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `SurahInfo` (`number`,`name`,`englishName`,`englishNameTranslation`,`revelationType`,`numberOfAyahs`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SurahInfo value) {
        stmt.bindLong(1, value.getNumber());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getEnglishName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getEnglishName());
        }
        if (value.getEnglishNameTranslation() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getEnglishNameTranslation());
        }
        if (value.getRevelationType() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getRevelationType());
        }
        if (value.getNumberOfAyahs() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getNumberOfAyahs());
        }
      }
    };
    this.__deletionAdapterOfSurahInfo = new EntityDeletionOrUpdateAdapter<SurahInfo>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `SurahInfo` WHERE `number` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SurahInfo value) {
        stmt.bindLong(1, value.getNumber());
      }
    };
  }

  @Override
  public Object insert(final SurahInfo user, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfSurahInfo.insert(user);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public void delete(final SurahInfo alert) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfSurahInfo.handle(alert);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Flow<List<SurahInfo>> getList() {
    final String _sql = "SELECT `SurahInfo`.`number` AS `number`, `SurahInfo`.`name` AS `name`, `SurahInfo`.`englishName` AS `englishName`, `SurahInfo`.`englishNameTranslation` AS `englishNameTranslation`, `SurahInfo`.`revelationType` AS `revelationType`, `SurahInfo`.`numberOfAyahs` AS `numberOfAyahs` FROM SurahInfo";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"SurahInfo"}, new Callable<List<SurahInfo>>() {
      @Override
      public List<SurahInfo> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfNumber = 0;
          final int _cursorIndexOfName = 1;
          final int _cursorIndexOfEnglishName = 2;
          final int _cursorIndexOfEnglishNameTranslation = 3;
          final int _cursorIndexOfRevelationType = 4;
          final int _cursorIndexOfNumberOfAyahs = 5;
          final List<SurahInfo> _result = new ArrayList<SurahInfo>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final SurahInfo _item;
            final int _tmpNumber;
            _tmpNumber = _cursor.getInt(_cursorIndexOfNumber);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpEnglishName;
            if (_cursor.isNull(_cursorIndexOfEnglishName)) {
              _tmpEnglishName = null;
            } else {
              _tmpEnglishName = _cursor.getString(_cursorIndexOfEnglishName);
            }
            final String _tmpEnglishNameTranslation;
            if (_cursor.isNull(_cursorIndexOfEnglishNameTranslation)) {
              _tmpEnglishNameTranslation = null;
            } else {
              _tmpEnglishNameTranslation = _cursor.getString(_cursorIndexOfEnglishNameTranslation);
            }
            final String _tmpRevelationType;
            if (_cursor.isNull(_cursorIndexOfRevelationType)) {
              _tmpRevelationType = null;
            } else {
              _tmpRevelationType = _cursor.getString(_cursorIndexOfRevelationType);
            }
            final Integer _tmpNumberOfAyahs;
            if (_cursor.isNull(_cursorIndexOfNumberOfAyahs)) {
              _tmpNumberOfAyahs = null;
            } else {
              _tmpNumberOfAyahs = _cursor.getInt(_cursorIndexOfNumberOfAyahs);
            }
            _item = new SurahInfo(_tmpNumber,_tmpName,_tmpEnglishName,_tmpEnglishNameTranslation,_tmpRevelationType,_tmpNumberOfAyahs);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<SurahInfo>> getAllSurah() {
    final String _sql = "SELECT `SurahInfo`.`number` AS `number`, `SurahInfo`.`name` AS `name`, `SurahInfo`.`englishName` AS `englishName`, `SurahInfo`.`englishNameTranslation` AS `englishNameTranslation`, `SurahInfo`.`revelationType` AS `revelationType`, `SurahInfo`.`numberOfAyahs` AS `numberOfAyahs` FROM SurahInfo";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"SurahInfo"}, false, new Callable<List<SurahInfo>>() {
      @Override
      public List<SurahInfo> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfNumber = 0;
          final int _cursorIndexOfName = 1;
          final int _cursorIndexOfEnglishName = 2;
          final int _cursorIndexOfEnglishNameTranslation = 3;
          final int _cursorIndexOfRevelationType = 4;
          final int _cursorIndexOfNumberOfAyahs = 5;
          final List<SurahInfo> _result = new ArrayList<SurahInfo>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final SurahInfo _item;
            final int _tmpNumber;
            _tmpNumber = _cursor.getInt(_cursorIndexOfNumber);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpEnglishName;
            if (_cursor.isNull(_cursorIndexOfEnglishName)) {
              _tmpEnglishName = null;
            } else {
              _tmpEnglishName = _cursor.getString(_cursorIndexOfEnglishName);
            }
            final String _tmpEnglishNameTranslation;
            if (_cursor.isNull(_cursorIndexOfEnglishNameTranslation)) {
              _tmpEnglishNameTranslation = null;
            } else {
              _tmpEnglishNameTranslation = _cursor.getString(_cursorIndexOfEnglishNameTranslation);
            }
            final String _tmpRevelationType;
            if (_cursor.isNull(_cursorIndexOfRevelationType)) {
              _tmpRevelationType = null;
            } else {
              _tmpRevelationType = _cursor.getString(_cursorIndexOfRevelationType);
            }
            final Integer _tmpNumberOfAyahs;
            if (_cursor.isNull(_cursorIndexOfNumberOfAyahs)) {
              _tmpNumberOfAyahs = null;
            } else {
              _tmpNumberOfAyahs = _cursor.getInt(_cursorIndexOfNumberOfAyahs);
            }
            _item = new SurahInfo(_tmpNumber,_tmpName,_tmpEnglishName,_tmpEnglishNameTranslation,_tmpRevelationType,_tmpNumberOfAyahs);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
