package cd.ghost.genusd.screens.view;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tJ\u0014\u0010\u001b\u001a\u00020\u00132\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\u0010\u0010\u001d\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\rJ \u0010\u001e\u001a\u00020\u00132\u0018\u0010\u001f\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00130\u0017j\u0002`\u0018J\u000e\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u0015J\u000e\u0010\"\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u0015J \u0010#\u001a\u00020\u00132\u0018\u0010\u001f\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00130\u0017j\u0002`\u0018J\b\u0010$\u001a\u00020\u0013H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u0016\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u001a\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcd/ghost/genusd/screens/view/ExchangeView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "binding", "Lcd/ghost/genusd/databinding/ViewExchangeBinding;", "currency", "Lcd/ghost/genusd/data/model/CurrencyModel;", "edSCcyWatcher", "Landroid/text/TextWatcher;", "edUzCcyWatcher", "onCancel", "Lkotlin/Function0;", "", "sCcy", "", "sCcyListener", "Lkotlin/Function1;", "Lcd/ghost/genusd/screens/view/TextListener;", "uzCcy", "uzCcyListener", "onCloseListener", "block", "setData", "setSCcyTextListener", "listener", "setTextCcyUz", "str", "setTextSCcy", "setUzCcyTextListener", "setupListeners", "app_debug"})
public final class ExchangeView extends android.widget.LinearLayout {
    @org.jetbrains.annotations.NotNull
    private cd.ghost.genusd.databinding.ViewExchangeBinding binding;
    @org.jetbrains.annotations.Nullable
    private cd.ghost.genusd.data.model.CurrencyModel currency;
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> sCcyListener;
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> uzCcyListener;
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function0<kotlin.Unit> onCancel;
    private android.text.TextWatcher edUzCcyWatcher;
    private android.text.TextWatcher edSCcyWatcher;
    @org.jetbrains.annotations.NotNull
    private java.lang.String uzCcy = "";
    @org.jetbrains.annotations.NotNull
    private java.lang.String sCcy = "";
    
    @kotlin.jvm.JvmOverloads
    public ExchangeView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(null);
    }
    
    public final void setSCcyTextListener(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> listener) {
    }
    
    public final void setUzCcyTextListener(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> listener) {
    }
    
    public final void setTextCcyUz(@org.jetbrains.annotations.NotNull
    java.lang.String str) {
    }
    
    public final void setTextSCcy(@org.jetbrains.annotations.NotNull
    java.lang.String str) {
    }
    
    public final void onCloseListener(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> block) {
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable
    cd.ghost.genusd.data.model.CurrencyModel currency) {
    }
    
    private final void setupListeners() {
    }
    
    @kotlin.jvm.JvmOverloads
    public ExchangeView(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public ExchangeView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public ExchangeView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
}