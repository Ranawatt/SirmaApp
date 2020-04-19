package com.example.sirmaconsult.databinding;
import com.example.sirmaconsult.R;
import com.example.sirmaconsult.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AddtaskFragBindingImpl extends AddtaskFragBinding implements com.example.sirmaconsult.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener addTaskDescriptionEditTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.description.getValue()
            //         is viewmodel.description.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(addTaskDescriptionEditText);
            // localize variables for thread safety
            // viewmodel.description
            androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelDescription = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.description != null
            boolean viewmodelDescriptionJavaLangObjectNull = false;
            // viewmodel.description.getValue()
            java.lang.String viewmodelDescriptionGetValue = null;
            // viewmodel
            com.example.sirmaconsult.addedittask.AddEditTaskViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelDescription = viewmodel.getDescription();

                viewmodelDescriptionJavaLangObjectNull = (viewmodelDescription) != (null);
                if (viewmodelDescriptionJavaLangObjectNull) {




                    viewmodelDescription.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener addTaskTitleEditTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.title.getValue()
            //         is viewmodel.title.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(addTaskTitleEditText);
            // localize variables for thread safety
            // viewmodel.title
            androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelTitle = null;
            // viewmodel.title.getValue()
            java.lang.String viewmodelTitleGetValue = null;
            // viewmodel.title != null
            boolean viewmodelTitleJavaLangObjectNull = false;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel
            com.example.sirmaconsult.addedittask.AddEditTaskViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelTitle = viewmodel.getTitle();

                viewmodelTitleJavaLangObjectNull = (viewmodelTitle) != (null);
                if (viewmodelTitleJavaLangObjectNull) {




                    viewmodelTitle.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public AddtaskFragBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private AddtaskFragBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.EditText) bindings[4]
            , (android.widget.EditText) bindings[3]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0]
            , (com.example.sirmaconsult.ScrollChildSwipeRefreshLayout) bindings[1]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[5]
            );
        this.addTaskDescriptionEditText.setTag(null);
        this.addTaskTitleEditText.setTag(null);
        this.coordinatorLayout.setTag(null);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.refreshLayout.setTag(null);
        this.saveTaskFab.setTag(null);
        setRootTag(root);
        // listeners
        mCallback4 = new com.example.sirmaconsult.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
        if (BR.viewmodel == variableId) {
            setViewmodel((com.example.sirmaconsult.addedittask.AddEditTaskViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable com.example.sirmaconsult.addedittask.AddEditTaskViewModel Viewmodel) {
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelTitle((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewmodelDescription((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewmodelDataLoading((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelTitle(androidx.lifecycle.MutableLiveData<java.lang.String> ViewmodelTitle, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelDescription(androidx.lifecycle.MutableLiveData<java.lang.String> ViewmodelDescription, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelDataLoading(androidx.lifecycle.LiveData<java.lang.Boolean> ViewmodelDataLoading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        java.lang.String viewmodelTitleGetValue = null;
        java.lang.String viewmodelDescriptionGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewmodelDataLoadingGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelTitle = null;
        int viewmodelDataLoadingViewGONEViewVISIBLE = 0;
        java.lang.Boolean viewmodelDataLoadingGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelDescription = null;
        com.example.sirmaconsult.addedittask.AddEditTaskViewModel viewmodel = mViewmodel;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewmodelDataLoading = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.title
                        viewmodelTitle = viewmodel.getTitle();
                    }
                    updateLiveDataRegistration(0, viewmodelTitle);


                    if (viewmodelTitle != null) {
                        // read viewmodel.title.getValue()
                        viewmodelTitleGetValue = viewmodelTitle.getValue();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.description
                        viewmodelDescription = viewmodel.getDescription();
                    }
                    updateLiveDataRegistration(1, viewmodelDescription);


                    if (viewmodelDescription != null) {
                        // read viewmodel.description.getValue()
                        viewmodelDescriptionGetValue = viewmodelDescription.getValue();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.dataLoading
                        viewmodelDataLoading = viewmodel.getDataLoading();
                    }
                    updateLiveDataRegistration(2, viewmodelDataLoading);


                    if (viewmodelDataLoading != null) {
                        // read viewmodel.dataLoading.getValue()
                        viewmodelDataLoadingGetValue = viewmodelDataLoading.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.dataLoading.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewmodelDataLoadingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelDataLoadingGetValue);
                if((dirtyFlags & 0x1cL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewmodelDataLoadingGetValue) {
                            dirtyFlags |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.dataLoading.getValue()) ? View.GONE : View.VISIBLE
                    viewmodelDataLoadingViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelDataLoadingGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.addTaskDescriptionEditText, viewmodelDescriptionGetValue);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.addTaskDescriptionEditText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, addTaskDescriptionEditTextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.addTaskTitleEditText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, addTaskTitleEditTextandroidTextAttrChanged);
            this.saveTaskFab.setOnClickListener(mCallback4);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.addTaskTitleEditText, viewmodelTitleGetValue);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            this.mboundView2.setVisibility(viewmodelDataLoadingViewGONEViewVISIBLE);
            this.refreshLayout.setEnabled(androidxDatabindingViewDataBindingSafeUnboxViewmodelDataLoadingGetValue);
            this.refreshLayout.setRefreshing(androidxDatabindingViewDataBindingSafeUnboxViewmodelDataLoadingGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewmodel != null
        boolean viewmodelJavaLangObjectNull = false;
        // viewmodel
        com.example.sirmaconsult.addedittask.AddEditTaskViewModel viewmodel = mViewmodel;



        viewmodelJavaLangObjectNull = (viewmodel) != (null);
        if (viewmodelJavaLangObjectNull) {


            viewmodel.saveTask();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.title
        flag 1 (0x2L): viewmodel.description
        flag 2 (0x3L): viewmodel.dataLoading
        flag 3 (0x4L): viewmodel
        flag 4 (0x5L): null
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.dataLoading.getValue()) ? View.GONE : View.VISIBLE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.dataLoading.getValue()) ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}