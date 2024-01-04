package cd.ghost.genusd.screens;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u001a\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u001c\u001a\u00020\u0012H\u0002J\b\u0010\u001d\u001a\u00020\u0012H\u0002J\u0012\u0010\u001e\u001a\u00020\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u00a8\u0006!"}, d2 = {"Lcd/ghost/genusd/screens/CurrenciesFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Lcd/ghost/genusd/screens/RecyclerAdapter;", "binding", "Lcd/ghost/genusd/databinding/FragmentCurrenciesBinding;", "getBinding", "()Lcd/ghost/genusd/databinding/FragmentCurrenciesBinding;", "binding$delegate", "Lcd/ghost/genusd/core/ViewBindingDelegate;", "viewModel", "Lcd/ghost/genusd/screens/CurrenciesViewModel;", "getViewModel", "()Lcd/ghost/genusd/screens/CurrenciesViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "observeState", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onItemClick", "item", "Lcd/ghost/genusd/data/model/CurrencyModel;", "onViewCreated", "view", "Landroid/view/View;", "setupListeners", "setupRecyclerAdapter", "showErrors", "message", "", "app_debug"})
public final class CurrenciesFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull
    private final cd.ghost.genusd.core.ViewBindingDelegate binding$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    private cd.ghost.genusd.screens.RecyclerAdapter adapter;
    
    public CurrenciesFragment() {
        super();
    }
    
    private final cd.ghost.genusd.databinding.FragmentCurrenciesBinding getBinding() {
        return null;
    }
    
    private final cd.ghost.genusd.screens.CurrenciesViewModel getViewModel() {
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
    
    private final void setupRecyclerAdapter() {
    }
    
    private final void observeState() {
    }
    
    private final void onItemClick(cd.ghost.genusd.data.model.CurrencyModel item) {
    }
    
    private final void showErrors(java.lang.String message) {
    }
}