package cd.ghost.genusd.data.database;

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
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile CurrencyDao _currencyDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `currency-table` (`ccy` TEXT NOT NULL, `ccyNmEN` TEXT NOT NULL, `ccyNmRU` TEXT NOT NULL, `ccyNmUZ` TEXT NOT NULL, `ccyNmUZC` TEXT NOT NULL, `code` TEXT NOT NULL, `date` TEXT NOT NULL, `diff` TEXT NOT NULL, `nominal` TEXT NOT NULL, `rate` TEXT NOT NULL, `id` INTEGER NOT NULL, `iconByte` BLOB, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'afc72c871a46f25a8d305559bf596d66')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `currency-table`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      public void onCreate(SupportSQLiteDatabase _db) {
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
      public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsCurrencyTable = new HashMap<String, TableInfo.Column>(12);
        _columnsCurrencyTable.put("ccy", new TableInfo.Column("ccy", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrencyTable.put("ccyNmEN", new TableInfo.Column("ccyNmEN", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrencyTable.put("ccyNmRU", new TableInfo.Column("ccyNmRU", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrencyTable.put("ccyNmUZ", new TableInfo.Column("ccyNmUZ", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrencyTable.put("ccyNmUZC", new TableInfo.Column("ccyNmUZC", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrencyTable.put("code", new TableInfo.Column("code", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrencyTable.put("date", new TableInfo.Column("date", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrencyTable.put("diff", new TableInfo.Column("diff", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrencyTable.put("nominal", new TableInfo.Column("nominal", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrencyTable.put("rate", new TableInfo.Column("rate", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrencyTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrencyTable.put("iconByte", new TableInfo.Column("iconByte", "BLOB", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCurrencyTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCurrencyTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCurrencyTable = new TableInfo("currency-table", _columnsCurrencyTable, _foreignKeysCurrencyTable, _indicesCurrencyTable);
        final TableInfo _existingCurrencyTable = TableInfo.read(_db, "currency-table");
        if (! _infoCurrencyTable.equals(_existingCurrencyTable)) {
          return new RoomOpenHelper.ValidationResult(false, "currency-table(cd.ghost.genusd.data.database.CurrencyEntity).\n"
                  + " Expected:\n" + _infoCurrencyTable + "\n"
                  + " Found:\n" + _existingCurrencyTable);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "afc72c871a46f25a8d305559bf596d66", "9737f3267a86807b16b75421229a14cd");
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
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "currency-table");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `currency-table`");
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
    _typeConvertersMap.put(CurrencyDao.class, CurrencyDao_Impl.getRequiredConverters());
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
  public CurrencyDao currencyDao() {
    if (_currencyDao != null) {
      return _currencyDao;
    } else {
      synchronized(this) {
        if(_currencyDao == null) {
          _currencyDao = new CurrencyDao_Impl(this);
        }
        return _currencyDao;
      }
    }
  }
}
