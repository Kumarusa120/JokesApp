package com.example.jokesapp.databinding;
import com.example.jokesapp.R;
import com.example.jokesapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentJokesBindingImpl extends FragmentJokesBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.jokes_swipe_refresh_layout, 2);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentJokesBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private FragmentJokesBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[2]
            );
        this.jokeListRecyclerView.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.jokesViewModel == variableId) {
            setJokesViewModel((com.example.jokesapp.jokes.viewModel.JokesViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setJokesViewModel(@Nullable com.example.jokesapp.jokes.viewModel.JokesViewModel JokesViewModel) {
        this.mJokesViewModel = JokesViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.jokesViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeJokesViewModelJokesList((androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.jokesapp.jokes.model.JokesResponseModel.Result>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeJokesViewModelJokesList(androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.jokesapp.jokes.model.JokesResponseModel.Result>> JokesViewModelJokesList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.util.ArrayList<com.example.jokesapp.jokes.model.JokesResponseModel.Result> jokesViewModelJokesListGetValue = null;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.jokesapp.jokes.model.JokesResponseModel.Result>> jokesViewModelJokesList = null;
        com.example.jokesapp.jokes.viewModel.JokesViewModel jokesViewModel = mJokesViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (jokesViewModel != null) {
                    // read jokesViewModel.jokesList
                    jokesViewModelJokesList = jokesViewModel.getJokesList();
                }
                updateLiveDataRegistration(0, jokesViewModelJokesList);


                if (jokesViewModelJokesList != null) {
                    // read jokesViewModel.jokesList.getValue()
                    jokesViewModelJokesListGetValue = jokesViewModelJokesList.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.example.jokesapp.utils.ListBinding.setJokeList(this.jokeListRecyclerView, jokesViewModelJokesListGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): jokesViewModel.jokesList
        flag 1 (0x2L): jokesViewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}