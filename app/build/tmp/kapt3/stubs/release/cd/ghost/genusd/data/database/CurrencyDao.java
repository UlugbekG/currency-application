package cd.ghost.genusd.data.database;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\f\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcd/ghost/genusd/data/database/CurrencyDao;", "", "deleteAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getByQuery", "", "Lcd/ghost/genusd/data/database/CurrencyEntity;", "str", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrencies", "insert", "list", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withTransaction", "app_release"})
@androidx.room.Dao
public abstract interface CurrencyDao {
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull
    java.util.List<cd.ghost.genusd.data.database.CurrencyEntity> list, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM `currency-table`")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getCurrencies(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<cd.ghost.genusd.data.database.CurrencyEntity>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM `currency-table` WHERE LOWER(ccy) LIKE LOWER(:str) OR LOWER(ccyNmUZ) LIKE LOWER(:str)")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getByQuery(@org.jetbrains.annotations.NotNull
    java.lang.String str, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<cd.ghost.genusd.data.database.CurrencyEntity>> $completion);
    
    @androidx.room.Transaction
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object withTransaction(@org.jetbrains.annotations.NotNull
    java.util.List<cd.ghost.genusd.data.database.CurrencyEntity> list, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM `currency-table`")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteAll(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
        
        @androidx.room.Transaction
        @org.jetbrains.annotations.Nullable
        public static java.lang.Object withTransaction(@org.jetbrains.annotations.NotNull
        cd.ghost.genusd.data.database.CurrencyDao $this, @org.jetbrains.annotations.NotNull
        java.util.List<cd.ghost.genusd.data.database.CurrencyEntity> list, @org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
            return null;
        }
    }
}