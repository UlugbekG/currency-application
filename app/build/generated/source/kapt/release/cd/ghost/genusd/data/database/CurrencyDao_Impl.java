package cd.ghost.genusd.data.database;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class CurrencyDao_Impl implements CurrencyDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<CurrencyEntity> __insertionAdapterOfCurrencyEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public CurrencyDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCurrencyEntity = new EntityInsertionAdapter<CurrencyEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `currency-table` (`ccy`,`ccyNmEN`,`ccyNmRU`,`ccyNmUZ`,`ccyNmUZC`,`code`,`date`,`diff`,`nominal`,`rate`,`id`,`iconByte`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CurrencyEntity value) {
        if (value.getCcy() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getCcy());
        }
        if (value.getCcyNmEN() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCcyNmEN());
        }
        if (value.getCcyNmRU() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCcyNmRU());
        }
        if (value.getCcyNmUZ() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCcyNmUZ());
        }
        if (value.getCcyNmUZC() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getCcyNmUZC());
        }
        if (value.getCode() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getCode());
        }
        if (value.getDate() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getDate());
        }
        if (value.getDiff() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getDiff());
        }
        if (value.getNominal() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getNominal());
        }
        if (value.getRate() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getRate());
        }
        stmt.bindLong(11, value.getId());
        if (value.getIconByte() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindBlob(12, value.getIconByte());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM `currency-table`";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final List<CurrencyEntity> list,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfCurrencyEntity.insert(list);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object withTransaction(final List<CurrencyEntity> list,
      final Continuation<? super Unit> $completion) {
    return RoomDatabaseKt.withTransaction(__db, (__cont) -> CurrencyDao.DefaultImpls.withTransaction(CurrencyDao_Impl.this, list, __cont), $completion);
  }

  @Override
  public Object deleteAll(final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAll.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object getCurrencies(final Continuation<? super List<CurrencyEntity>> $completion) {
    final String _sql = "SELECT * FROM `currency-table`";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<CurrencyEntity>>() {
      @Override
      public List<CurrencyEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCcy = CursorUtil.getColumnIndexOrThrow(_cursor, "ccy");
          final int _cursorIndexOfCcyNmEN = CursorUtil.getColumnIndexOrThrow(_cursor, "ccyNmEN");
          final int _cursorIndexOfCcyNmRU = CursorUtil.getColumnIndexOrThrow(_cursor, "ccyNmRU");
          final int _cursorIndexOfCcyNmUZ = CursorUtil.getColumnIndexOrThrow(_cursor, "ccyNmUZ");
          final int _cursorIndexOfCcyNmUZC = CursorUtil.getColumnIndexOrThrow(_cursor, "ccyNmUZC");
          final int _cursorIndexOfCode = CursorUtil.getColumnIndexOrThrow(_cursor, "code");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfDiff = CursorUtil.getColumnIndexOrThrow(_cursor, "diff");
          final int _cursorIndexOfNominal = CursorUtil.getColumnIndexOrThrow(_cursor, "nominal");
          final int _cursorIndexOfRate = CursorUtil.getColumnIndexOrThrow(_cursor, "rate");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfIconByte = CursorUtil.getColumnIndexOrThrow(_cursor, "iconByte");
          final List<CurrencyEntity> _result = new ArrayList<CurrencyEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final CurrencyEntity _item;
            final String _tmpCcy;
            if (_cursor.isNull(_cursorIndexOfCcy)) {
              _tmpCcy = null;
            } else {
              _tmpCcy = _cursor.getString(_cursorIndexOfCcy);
            }
            final String _tmpCcyNmEN;
            if (_cursor.isNull(_cursorIndexOfCcyNmEN)) {
              _tmpCcyNmEN = null;
            } else {
              _tmpCcyNmEN = _cursor.getString(_cursorIndexOfCcyNmEN);
            }
            final String _tmpCcyNmRU;
            if (_cursor.isNull(_cursorIndexOfCcyNmRU)) {
              _tmpCcyNmRU = null;
            } else {
              _tmpCcyNmRU = _cursor.getString(_cursorIndexOfCcyNmRU);
            }
            final String _tmpCcyNmUZ;
            if (_cursor.isNull(_cursorIndexOfCcyNmUZ)) {
              _tmpCcyNmUZ = null;
            } else {
              _tmpCcyNmUZ = _cursor.getString(_cursorIndexOfCcyNmUZ);
            }
            final String _tmpCcyNmUZC;
            if (_cursor.isNull(_cursorIndexOfCcyNmUZC)) {
              _tmpCcyNmUZC = null;
            } else {
              _tmpCcyNmUZC = _cursor.getString(_cursorIndexOfCcyNmUZC);
            }
            final String _tmpCode;
            if (_cursor.isNull(_cursorIndexOfCode)) {
              _tmpCode = null;
            } else {
              _tmpCode = _cursor.getString(_cursorIndexOfCode);
            }
            final String _tmpDate;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmpDate = null;
            } else {
              _tmpDate = _cursor.getString(_cursorIndexOfDate);
            }
            final String _tmpDiff;
            if (_cursor.isNull(_cursorIndexOfDiff)) {
              _tmpDiff = null;
            } else {
              _tmpDiff = _cursor.getString(_cursorIndexOfDiff);
            }
            final String _tmpNominal;
            if (_cursor.isNull(_cursorIndexOfNominal)) {
              _tmpNominal = null;
            } else {
              _tmpNominal = _cursor.getString(_cursorIndexOfNominal);
            }
            final String _tmpRate;
            if (_cursor.isNull(_cursorIndexOfRate)) {
              _tmpRate = null;
            } else {
              _tmpRate = _cursor.getString(_cursorIndexOfRate);
            }
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final byte[] _tmpIconByte;
            if (_cursor.isNull(_cursorIndexOfIconByte)) {
              _tmpIconByte = null;
            } else {
              _tmpIconByte = _cursor.getBlob(_cursorIndexOfIconByte);
            }
            _item = new CurrencyEntity(_tmpCcy,_tmpCcyNmEN,_tmpCcyNmRU,_tmpCcyNmUZ,_tmpCcyNmUZC,_tmpCode,_tmpDate,_tmpDiff,_tmpNominal,_tmpRate,_tmpId,_tmpIconByte);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Object getByQuery(final String str,
      final Continuation<? super List<CurrencyEntity>> $completion) {
    final String _sql = "SELECT * FROM `currency-table` WHERE LOWER(ccy) LIKE LOWER(?) OR LOWER(ccyNmUZ) LIKE LOWER(?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (str == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, str);
    }
    _argIndex = 2;
    if (str == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, str);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<CurrencyEntity>>() {
      @Override
      public List<CurrencyEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCcy = CursorUtil.getColumnIndexOrThrow(_cursor, "ccy");
          final int _cursorIndexOfCcyNmEN = CursorUtil.getColumnIndexOrThrow(_cursor, "ccyNmEN");
          final int _cursorIndexOfCcyNmRU = CursorUtil.getColumnIndexOrThrow(_cursor, "ccyNmRU");
          final int _cursorIndexOfCcyNmUZ = CursorUtil.getColumnIndexOrThrow(_cursor, "ccyNmUZ");
          final int _cursorIndexOfCcyNmUZC = CursorUtil.getColumnIndexOrThrow(_cursor, "ccyNmUZC");
          final int _cursorIndexOfCode = CursorUtil.getColumnIndexOrThrow(_cursor, "code");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfDiff = CursorUtil.getColumnIndexOrThrow(_cursor, "diff");
          final int _cursorIndexOfNominal = CursorUtil.getColumnIndexOrThrow(_cursor, "nominal");
          final int _cursorIndexOfRate = CursorUtil.getColumnIndexOrThrow(_cursor, "rate");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfIconByte = CursorUtil.getColumnIndexOrThrow(_cursor, "iconByte");
          final List<CurrencyEntity> _result = new ArrayList<CurrencyEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final CurrencyEntity _item;
            final String _tmpCcy;
            if (_cursor.isNull(_cursorIndexOfCcy)) {
              _tmpCcy = null;
            } else {
              _tmpCcy = _cursor.getString(_cursorIndexOfCcy);
            }
            final String _tmpCcyNmEN;
            if (_cursor.isNull(_cursorIndexOfCcyNmEN)) {
              _tmpCcyNmEN = null;
            } else {
              _tmpCcyNmEN = _cursor.getString(_cursorIndexOfCcyNmEN);
            }
            final String _tmpCcyNmRU;
            if (_cursor.isNull(_cursorIndexOfCcyNmRU)) {
              _tmpCcyNmRU = null;
            } else {
              _tmpCcyNmRU = _cursor.getString(_cursorIndexOfCcyNmRU);
            }
            final String _tmpCcyNmUZ;
            if (_cursor.isNull(_cursorIndexOfCcyNmUZ)) {
              _tmpCcyNmUZ = null;
            } else {
              _tmpCcyNmUZ = _cursor.getString(_cursorIndexOfCcyNmUZ);
            }
            final String _tmpCcyNmUZC;
            if (_cursor.isNull(_cursorIndexOfCcyNmUZC)) {
              _tmpCcyNmUZC = null;
            } else {
              _tmpCcyNmUZC = _cursor.getString(_cursorIndexOfCcyNmUZC);
            }
            final String _tmpCode;
            if (_cursor.isNull(_cursorIndexOfCode)) {
              _tmpCode = null;
            } else {
              _tmpCode = _cursor.getString(_cursorIndexOfCode);
            }
            final String _tmpDate;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmpDate = null;
            } else {
              _tmpDate = _cursor.getString(_cursorIndexOfDate);
            }
            final String _tmpDiff;
            if (_cursor.isNull(_cursorIndexOfDiff)) {
              _tmpDiff = null;
            } else {
              _tmpDiff = _cursor.getString(_cursorIndexOfDiff);
            }
            final String _tmpNominal;
            if (_cursor.isNull(_cursorIndexOfNominal)) {
              _tmpNominal = null;
            } else {
              _tmpNominal = _cursor.getString(_cursorIndexOfNominal);
            }
            final String _tmpRate;
            if (_cursor.isNull(_cursorIndexOfRate)) {
              _tmpRate = null;
            } else {
              _tmpRate = _cursor.getString(_cursorIndexOfRate);
            }
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final byte[] _tmpIconByte;
            if (_cursor.isNull(_cursorIndexOfIconByte)) {
              _tmpIconByte = null;
            } else {
              _tmpIconByte = _cursor.getBlob(_cursorIndexOfIconByte);
            }
            _item = new CurrencyEntity(_tmpCcy,_tmpCcyNmEN,_tmpCcyNmRU,_tmpCcyNmUZ,_tmpCcyNmUZC,_tmpCode,_tmpDate,_tmpDiff,_tmpNominal,_tmpRate,_tmpId,_tmpIconByte);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
