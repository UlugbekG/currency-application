package cd.ghost.genusd.screens;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0014"}, d2 = {"Lcd/ghost/genusd/screens/SearchViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcd/ghost/genusd/data/repository/CurrenciesRepository;", "(Lcd/ghost/genusd/data/repository/CurrenciesRepository;)V", "_state", "Landroidx/lifecycle/MutableLiveData;", "Lcd/ghost/genusd/screens/SearchViewModel$State;", "kotlin.jvm.PlatformType", "searchJob", "Lkotlinx/coroutines/Job;", "state", "Landroidx/lifecycle/LiveData;", "getState", "()Landroidx/lifecycle/LiveData;", "search", "", "str", "", "State", "app_debug"})
public final class SearchViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final cd.ghost.genusd.data.repository.CurrenciesRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<cd.ghost.genusd.screens.SearchViewModel.State> _state = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<cd.ghost.genusd.screens.SearchViewModel.State> state = null;
    @org.jetbrains.annotations.Nullable
    private kotlinx.coroutines.Job searchJob;
    
    public SearchViewModel(@org.jetbrains.annotations.NotNull
    cd.ghost.genusd.data.repository.CurrenciesRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<cd.ghost.genusd.screens.SearchViewModel.State> getState() {
        return null;
    }
    
    public final void search(@org.jetbrains.annotations.Nullable
    java.lang.String str) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u00c6\u0003J/\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\bH\u00d6\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lcd/ghost/genusd/screens/SearchViewModel$State;", "", "list", "", "Lcd/ghost/genusd/data/model/CurrencyModel;", "isLoading", "", "error", "", "(Ljava/util/List;ZLjava/lang/String;)V", "getError", "()Ljava/lang/String;", "()Z", "getList", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
    public static final class State {
        @org.jetbrains.annotations.NotNull
        private final java.util.List<cd.ghost.genusd.data.model.CurrencyModel> list = null;
        private final boolean isLoading = false;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String error = null;
        
        public State(@org.jetbrains.annotations.NotNull
        java.util.List<cd.ghost.genusd.data.model.CurrencyModel> list, boolean isLoading, @org.jetbrains.annotations.Nullable
        java.lang.String error) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<cd.ghost.genusd.data.model.CurrencyModel> getList() {
            return null;
        }
        
        public final boolean isLoading() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getError() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<cd.ghost.genusd.data.model.CurrencyModel> component1() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final cd.ghost.genusd.screens.SearchViewModel.State copy(@org.jetbrains.annotations.NotNull
        java.util.List<cd.ghost.genusd.data.model.CurrencyModel> list, boolean isLoading, @org.jetbrains.annotations.Nullable
        java.lang.String error) {
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
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
    }
}