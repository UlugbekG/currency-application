package cd.ghost.genusd.data.repository;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bH\u0016J\u001e\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcd/ghost/genusd/data/repository/RepositoryImp;", "Lcd/ghost/genusd/data/repository/CurrenciesRepository;", "apiService", "Lcd/ghost/genusd/data/networking/CurrencyApiService;", "currencyDao", "Lcd/ghost/genusd/data/database/CurrencyDao;", "bitmapLoader", "Lcom/bumptech/glide/RequestBuilder;", "Landroid/graphics/Bitmap;", "(Lcd/ghost/genusd/data/networking/CurrencyApiService;Lcd/ghost/genusd/data/database/CurrencyDao;Lcom/bumptech/glide/RequestBuilder;)V", "getCurrencies", "Lkotlinx/coroutines/flow/Flow;", "", "Lcd/ghost/genusd/data/model/CurrencyModel;", "getCurrenciesByQuery", "str", "", "getDataQuery", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFromDB", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public final class RepositoryImp implements cd.ghost.genusd.data.repository.CurrenciesRepository {
    @org.jetbrains.annotations.NotNull
    private final cd.ghost.genusd.data.networking.CurrencyApiService apiService = null;
    @org.jetbrains.annotations.NotNull
    private final cd.ghost.genusd.data.database.CurrencyDao currencyDao = null;
    @org.jetbrains.annotations.NotNull
    private final com.bumptech.glide.RequestBuilder<android.graphics.Bitmap> bitmapLoader = null;
    
    public RepositoryImp(@org.jetbrains.annotations.NotNull
    cd.ghost.genusd.data.networking.CurrencyApiService apiService, @org.jetbrains.annotations.NotNull
    cd.ghost.genusd.data.database.CurrencyDao currencyDao, @org.jetbrains.annotations.NotNull
    com.bumptech.glide.RequestBuilder<android.graphics.Bitmap> bitmapLoader) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<java.util.List<cd.ghost.genusd.data.model.CurrencyModel>> getCurrencies() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<java.util.List<cd.ghost.genusd.data.model.CurrencyModel>> getCurrenciesByQuery(@org.jetbrains.annotations.Nullable
    java.lang.String str) {
        return null;
    }
    
    private final java.lang.Object getDataQuery(java.lang.String str, kotlin.coroutines.Continuation<? super java.util.List<cd.ghost.genusd.data.model.CurrencyModel>> $completion) {
        return null;
    }
    
    private final java.lang.Object getFromDB(kotlin.coroutines.Continuation<? super java.util.List<cd.ghost.genusd.data.model.CurrencyModel>> $completion) {
        return null;
    }
}