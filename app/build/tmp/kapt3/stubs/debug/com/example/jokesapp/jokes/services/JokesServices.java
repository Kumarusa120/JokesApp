package com.example.jokesapp.jokes.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\'\u00a8\u0006\n"}, d2 = {"Lcom/example/jokesapp/jokes/services/JokesServices;", "", "getJokes", "Lretrofit2/Call;", "Lcom/example/jokesapp/jokes/model/JokesResponseModel;", "page", "", "pageLimit", "searchedJoke", "", "app_debug"})
public abstract interface JokesServices {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "search")
    @retrofit2.http.Headers(value = {"Accept: application/json"})
    public abstract retrofit2.Call<com.example.jokesapp.jokes.model.JokesResponseModel> getJokes(@retrofit2.http.Query(value = "page")
    int page, @retrofit2.http.Query(value = "limit")
    int pageLimit, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "term")
    java.lang.String searchedJoke);
}