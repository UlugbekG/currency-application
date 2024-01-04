package cd.ghost.genusd.screens;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001bB(\u0012!\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\u0002\u0010\nJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u00020\t2\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010H\u0016J\u0016\u0010\u0018\u001a\u00020\t2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u001aH\u0007R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R,\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001c"}, d2 = {"Lcd/ghost/genusd/screens/RecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcd/ghost/genusd/screens/RecyclerAdapter$ViewHolder;", "onItemClick", "Lkotlin/Function1;", "Lcd/ghost/genusd/data/model/CurrencyModel;", "Lkotlin/ParameterName;", "name", "item", "", "(Lkotlin/jvm/functions/Function1;)V", "list", "Ljava/util/ArrayList;", "getOnItemClick", "()Lkotlin/jvm/functions/Function1;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "submitList", "newList", "", "ViewHolder", "app_release"})
public final class RecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<cd.ghost.genusd.screens.RecyclerAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<cd.ghost.genusd.data.model.CurrencyModel, kotlin.Unit> onItemClick = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<cd.ghost.genusd.data.model.CurrencyModel> list = null;
    
    public RecyclerAdapter(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super cd.ghost.genusd.data.model.CurrencyModel, kotlin.Unit> onItemClick) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function1<cd.ghost.genusd.data.model.CurrencyModel, kotlin.Unit> getOnItemClick() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void submitList(@org.jetbrains.annotations.NotNull
    java.util.List<cd.ghost.genusd.data.model.CurrencyModel> newList) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public cd.ghost.genusd.screens.RecyclerAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    cd.ghost.genusd.screens.RecyclerAdapter.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcd/ghost/genusd/screens/RecyclerAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcd/ghost/genusd/databinding/ItemLayoutBinding;", "(Lcd/ghost/genusd/screens/RecyclerAdapter;Lcd/ghost/genusd/databinding/ItemLayoutBinding;)V", "onBind", "", "item", "Lcd/ghost/genusd/data/model/CurrencyModel;", "app_release"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final cd.ghost.genusd.databinding.ItemLayoutBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        cd.ghost.genusd.databinding.ItemLayoutBinding binding) {
            super(null);
        }
        
        @android.annotation.SuppressLint(value = {"SetTextI18n", "ResourceAsColor"})
        public final void onBind(@org.jetbrains.annotations.NotNull
        cd.ghost.genusd.data.model.CurrencyModel item) {
        }
    }
}