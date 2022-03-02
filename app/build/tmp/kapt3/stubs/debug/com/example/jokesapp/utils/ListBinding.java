package com.example.jokesapp.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nH\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/example/jokesapp/utils/ListBinding;", "", "()V", "setJokeList", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "items", "Ljava/util/ArrayList;", "Lcom/example/jokesapp/jokes/model/JokesResponseModel$Result;", "Lkotlin/collections/ArrayList;", "app_debug"})
public final class ListBinding {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.jokesapp.utils.ListBinding INSTANCE = null;
    
    private ListBinding() {
        super();
    }
    
    @androidx.databinding.BindingAdapter(value = {"jokesList"})
    public static final void setJokeList(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.jokesapp.jokes.model.JokesResponseModel.Result> items) {
    }
}