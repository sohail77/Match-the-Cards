// Generated by data binding compiler. Do not edit!
package com.example.matchthecards.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.example.matchthecards.R;
import com.example.matchthecards.menufragment.MenuViewModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentMenuBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout colLayout;

  @NonNull
  public final TextView colSizeTxt;

  @NonNull
  public final TextView colVal;

  @NonNull
  public final LinearLayout difficultyLayout;

  @NonNull
  public final TextView difficultyTxt;

  @NonNull
  public final TextView difficultyVal;

  @NonNull
  public final LottieAnimationView lottieAnimationView;

  @NonNull
  public final ImageView minusColImg;

  @NonNull
  public final ImageView minusDiffImg;

  @NonNull
  public final FloatingActionButton playBtn;

  @NonNull
  public final ImageView plusColImg;

  @NonNull
  public final ImageView plusDiff;

  @NonNull
  public final TextView titleTxt;

  @Bindable
  protected MenuViewModel mMenuVm;

  protected FragmentMenuBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LinearLayout colLayout, TextView colSizeTxt, TextView colVal, LinearLayout difficultyLayout,
      TextView difficultyTxt, TextView difficultyVal, LottieAnimationView lottieAnimationView,
      ImageView minusColImg, ImageView minusDiffImg, FloatingActionButton playBtn,
      ImageView plusColImg, ImageView plusDiff, TextView titleTxt) {
    super(_bindingComponent, _root, _localFieldCount);
    this.colLayout = colLayout;
    this.colSizeTxt = colSizeTxt;
    this.colVal = colVal;
    this.difficultyLayout = difficultyLayout;
    this.difficultyTxt = difficultyTxt;
    this.difficultyVal = difficultyVal;
    this.lottieAnimationView = lottieAnimationView;
    this.minusColImg = minusColImg;
    this.minusDiffImg = minusDiffImg;
    this.playBtn = playBtn;
    this.plusColImg = plusColImg;
    this.plusDiff = plusDiff;
    this.titleTxt = titleTxt;
  }

  public abstract void setMenuVm(@Nullable MenuViewModel menuVm);

  @Nullable
  public MenuViewModel getMenuVm() {
    return mMenuVm;
  }

  @NonNull
  public static FragmentMenuBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_menu, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentMenuBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentMenuBinding>inflateInternal(inflater, R.layout.fragment_menu, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentMenuBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_menu, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentMenuBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentMenuBinding>inflateInternal(inflater, R.layout.fragment_menu, null, false, component);
  }

  public static FragmentMenuBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentMenuBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentMenuBinding)bind(component, view, R.layout.fragment_menu);
  }
}
