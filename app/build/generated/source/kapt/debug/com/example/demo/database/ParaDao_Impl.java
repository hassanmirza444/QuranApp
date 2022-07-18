package com.example.demo.database;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.demo.models.ParaInfo;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ParaDao_Impl implements ParaDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ParaInfo> __insertionAdapterOfParaInfo;

  private final EntityDeletionOrUpdateAdapter<ParaInfo> __deletionAdapterOfParaInfo;

  public ParaDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfParaInfo = new EntityInsertionAdapter<ParaInfo>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `ParaInfo` (`number`,`name`,`englishName`,`englishNameTranslation`,`revelationType`,`numberOfAyahs`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ParaInfo value) {
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
    this.__deletionAdapterOfParaInfo = new EntityDeletionOrUpdateAdapter<ParaInfo>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `ParaInfo` WHERE `number` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ParaInfo value) {
        stmt.bindLong(1, value.getNumber());
      }
    };
  }

  @Override
  public Object insert(final ParaInfo user, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfParaInfo.insert(user);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public void delete(final ParaInfo alert) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfParaInfo.handle(alert);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Flow<List<ParaInfo>> getList() {
    final String _sql = "SELECT `ParaInfo`.`number` AS `number`, `ParaInfo`.`name` AS `name`, `ParaInfo`.`englishName` AS `englishName`, `ParaInfo`.`englishNameTranslation` AS `englishNameTranslation`, `ParaInfo`.`revelationType` AS `revelationType`, `ParaInfo`.`numberOfAyahs` AS `numberOfAyahs` FROM ParaInfo";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"ParaInfo"}, new Callable<List<ParaInfo>>() {
      @Override
      public List<ParaInfo> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "number");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfEnglishName = CursorUtil.getColumnIndexOrThrow(_cursor, "englishName");
          final int _cursorIndexOfEnglishNameTranslation = CursorUtil.getColumnIndexOrThrow(_cursor, "englishNameTranslation");
          final int _cursorIndexOfRevelationType = CursorUtil.getColumnIndexOrThrow(_cursor, "revelationType");
          final int _cursorIndexOfNumberOfAyahs = CursorUtil.getColumnIndexOrThrow(_cursor, "numberOfAyahs");
          final List<ParaInfo> _result = new ArrayList<ParaInfo>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ParaInfo _item;
            final int _tmpNumber;
            _tmpNumber = _cursor.getInt(_cursorIndexOfNumber);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpEnglishName;
            _tmpEnglishName = _cursor.getString(_cursorIndexOfEnglishName);
            final String _tmpEnglishNameTranslation;
            _tmpEnglishNameTranslation = _cursor.getString(_cursorIndexOfEnglishNameTranslation);
            final String _tmpRevelationType;
            _tmpRevelationType = _cursor.getString(_cursorIndexOfRevelationType);
            final Integer _tmpNumberOfAyahs;
            if (_cursor.isNull(_cursorIndexOfNumberOfAyahs)) {
              _tmpNumberOfAyahs = null;
            } else {
              _tmpNumberOfAyahs = _cursor.getInt(_cursorIndexOfNumberOfAyahs);
            }
            _item = new ParaInfo(_tmpNumber,_tmpName,_tmpEnglishName,_tmpEnglishNameTranslation,_tmpRevelationType,_tmpNumberOfAyahs);
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
}
