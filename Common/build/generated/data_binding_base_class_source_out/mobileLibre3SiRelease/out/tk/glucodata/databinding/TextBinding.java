// Generated by view binder compiler. Do not edit!
package tk.glucodata.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import tk.glucodata.R;

public final class TextBinding implements ViewBinding {
  @NonNull
  private final TextView rootView;

  @NonNull
  public final TextView content;

  private TextBinding(@NonNull TextView rootView, @NonNull TextView content) {
    this.rootView = rootView;
    this.content = content;
  }

  @Override
  @NonNull
  public TextView getRoot() {
    return rootView;
  }

  @NonNull
  public static TextBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static TextBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.text, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static TextBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    TextView content = (TextView) rootView;

    return new TextBinding((TextView) rootView, content);
  }
}