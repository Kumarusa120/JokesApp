package com.example.jokesapp.utils;

import java.lang.System;

/**
 * Interface for [Result] classes with [okhttp3.Response]: [Result.Ok] and [Result.Error]
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/example/jokesapp/utils/ResponseResult;", "", "response", "Lokhttp3/Response;", "getResponse", "()Lokhttp3/Response;", "app_debug"})
public abstract interface ResponseResult {
    
    @org.jetbrains.annotations.NotNull()
    public abstract okhttp3.Response getResponse();
}