package cd.ghost.genusd.screens;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0003J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0016\u0010\u0018\u001a\u00020\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001e"}, d2 = {"Lcd/ghost/genusd/screens/CurrenciesViewModel;", "Lcd/ghost/genusd/core/BaseViewModel;", "repository", "Lcd/ghost/genusd/data/repository/CurrenciesRepository;", "resources", "Lcd/ghost/genusd/core/Resources;", "(Lcd/ghost/genusd/data/repository/CurrenciesRepository;Lcd/ghost/genusd/core/Resources;)V", "TAG", "", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcd/ghost/genusd/screens/CurrenciesViewModel$State;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "getCurrencies", "", "setError", "throwable", "", "setProgress", "progress", "", "setResult", "list", "", "Lcd/ghost/genusd/data/model/CurrencyModel;", "State", "UiState", "app_release"})
public final class CurrenciesViewModel extends cd.ghost.genusd.core.BaseViewModel {
    @org.jetbrains.annotations.NotNull
    private final cd.ghost.genusd.data.repository.CurrenciesRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final cd.ghost.genusd.core.Resources resources = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String TAG = "CurrenciesViewModel";
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<cd.ghost.genusd.screens.CurrenciesViewModel.State> _state = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<cd.ghost.genusd.screens.CurrenciesViewModel.State> state = null;
    
    public CurrenciesViewModel(@org.jetbrains.annotations.NotNull
    cd.ghost.genusd.data.repository.CurrenciesRepository repository, @org.jetbrains.annotations.NotNull
    cd.ghost.genusd.core.Resources resources) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<cd.ghost.genusd.screens.CurrenciesViewModel.State> getState() {
        return null;
    }
    
    public final void getCurrencies() {
    }
    
    private final void setResult(java.util.List<cd.ghost.genusd.data.model.CurrencyModel> list) {
    }
    
    private final void setProgress(boolean progress) {
    }
    
    @android.annotation.SuppressLint(value = {"ResourceType"})
    private final void setError(java.lang.Throwable throwable) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J.\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\n\u0010\r\u001a\u0004\u0018\u00010\fH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\u000e"}, d2 = {"Lcd/ghost/genusd/screens/CurrenciesViewModel$State;", "", "isInProgress", "", "()Z", "list", "", "Lcd/ghost/genusd/data/model/CurrencyModel;", "getList", "()Ljava/util/List;", "copy", "errorMessage", "", "getErrorMessage", "app_release"})
    public static abstract interface State {
        
        @org.jetbrains.annotations.NotNull
        public abstract java.util.List<cd.ghost.genusd.data.model.CurrencyModel> getList();
        
        public abstract boolean isInProgress();
        
        @org.jetbrains.annotations.Nullable
        public abstract java.lang.String getErrorMessage();
        
        @org.jetbrains.annotations.NotNull
        public abstract cd.ghost.genusd.screens.CurrenciesViewModel.State copy(@org.jetbrains.annotations.NotNull
        java.util.List<cd.ghost.genusd.data.model.CurrencyModel> list, boolean isInProgress, @org.jetbrains.annotations.Nullable
        java.lang.String errorMessage);
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
        public static final class DefaultImpls {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ(\u0010\u000e\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0016R\u0010\u0010\n\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000bR\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0010"}, d2 = {"Lcd/ghost/genusd/screens/CurrenciesViewModel$UiState;", "Lcd/ghost/genusd/screens/CurrenciesViewModel$State;", "list", "", "Lcd/ghost/genusd/data/model/CurrencyModel;", "isInProgress", "", "errorMessage", "", "(Ljava/util/List;ZLjava/lang/String;)V", "_errorMessage", "()Z", "getList", "()Ljava/util/List;", "copy", "getErrorMessage", "app_release"})
    public static final class UiState implements cd.ghost.genusd.screens.CurrenciesViewModel.State {
        @org.jetbrains.annotations.NotNull
        private final java.util.List<cd.ghost.genusd.data.model.CurrencyModel> list = null;
        private final boolean isInProgress = false;
        @org.jetbrains.annotations.Nullable
        private java.lang.String _errorMessage;
        
        public UiState(@org.jetbrains.annotations.NotNull
        java.util.List<cd.ghost.genusd.data.model.CurrencyModel> list, boolean isInProgress, @org.jetbrains.annotations.Nullable
        java.lang.String errorMessage) {
            super();
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.util.List<cd.ghost.genusd.data.model.CurrencyModel> getList() {
            return null;
        }
        
        @java.lang.Override
        public boolean isInProgress() {
            return false;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.Nullable
        public java.lang.String getErrorMessage() {
            return null;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public cd.ghost.genusd.screens.CurrenciesViewModel.State copy(@org.jetbrains.annotations.NotNull
        java.util.List<cd.ghost.genusd.data.model.CurrencyModel> list, boolean isInProgress, @org.jetbrains.annotations.Nullable
        java.lang.String errorMessage) {
            return null;
        }
        
        public UiState() {
            super();
        }
    }
}