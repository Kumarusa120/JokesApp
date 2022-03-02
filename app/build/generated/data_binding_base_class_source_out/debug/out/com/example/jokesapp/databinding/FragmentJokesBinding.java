// Generated by data binding compiler. Do not edit!
package com.example.jokesapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.example.jokesapp.R;
import com.example.jokesapp.jokes.viewModel.JokesViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentJokesBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView jokeListRecyclerView;

  @NonNull
  public final SwipeRefreshLayout jokesSwipeRefreshLayout;

  @Bindable
  protected JokesViewModel mJokesViewModel;

  protected FragmentJokesBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView jokeListRecyclerView, SwipeRefreshLayout jokesSwipeRefreshLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.jokeListRecyclerView = jokeListRecyclerView;
    this.jokesSwipeRefreshLayout = jokesSwipeRefreshLayout;
  }

  public abstract void setJokesViewModel(@Nullable JokesViewModel jokesViewModel);

  @Nullable
  public JokesViewModel getJokesViewModel() {
    return mJokesViewModel;
  }

  @NonNull
  public static FragmentJokesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_jokes, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentJokesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentJokesBinding>inflateInternal(inflater, R.layout.fragment_jokes, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentJokesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_jokes, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentJokesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentJokesBinding>inflateInternal(inflater, R.layout.fragment_jokes, null, false, component);
  }

  public static FragmentJokesBinding bind(@NonNull View view) {
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
  public static FragmentJokesBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentJokesBinding)bind(component, view, R.layout.fragment_jokes);
  }
}