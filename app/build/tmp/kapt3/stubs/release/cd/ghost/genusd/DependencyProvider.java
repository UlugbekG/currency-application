package cd.ghost.genusd;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R)\u0010\u000e\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0012\u0010\u0013R#\u0010\u0015\u001a\n \u0011*\u0004\u0018\u00010\u00160\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u001b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u000b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001f\u001a\u00020 8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b#\u0010\u000b\u001a\u0004\b!\u0010\"\u00a8\u0006\'"}, d2 = {"Lcd/ghost/genusd/DependencyProvider;", "", "()V", "BASE_URL", "", "DB_NAME", "appDatabase", "Lcd/ghost/genusd/data/database/AppDatabase;", "getAppDatabase", "()Lcd/ghost/genusd/data/database/AppDatabase;", "appDatabase$delegate", "Lkotlin/Lazy;", "applicationContext", "Landroid/content/Context;", "bitmapLoader", "Lcom/bumptech/glide/RequestBuilder;", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "getBitmapLoader", "()Lcom/bumptech/glide/RequestBuilder;", "bitmapLoader$delegate", "client", "Lretrofit2/Retrofit;", "getClient", "()Lretrofit2/Retrofit;", "client$delegate", "repository", "Lcd/ghost/genusd/data/repository/CurrenciesRepository;", "getRepository", "()Lcd/ghost/genusd/data/repository/CurrenciesRepository;", "repository$delegate", "resources", "Lcd/ghost/genusd/core/Resources;", "getResources", "()Lcd/ghost/genusd/core/Resources;", "resources$delegate", "init", "", "context", "app_release"})
public final class DependencyProvider {
    private static android.content.Context applicationContext;
    @org.jetbrains.annotations.NotNull
    private static final kotlin.Lazy client$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final kotlin.Lazy appDatabase$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final kotlin.Lazy bitmapLoader$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final kotlin.Lazy repository$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final kotlin.Lazy resources$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String BASE_URL = "http://cbu.uz/";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String DB_NAME = "cd-ghost-db-currency";
    @org.jetbrains.annotations.NotNull
    public static final cd.ghost.genusd.DependencyProvider INSTANCE = null;
    
    private DependencyProvider() {
        super();
    }
    
    private final retrofit2.Retrofit getClient() {
        return null;
    }
    
    private final cd.ghost.genusd.data.database.AppDatabase getAppDatabase() {
        return null;
    }
    
    private final com.bumptech.glide.RequestBuilder<android.graphics.Bitmap> getBitmapLoader() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final cd.ghost.genusd.data.repository.CurrenciesRepository getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final cd.ghost.genusd.core.Resources getResources() {
        return null;
    }
    
    public final void init(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
}