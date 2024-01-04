// Generated by view binder compiler. Do not edit!
package cd.ghost.genusd.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import cd.ghost.genusd.R;
import cd.ghost.genusd.screens.view.ExchangeView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentExchangeBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final ExchangeView exchangeView;

  private FragmentExchangeBinding(@NonNull FrameLayout rootView,
      @NonNull ExchangeView exchangeView) {
    this.rootView = rootView;
    this.exchangeView = exchangeView;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentExchangeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentExchangeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_exchange, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentExchangeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.exchangeView;
      ExchangeView exchangeView = ViewBindings.findChildViewById(rootView, id);
      if (exchangeView == null) {
        break missingId;
      }

      return new FragmentExchangeBinding((FrameLayout) rootView, exchangeView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
