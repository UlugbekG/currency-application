package cd.ghost.genusd.data.database;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u000eH\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\u0083\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00c6\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u00101\u001a\u00020\u000eH\u0016J\u0006\u00102\u001a\u000203J\t\u00104\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013\u00a8\u00065"}, d2 = {"Lcd/ghost/genusd/data/database/CurrencyEntity;", "", "ccy", "", "ccyNmEN", "ccyNmRU", "ccyNmUZ", "ccyNmUZC", "code", "date", "diff", "nominal", "rate", "id", "", "iconByte", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I[B)V", "getCcy", "()Ljava/lang/String;", "getCcyNmEN", "getCcyNmRU", "getCcyNmUZ", "getCcyNmUZC", "getCode", "getDate", "getDiff", "getIconByte", "()[B", "getId", "()I", "getNominal", "getRate", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toCurrencyModel", "Lcd/ghost/genusd/data/model/CurrencyModel;", "toString", "app_debug"})
@androidx.room.Entity(tableName = "currency-table")
public final class CurrencyEntity {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ccy = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ccyNmEN = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ccyNmRU = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ccyNmUZ = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ccyNmUZC = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String code = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String date = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String diff = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String nominal = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String rate = null;
    @androidx.room.PrimaryKey
    private final int id = 0;
    @org.jetbrains.annotations.Nullable
    private final byte[] iconByte = null;
    
    public CurrencyEntity(@org.jetbrains.annotations.NotNull
    java.lang.String ccy, @org.jetbrains.annotations.NotNull
    java.lang.String ccyNmEN, @org.jetbrains.annotations.NotNull
    java.lang.String ccyNmRU, @org.jetbrains.annotations.NotNull
    java.lang.String ccyNmUZ, @org.jetbrains.annotations.NotNull
    java.lang.String ccyNmUZC, @org.jetbrains.annotations.NotNull
    java.lang.String code, @org.jetbrains.annotations.NotNull
    java.lang.String date, @org.jetbrains.annotations.NotNull
    java.lang.String diff, @org.jetbrains.annotations.NotNull
    java.lang.String nominal, @org.jetbrains.annotations.NotNull
    java.lang.String rate, int id, @org.jetbrains.annotations.Nullable
    byte[] iconByte) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCcy() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCcyNmEN() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCcyNmRU() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCcyNmUZ() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCcyNmUZC() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDiff() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNominal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRate() {
        return null;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final byte[] getIconByte() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final cd.ghost.genusd.data.model.CurrencyModel toCurrencyModel() {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component10() {
        return null;
    }
    
    public final int component11() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final byte[] component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final cd.ghost.genusd.data.database.CurrencyEntity copy(@org.jetbrains.annotations.NotNull
    java.lang.String ccy, @org.jetbrains.annotations.NotNull
    java.lang.String ccyNmEN, @org.jetbrains.annotations.NotNull
    java.lang.String ccyNmRU, @org.jetbrains.annotations.NotNull
    java.lang.String ccyNmUZ, @org.jetbrains.annotations.NotNull
    java.lang.String ccyNmUZC, @org.jetbrains.annotations.NotNull
    java.lang.String code, @org.jetbrains.annotations.NotNull
    java.lang.String date, @org.jetbrains.annotations.NotNull
    java.lang.String diff, @org.jetbrains.annotations.NotNull
    java.lang.String nominal, @org.jetbrains.annotations.NotNull
    java.lang.String rate, int id, @org.jetbrains.annotations.Nullable
    byte[] iconByte) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}