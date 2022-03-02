package com.example.jokesapp.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a+\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005\u001a\'\u0010\u0006\u001a\u0002H\u0002\"\b\b\u0000\u0010\u0002*\u00020\u0007*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\n\u00a2\u0006\u0002\u0010\u000b\u001a\u001c\u0010\f\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\u00042\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0002\u001a-\u0010\u0010\u001a\u00020\r*\u00020\b2\b\b\u0001\u0010\u0011\u001a\u00020\u00122\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u0014\u00a2\u0006\u0002\b\u0016\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"awaitResult", "Lcom/example/jokesapp/utils/Result;", "T", "", "Lretrofit2/Call;", "(Lretrofit2/Call;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "obtainViewModel", "Landroidx/lifecycle/ViewModel;", "Landroidx/appcompat/app/AppCompatActivity;", "viewModelClass", "Ljava/lang/Class;", "(Landroidx/appcompat/app/AppCompatActivity;Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "registerOnCompletion", "", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "setupActionBar", "toolbarId", "", "action", "Lkotlin/Function1;", "Landroidx/appcompat/app/ActionBar;", "Lkotlin/ExtensionFunctionType;", "app_debug"})
public final class CallAwaitKt {
    
    /**
     * Suspend extension that allows suspend [Call] inside coroutine.
     *
     * @return sealed class [Result] object that can be
     *        casted to [Result.Ok] (success) or [Result.Error] (HTTP error)
     *        and [Result.Exception] (other errors)
     */
    @org.jetbrains.annotations.Nullable()
    public static final <T extends java.lang.Object>java.lang.Object awaitResult(@org.jetbrains.annotations.NotNull()
    retrofit2.Call<T> $this$awaitResult, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.jokesapp.utils.Result<? extends T>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends androidx.lifecycle.ViewModel>T obtainViewModel(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $this$obtainViewModel, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> viewModelClass) {
        return null;
    }
    
    public static final void setupActionBar(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $this$setupActionBar, @androidx.annotation.IdRes()
    int toolbarId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super androidx.appcompat.app.ActionBar, kotlin.Unit> action) {
    }
    
    /**
     * Registration after the completion of the retrofit call
     */
    private static final void registerOnCompletion(retrofit2.Call<?> $this$registerOnCompletion, kotlinx.coroutines.CancellableContinuation<?> continuation) {
    }
}