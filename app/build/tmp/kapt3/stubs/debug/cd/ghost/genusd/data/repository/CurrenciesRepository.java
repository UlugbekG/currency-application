package cd.ghost.genusd.data.repository;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\u001e\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&\u00a8\u0006\t"}, d2 = {"Lcd/ghost/genusd/data/repository/CurrenciesRepository;", "", "getCurrencies", "Lkotlinx/coroutines/flow/Flow;", "", "Lcd/ghost/genusd/data/model/CurrencyModel;", "getCurrenciesByQuery", "str", "", "app_debug"})
public abstract interface CurrenciesRepository {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<cd.ghost.genusd.data.model.CurrencyModel>> getCurrencies();
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<cd.ghost.genusd.data.model.CurrencyModel>> getCurrenciesByQuery(@org.jetbrains.annotations.Nullable
    java.lang.String str);
}