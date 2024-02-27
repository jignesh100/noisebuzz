// Generated by view binder compiler. Do not edit!
package com.example.music_player.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.music_player.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class NavHeaderBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  private NavHeaderBinding(@NonNull LinearLayout rootView) {
    this.rootView = rootView;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static NavHeaderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static NavHeaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.nav_header, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static NavHeaderBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    return new NavHeaderBinding((LinearLayout) rootView);
  }
}
