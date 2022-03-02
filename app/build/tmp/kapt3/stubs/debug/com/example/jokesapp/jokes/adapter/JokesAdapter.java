package com.example.jokesapp.jokes.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\tH\u0016J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u001e\u0010\u0012\u001a\u00020\u000b2\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/jokesapp/jokes/adapter/JokesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/jokesapp/jokes/adapter/JokesAdapter$JokesViewHolder;", "()V", "jokesList", "Ljava/util/ArrayList;", "Lcom/example/jokesapp/jokes/model/JokesResponseModel$Result;", "Lkotlin/collections/ArrayList;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setJokesList", "JokesViewHolder", "app_debug"})
public final class JokesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.jokesapp.jokes.adapter.JokesAdapter.JokesViewHolder> {
    private java.util.ArrayList<com.example.jokesapp.jokes.model.JokesResponseModel.Result> jokesList;
    
    public JokesAdapter() {
        super();
    }
    
    public final void setJokesList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.jokesapp.jokes.model.JokesResponseModel.Result> jokesList) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.jokesapp.jokes.adapter.JokesAdapter.JokesViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.jokesapp.jokes.adapter.JokesAdapter.JokesViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/jokesapp/jokes/adapter/JokesAdapter$JokesViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/jokesapp/databinding/ItemJokeBinding;", "(Lcom/example/jokesapp/databinding/ItemJokeBinding;)V", "getBinding", "()Lcom/example/jokesapp/databinding/ItemJokeBinding;", "app_debug"})
    public static final class JokesViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.jokesapp.databinding.ItemJokeBinding binding = null;
        
        public JokesViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.jokesapp.databinding.ItemJokeBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.jokesapp.databinding.ItemJokeBinding getBinding() {
            return null;
        }
    }
}