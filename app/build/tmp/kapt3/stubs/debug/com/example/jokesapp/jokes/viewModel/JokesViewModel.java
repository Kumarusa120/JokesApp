package com.example.jokesapp.jokes.viewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001aJ\b\u0010\"\u001a\u00020\u001eH\u0014R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\'\u0010\u000e\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\u000f0\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006#"}, d2 = {"Lcom/example/jokesapp/jokes/viewModel/JokesViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_dataLoading", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/jokesapp/utils/Event;", "", "_jokesList", "Ljava/util/ArrayList;", "Lcom/example/jokesapp/jokes/model/JokesResponseModel$Result;", "dataLoading", "Landroidx/lifecycle/LiveData;", "getDataLoading", "()Landroidx/lifecycle/LiveData;", "jokesList", "Lkotlin/collections/ArrayList;", "getJokesList", "()Landroidx/lifecycle/MutableLiveData;", "jokesRepository", "Lcom/example/jokesapp/jokes/services/JokesRepository;", "getJokesRepository", "()Lcom/example/jokesapp/jokes/services/JokesRepository;", "jokesRepository$delegate", "Lkotlin/Lazy;", "toastMessage", "Lcom/example/jokesapp/utils/SingleLiveEvent;", "", "getToastMessage$app_debug", "()Lcom/example/jokesapp/utils/SingleLiveEvent;", "getJokeList", "", "context", "Landroid/content/Context;", "searchedJokesName", "onCleared", "app_debug"})
public final class JokesViewModel extends androidx.lifecycle.ViewModel {
    private final kotlin.Lazy jokesRepository$delegate = null;
    private final androidx.lifecycle.MutableLiveData<com.example.jokesapp.utils.Event<java.lang.Boolean>> _dataLoading = null;
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.jokesapp.jokes.model.JokesResponseModel.Result>> _jokesList = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.jokesapp.utils.SingleLiveEvent<java.lang.String> toastMessage = null;
    
    public JokesViewModel() {
        super();
    }
    
    private final com.example.jokesapp.jokes.services.JokesRepository getJokesRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.jokesapp.utils.Event<java.lang.Boolean>> getDataLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.jokesapp.jokes.model.JokesResponseModel.Result>> getJokesList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.jokesapp.utils.SingleLiveEvent<java.lang.String> getToastMessage$app_debug() {
        return null;
    }
    
    public final void getJokeList(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String searchedJokesName) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
}