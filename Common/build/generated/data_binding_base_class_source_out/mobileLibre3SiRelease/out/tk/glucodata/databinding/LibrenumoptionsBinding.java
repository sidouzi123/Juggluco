// Generated by view binder compiler. Do not edit!
package tk.glucodata.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import tk.glucodata.R;
import tk.glucodata.measuredgrid;

public final class LibrenumoptionsBinding implements ViewBinding {
  @NonNull
  private final measuredgrid rootView;

  @NonNull
  public final Button close;

  @NonNull
  public final RadioButton dont;

  @NonNull
  public final RadioButton food;

  @NonNull
  public final RadioGroup group;

  @NonNull
  public final Button help;

  @NonNull
  public final TextView label;

  @NonNull
  public final measuredgrid librenum;

  @NonNull
  public final RadioButton longacting;

  @NonNull
  public final RadioButton note;

  @NonNull
  public final RadioButton rapidacting;

  @NonNull
  public final Button save;

  @NonNull
  public final EditText weight;

  @NonNull
  public final TextView weightlabel;

  private LibrenumoptionsBinding(@NonNull measuredgrid rootView, @NonNull Button close,
      @NonNull RadioButton dont, @NonNull RadioButton food, @NonNull RadioGroup group,
      @NonNull Button help, @NonNull TextView label, @NonNull measuredgrid librenum,
      @NonNull RadioButton longacting, @NonNull RadioButton note, @NonNull RadioButton rapidacting,
      @NonNull Button save, @NonNull EditText weight, @NonNull TextView weightlabel) {
    this.rootView = rootView;
    this.close = close;
    this.dont = dont;
    this.food = food;
    this.group = group;
    this.help = help;
    this.label = label;
    this.librenum = librenum;
    this.longacting = longacting;
    this.note = note;
    this.rapidacting = rapidacting;
    this.save = save;
    this.weight = weight;
    this.weightlabel = weightlabel;
  }

  @Override
  @NonNull
  public measuredgrid getRoot() {
    return rootView;
  }

  @NonNull
  public static LibrenumoptionsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LibrenumoptionsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.librenumoptions, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LibrenumoptionsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.close;
      Button close = ViewBindings.findChildViewById(rootView, id);
      if (close == null) {
        break missingId;
      }

      id = R.id.dont;
      RadioButton dont = ViewBindings.findChildViewById(rootView, id);
      if (dont == null) {
        break missingId;
      }

      id = R.id.food;
      RadioButton food = ViewBindings.findChildViewById(rootView, id);
      if (food == null) {
        break missingId;
      }

      id = R.id.group;
      RadioGroup group = ViewBindings.findChildViewById(rootView, id);
      if (group == null) {
        break missingId;
      }

      id = R.id.help;
      Button help = ViewBindings.findChildViewById(rootView, id);
      if (help == null) {
        break missingId;
      }

      id = R.id.label;
      TextView label = ViewBindings.findChildViewById(rootView, id);
      if (label == null) {
        break missingId;
      }

      measuredgrid librenum = (measuredgrid) rootView;

      id = R.id.longacting;
      RadioButton longacting = ViewBindings.findChildViewById(rootView, id);
      if (longacting == null) {
        break missingId;
      }

      id = R.id.note;
      RadioButton note = ViewBindings.findChildViewById(rootView, id);
      if (note == null) {
        break missingId;
      }

      id = R.id.rapidacting;
      RadioButton rapidacting = ViewBindings.findChildViewById(rootView, id);
      if (rapidacting == null) {
        break missingId;
      }

      id = R.id.save;
      Button save = ViewBindings.findChildViewById(rootView, id);
      if (save == null) {
        break missingId;
      }

      id = R.id.weight;
      EditText weight = ViewBindings.findChildViewById(rootView, id);
      if (weight == null) {
        break missingId;
      }

      id = R.id.weightlabel;
      TextView weightlabel = ViewBindings.findChildViewById(rootView, id);
      if (weightlabel == null) {
        break missingId;
      }

      return new LibrenumoptionsBinding((measuredgrid) rootView, close, dont, food, group, help,
          label, librenum, longacting, note, rapidacting, save, weight, weightlabel);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}