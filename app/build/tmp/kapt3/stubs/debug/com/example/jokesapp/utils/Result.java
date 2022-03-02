package com.example.jokesapp.utils;

import java.lang.System;

/**
 * Sealed class of HTTP result
 */
@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0002:\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t\u00a8\u0006\n"}, d2 = {"Lcom/example/jokesapp/utils/Result;", "T", "", "()V", "Error", "Exception", "Ok", "Lcom/example/jokesapp/utils/Result$Ok;", "Lcom/example/jokesapp/utils/Result$Error;", "Lcom/example/jokesapp/utils/Result$Exception;", "app_debug"})
public abstract class Result<T extends java.lang.Object> {
    
    private Result() {
        super();
    }
    
    /**
     * Successful result of request without errors
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\u0018\u0000*\n\b\u0001\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u00028\u0001\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0010"}, d2 = {"Lcom/example/jokesapp/utils/Result$Ok;", "T", "", "Lcom/example/jokesapp/utils/Result;", "Lcom/example/jokesapp/utils/ResponseResult;", "value", "response", "Lokhttp3/Response;", "(Ljava/lang/Object;Lokhttp3/Response;)V", "getResponse", "()Lokhttp3/Response;", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "toString", "", "app_debug"})
    public static final class Ok<T extends java.lang.Object> extends com.example.jokesapp.utils.Result<T> implements com.example.jokesapp.utils.ResponseResult {
        @org.jetbrains.annotations.NotNull()
        private final T value = null;
        @org.jetbrains.annotations.NotNull()
        private final okhttp3.Response response = null;
        
        public Ok(@org.jetbrains.annotations.NotNull()
        T value, @org.jetbrains.annotations.NotNull()
        okhttp3.Response response) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final T getValue() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public okhttp3.Response getResponse() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
    }
    
    /**
     * HTTP error
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0014"}, d2 = {"Lcom/example/jokesapp/utils/Result$Error;", "Lcom/example/jokesapp/utils/Result;", "", "Lcom/example/jokesapp/utils/ErrorResult;", "Lcom/example/jokesapp/utils/ResponseResult;", "exception", "Lretrofit2/HttpException;", "responseCode", "", "response", "Lokhttp3/Response;", "(Lretrofit2/HttpException;ILokhttp3/Response;)V", "getException", "()Lretrofit2/HttpException;", "getResponse", "()Lokhttp3/Response;", "getResponseCode", "()I", "toString", "", "app_debug"})
    public static final class Error extends com.example.jokesapp.utils.Result implements com.example.jokesapp.utils.ErrorResult, com.example.jokesapp.utils.ResponseResult {
        @org.jetbrains.annotations.NotNull()
        private final retrofit2.HttpException exception = null;
        private final int responseCode = 0;
        @org.jetbrains.annotations.NotNull()
        private final okhttp3.Response response = null;
        
        public Error(@org.jetbrains.annotations.NotNull()
        retrofit2.HttpException exception, int responseCode, @org.jetbrains.annotations.NotNull()
        okhttp3.Response response) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public retrofit2.HttpException getException() {
            return null;
        }
        
        public final int getResponseCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public okhttp3.Response getResponse() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
    }
    
    /**
     * Network exception occurred talking to the server or when an unexpected
     * exception occurred creating the request or processing the response
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lcom/example/jokesapp/utils/Result$Exception;", "Lcom/example/jokesapp/utils/Result;", "", "Lcom/example/jokesapp/utils/ErrorResult;", "exception", "", "(Ljava/lang/Throwable;)V", "getException", "()Ljava/lang/Throwable;", "toString", "", "app_debug"})
    public static final class Exception extends com.example.jokesapp.utils.Result implements com.example.jokesapp.utils.ErrorResult {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.Throwable exception = null;
        
        public Exception(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable exception) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.Throwable getException() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
    }
}