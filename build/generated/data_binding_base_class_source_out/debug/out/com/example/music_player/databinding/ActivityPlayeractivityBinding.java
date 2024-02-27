// Generated by view binder compiler. Do not edit!
package com.example.music_player.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.music_player.R;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityPlayeractivityBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ExtendedFloatingActionButton PlayPausebtn;

  @NonNull
  public final ShapeableImageView SongImagePa;

  @NonNull
  public final TextView SongNamePa;

  @NonNull
  public final TextView TvseekBarending;

  @NonNull
  public final TextView TvseekBarstart;

  @NonNull
  public final ImageButton backBtnPA;

  @NonNull
  public final ExtendedFloatingActionButton nextbtnPA;

  @NonNull
  public final ExtendedFloatingActionButton previosbtnPA;

  @NonNull
  public final AppCompatSeekBar seekBarPA;

  private ActivityPlayeractivityBinding(@NonNull LinearLayout rootView,
      @NonNull ExtendedFloatingActionButton PlayPausebtn, @NonNull ShapeableImageView SongImagePa,
      @NonNull TextView SongNamePa, @NonNull TextView TvseekBarending,
      @NonNull TextView TvseekBarstart, @NonNull ImageButton backBtnPA,
      @NonNull ExtendedFloatingActionButton nextbtnPA,
      @NonNull ExtendedFloatingActionButton previosbtnPA, @NonNull AppCompatSeekBar seekBarPA) {
    this.rootView = rootView;
    this.PlayPausebtn = PlayPausebtn;
    this.SongImagePa = SongImagePa;
    this.SongNamePa = SongNamePa;
    this.TvseekBarending = TvseekBarending;
    this.TvseekBarstart = TvseekBarstart;
    this.backBtnPA = backBtnPA;
    this.nextbtnPA = nextbtnPA;
    this.previosbtnPA = previosbtnPA;
    this.seekBarPA = seekBarPA;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPlayeractivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPlayeractivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_playeractivity, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPlayeractivityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.PlayPausebtn;
      ExtendedFloatingActionButton PlayPausebtn = ViewBindings.findChildViewById(rootView, id);
      if (PlayPausebtn == null) {
        break missingId;
      }

      id = R.id.SongImagePa;
      ShapeableImageView SongImagePa = ViewBindings.findChildViewById(rootView, id);
      if (SongImagePa == null) {
        break missingId;
      }

      id = R.id.SongNamePa;
      TextView SongNamePa = ViewBindings.findChildViewById(rootView, id);
      if (SongNamePa == null) {
        break missingId;
      }

      id = R.id.TvseekBarending;
      TextView TvseekBarending = ViewBindings.findChildViewById(rootView, id);
      if (TvseekBarending == null) {
        break missingId;
      }

      id = R.id.TvseekBarstart;
      TextView TvseekBarstart = ViewBindings.findChildViewById(rootView, id);
      if (TvseekBarstart == null) {
        break missingId;
      }

      id = R.id.backBtnPA;
      ImageButton backBtnPA = ViewBindings.findChildViewById(rootView, id);
      if (backBtnPA == null) {
        break missingId;
      }

      id = R.id.nextbtnPA;
      ExtendedFloatingActionButton nextbtnPA = ViewBindings.findChildViewById(rootView, id);
      if (nextbtnPA == null) {
        break missingId;
      }

      id = R.id.previosbtnPA;
      ExtendedFloatingActionButton previosbtnPA = ViewBindings.findChildViewById(rootView, id);
      if (previosbtnPA == null) {
        break missingId;
      }

      id = R.id.seekBarPA;
      AppCompatSeekBar seekBarPA = ViewBindings.findChildViewById(rootView, id);
      if (seekBarPA == null) {
        break missingId;
      }

      return new ActivityPlayeractivityBinding((LinearLayout) rootView, PlayPausebtn, SongImagePa,
          SongNamePa, TvseekBarending, TvseekBarstart, backBtnPA, nextbtnPA, previosbtnPA,
          seekBarPA);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
