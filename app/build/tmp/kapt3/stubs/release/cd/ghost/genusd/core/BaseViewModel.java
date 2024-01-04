package cd.ghost.genusd.core;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00050\u0006Ja\u0010\u0007\u001a\u00020\b\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00050\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\u000b2!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\f0\u000b\u00a8\u0006\u0014"}, d2 = {"Lcd/ghost/genusd/core/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "asStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "T", "Lkotlinx/coroutines/flow/MutableStateFlow;", "safeLaunch", "", "Lkotlinx/coroutines/flow/Flow;", "result", "Lkotlin/Function1;", "", "progress", "", "errors", "", "Lkotlin/ParameterName;", "name", "throwable", "app_release"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel {
    
    public BaseViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final <T extends java.lang.Object>kotlinx.coroutines.flow.StateFlow<T> asStateFlow(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.MutableStateFlow<T> $this$asStateFlow) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final <T extends java.lang.Object>java.lang.Object safeLaunch(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.Flow<? extends T> $this$safeLaunch, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> result, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> progress, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> errors) {
        return null;
    }
}