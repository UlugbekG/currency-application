// Generated by view binder compiler. Do not edit!
package cd.ghost.genusd.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import cd.ghost.genusd.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ViewExchangeBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageButton btnClose;

  @NonNull
  public final EditText edSCcy;

  @NonNull
  public final EditText edUzCcy;

  @NonNull
  public final ImageView ivFlag;

  @NonNull
  public final TextView tvCcy;

  @NonNull
  public final TextView tvDiff;

  @NonNull
  public final TextView tvFullName;

  @NonNull
  public final TextView tvLastUpdate;

  @NonNull
  public final TextView tvRate;

  @NonNull
  public final TextView tvShortName;

  @NonNull
  public final TextView tvUzCcy;

  private ViewExchangeBinding(@NonNull LinearLayout rootView, @NonNull ImageButton btnClose,
      @NonNull EditText edSCcy, @NonNull EditText edUzCcy, @NonNull ImageView ivFlag,
      @NonNull TextView tvCcy, @NonNull TextView tvDiff, @NonNull TextView tvFullName,
      @NonNull TextView tvLastUpdate, @NonNull TextView tvRate, @NonNull TextView tvShortName,
      @NonNull TextView tvUzCcy) {
    this.rootView = rootView;
    this.btnClose = btnClose;
    this.edSCcy = edSCcy;
    this.edUzCcy = edUzCcy;
    this.ivFlag = ivFlag;
    this.tvCcy = tvCcy;
    this.tvDiff = tvDiff;
    this.tvFullName = tvFullName;
    this.tvLastUpdate = tvLastUpdate;
    this.tvRate = tvRate;
    this.tvShortName = tvShortName;
    this.tvUzCcy = tvUzCcy;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ViewExchangeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ViewExchangeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.view_exchange, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ViewExchangeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnClose;
      ImageButton btnClose = ViewBindings.findChildViewById(rootView, id);
      if (btnClose == null) {
        break missingId;
      }

      id = R.id.edSCcy;
      EditText edSCcy = ViewBindings.findChildViewById(rootView, id);
      if (edSCcy == null) {
        break missingId;
      }

      id = R.id.ed_uz_ccy;
      EditText edUzCcy = ViewBindings.findChildViewById(rootView, id);
      if (edUzCcy == null) {
        break missingId;
      }

      id = R.id.ivFlag;
      ImageView ivFlag = ViewBindings.findChildViewById(rootView, id);
      if (ivFlag == null) {
        break missingId;
      }

      id = R.id.tvCcy;
      TextView tvCcy = ViewBindings.findChildViewById(rootView, id);
      if (tvCcy == null) {
        break missingId;
      }

      id = R.id.tvDiff;
      TextView tvDiff = ViewBindings.findChildViewById(rootView, id);
      if (tvDiff == null) {
        break missingId;
      }

      id = R.id.tvFullName;
      TextView tvFullName = ViewBindings.findChildViewById(rootView, id);
      if (tvFullName == null) {
        break missingId;
      }

      id = R.id.tvLastUpdate;
      TextView tvLastUpdate = ViewBindings.findChildViewById(rootView, id);
      if (tvLastUpdate == null) {
        break missingId;
      }

      id = R.id.tvRate;
      TextView tvRate = ViewBindings.findChildViewById(rootView, id);
      if (tvRate == null) {
        break missingId;
      }

      id = R.id.tvShortName;
      TextView tvShortName = ViewBindings.findChildViewById(rootView, id);
      if (tvShortName == null) {
        break missingId;
      }

      id = R.id.tvUzCcy;
      TextView tvUzCcy = ViewBindings.findChildViewById(rootView, id);
      if (tvUzCcy == null) {
        break missingId;
      }

      return new ViewExchangeBinding((LinearLayout) rootView, btnClose, edSCcy, edUzCcy, ivFlag,
          tvCcy, tvDiff, tvFullName, tvLastUpdate, tvRate, tvShortName, tvUzCcy);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}