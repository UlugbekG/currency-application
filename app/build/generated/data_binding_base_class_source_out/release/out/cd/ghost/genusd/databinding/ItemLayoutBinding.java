// Generated by view binder compiler. Do not edit!
package cd.ghost.genusd.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class ItemLayoutBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView ivFlag;

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

  private ItemLayoutBinding(@NonNull LinearLayout rootView, @NonNull ImageView ivFlag,
      @NonNull TextView tvDiff, @NonNull TextView tvFullName, @NonNull TextView tvLastUpdate,
      @NonNull TextView tvRate, @NonNull TextView tvShortName) {
    this.rootView = rootView;
    this.ivFlag = ivFlag;
    this.tvDiff = tvDiff;
    this.tvFullName = tvFullName;
    this.tvLastUpdate = tvLastUpdate;
    this.tvRate = tvRate;
    this.tvShortName = tvShortName;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ivFlag;
      ImageView ivFlag = ViewBindings.findChildViewById(rootView, id);
      if (ivFlag == null) {
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

      return new ItemLayoutBinding((LinearLayout) rootView, ivFlag, tvDiff, tvFullName,
          tvLastUpdate, tvRate, tvShortName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
