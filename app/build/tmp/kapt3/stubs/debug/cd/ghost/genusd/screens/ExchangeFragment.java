package cd.ghost.genusd.screens;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u0012H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001b"}, d2 = {"Lcd/ghost/genusd/screens/ExchangeFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "binding", "Lcd/ghost/genusd/databinding/FragmentExchangeBinding;", "getBinding", "()Lcd/ghost/genusd/databinding/FragmentExchangeBinding;", "binding$delegate", "Lcd/ghost/genusd/core/ViewBindingDelegate;", "currency", "Lcd/ghost/genusd/data/model/CurrencyModel;", "viewModel", "Lcd/ghost/genusd/screens/ExchangeViewModel;", "getViewModel", "()Lcd/ghost/genusd/screens/ExchangeViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "setupListeners", "Companion", "ExchangeData", "app_debug"})
public final class ExchangeFragment extends androidx.fragment.app.DialogFragment {
    @org.jetbrains.annotations.NotNull
    private final cd.ghost.genusd.core.ViewBindingDelegate binding$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.Nullable
    private cd.ghost.genusd.data.model.CurrencyModel currency;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ARG_1 = "EXCHANGE_ARG_1";
    @org.jetbrains.annotations.NotNull
    public static final cd.ghost.genusd.screens.ExchangeFragment.Companion Companion = null;
    
    public ExchangeFragment() {
        super();
    }
    
    private final cd.ghost.genusd.databinding.FragmentExchangeBinding getBinding() {
        return null;
    }
    
    private final cd.ghost.genusd.screens.ExchangeViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupListeners() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcd/ghost/genusd/screens/ExchangeFragment$Companion;", "", "()V", "ARG_1", "", "newInstance", "Lcd/ghost/genusd/screens/ExchangeFragment;", "data", "Lcd/ghost/genusd/data/model/CurrencyModel;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final cd.ghost.genusd.screens.ExchangeFragment newInstance(@org.jetbrains.annotations.NotNull
        cd.ghost.genusd.data.model.CurrencyModel data) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcd/ghost/genusd/screens/ExchangeFragment$ExchangeData;", "Ljava/io/Serializable;", "data", "Lcd/ghost/genusd/data/model/CurrencyModel;", "(Lcd/ghost/genusd/data/model/CurrencyModel;)V", "getData", "()Lcd/ghost/genusd/data/model/CurrencyModel;", "app_debug"})
    public static final class ExchangeData implements java.io.Serializable {
        @org.jetbrains.annotations.NotNull
        private final cd.ghost.genusd.data.model.CurrencyModel data = null;
        
        public ExchangeData(@org.jetbrains.annotations.NotNull
        cd.ghost.genusd.data.model.CurrencyModel data) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final cd.ghost.genusd.data.model.CurrencyModel getData() {
            return null;
        }
    }
}