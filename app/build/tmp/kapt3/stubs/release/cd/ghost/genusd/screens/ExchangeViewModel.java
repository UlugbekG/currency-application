package cd.ghost.genusd.screens;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0012\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0013\u001a\u00020\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f\u00a8\u0006\u0015"}, d2 = {"Lcd/ghost/genusd/screens/ExchangeViewModel;", "Lcd/ghost/genusd/core/BaseViewModel;", "()V", "_sCcy", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_uzCcy", "currency", "Lcd/ghost/genusd/data/model/CurrencyModel;", "sCcy", "Lkotlinx/coroutines/flow/StateFlow;", "getSCcy", "()Lkotlinx/coroutines/flow/StateFlow;", "uzCcy", "getUzCcy", "calculateSCcy", "", "str", "calculateUzCcy", "setCurrency", "Companion", "app_release"})
public final class ExchangeViewModel extends cd.ghost.genusd.core.BaseViewModel {
    @org.jetbrains.annotations.Nullable
    private cd.ghost.genusd.data.model.CurrencyModel currency;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _sCcy = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> sCcy = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _uzCcy = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> uzCcy = null;
    @org.jetbrains.annotations.NotNull
    @java.lang.Deprecated
    public static final java.lang.String BLANK = "";
    @org.jetbrains.annotations.NotNull
    private static final cd.ghost.genusd.screens.ExchangeViewModel.Companion Companion = null;
    
    public ExchangeViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getSCcy() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getUzCcy() {
        return null;
    }
    
    public final void setCurrency(@org.jetbrains.annotations.Nullable
    cd.ghost.genusd.data.model.CurrencyModel currency) {
    }
    
    public final void calculateUzCcy(@org.jetbrains.annotations.Nullable
    java.lang.String str) {
    }
    
    public final void calculateSCcy(@org.jetbrains.annotations.Nullable
    java.lang.String str) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcd/ghost/genusd/screens/ExchangeViewModel$Companion;", "", "()V", "BLANK", "", "app_release"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}