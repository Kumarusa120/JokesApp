package com.example.jokesapp.network;

import java.lang.System;

@kotlin.Suppress(names = {"UNCHECKED_CAST"})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/example/jokesapp/network/NetworkManager;", "", "()V", "Companion", "app_debug"})
public final class NetworkManager {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.jokesapp.network.NetworkManager.Companion Companion = null;
    private static java.lang.String baseUrl;
    private static java.lang.Object serviceClass;
    
    /**
     * Create the logging interceptor for network call
     */
    private static final okhttp3.logging.HttpLoggingInterceptor loggingInterceptor = null;
    
    public NetworkManager() {
        super();
    }
    
    /**
     * Apply base url for the network call
     */
    @org.jetbrains.annotations.NotNull()
    public static final com.example.jokesapp.network.NetworkManager.Companion baseUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl) {
        return null;
    }
    
    /**
     * Update the service class type based on network call
     */
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>com.example.jokesapp.network.NetworkManager.Companion serviceClass(@org.jetbrains.annotations.Nullable()
    java.lang.Class<T> serviceClass) {
        return null;
    }
    
    /**
     * Initialize the retrofit build URL passes with service class
     */
    public static final <T extends java.lang.Object>T build(boolean withNull) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H\u0007J\u001d\u0010\b\u001a\u0002H\t\"\u0004\b\u0000\u0010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007\u00a2\u0006\u0002\u0010\fJ\u001e\u0010\u0007\u001a\u00020\u0000\"\u0004\b\u0000\u0010\t2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u0002H\t\u0018\u00010\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/jokesapp/network/NetworkManager$Companion;", "", "()V", "baseUrl", "", "loggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "serviceClass", "build", "T", "withNull", "", "(Z)Ljava/lang/Object;", "Ljava/lang/Class;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Apply base url for the network call
         */
        @org.jetbrains.annotations.NotNull()
        public final com.example.jokesapp.network.NetworkManager.Companion baseUrl(@org.jetbrains.annotations.NotNull()
        java.lang.String baseUrl) {
            return null;
        }
        
        /**
         * Update the service class type based on network call
         */
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.example.jokesapp.network.NetworkManager.Companion serviceClass(@org.jetbrains.annotations.Nullable()
        java.lang.Class<T> serviceClass) {
            return null;
        }
        
        /**
         * Initialize the retrofit build URL passes with service class
         */
        public final <T extends java.lang.Object>T build(boolean withNull) {
            return null;
        }
    }
}