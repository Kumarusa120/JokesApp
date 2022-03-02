package com.example.jokesapp.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0012\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&\u00a8\u0006\u000f"}, d2 = {"Lcom/example/jokesapp/network/TaskCallback;", "T", "", "onComplete", "", "result", "(Ljava/lang/Object;)V", "onError", "errorResponse", "Lokhttp3/Response;", "responseCode", "", "onException", "t", "", "app_debug"})
public abstract interface TaskCallback<T extends java.lang.Object> {
    
    /**
     * Given task was completed
     */
    public abstract void onComplete(T result);
    
    /**
     * Error happens in the task
     */
    public abstract void onError(@org.jetbrains.annotations.NotNull()
    okhttp3.Response errorResponse, int responseCode);
    
    /**
     * Exception happens in the task
     */
    public abstract void onException(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable t);
}