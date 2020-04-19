package com.example.sirmaconsult.databinding;
import com.example.sirmaconsult.R;
import com.example.sirmaconsult.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class TaskdetailFragBindingImpl extends TaskdetailFragBinding implements com.example.sirmaconsult.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.edit_task_fab, 8);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.RelativeLayout mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    private OnRefreshListenerImpl mViewmodelRefreshAndroidxSwiperefreshlayoutWidgetSwipeRefreshLayoutOnRefreshListener;
    // Inverse Binding Event Handlers

    public TaskdetailFragBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private TaskdetailFragBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[8]
            , (com.example.sirmaconsult.ScrollChildSwipeRefreshLayout) bindings[1]
            , (android.widget.CheckBox) bindings[5]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[6]
            );
        this.coordinatorLayout.setTag(null);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.RelativeLayout) bindings[4];
        this.mboundView4.setTag(null);
        this.refreshLayout.setTag(null);
        this.taskDetailCompleteCheckbox.setTag(null);
        this.taskDetailDescriptionText.setTag(null);
        this.taskDetailTitleText.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.example.sirmaconsult.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
            setViewmodel((com.example.sirmaconsult.taskdetail.TaskDetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable com.example.sirmaconsult.taskdetail.TaskDetailViewModel Viewmodel) {
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelCompleted((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewmodelTask((androidx.lifecycle.LiveData<com.example.sirmaconsult.data.Task>) object, fieldId);
            case 2 :
                return onChangeViewmodelIsDataAvailable((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeViewmodelDataLoading((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelCompleted(androidx.lifecycle.LiveData<java.lang.Boolean> ViewmodelCompleted, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelTask(androidx.lifecycle.LiveData<com.example.sirmaconsult.data.Task> ViewmodelTask, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelIsDataAvailable(androidx.lifecycle.LiveData<java.lang.Boolean> ViewmodelIsDataAvailable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelDataLoading(androidx.lifecycle.LiveData<java.lang.Boolean> ViewmodelDataLoading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        java.lang.Boolean viewmodelIsDataAvailableGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewmodelIsDataAvailableGetValue = false;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewmodelCompleted = null;
        int viewmodelIsDataAvailableViewGONEViewVISIBLE = 0;
        java.lang.Boolean viewmodelCompletedGetValue = null;
        androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener viewmodelRefreshAndroidxSwiperefreshlayoutWidgetSwipeRefreshLayoutOnRefreshListener = null;
        java.lang.String viewmodelTaskDescription = null;
        int viewmodelDataLoadingViewGONEViewVISIBLE = 0;
        java.lang.Boolean viewmodelDataLoadingGetValue = null;
        com.example.sirmaconsult.data.Task viewmodelTaskGetValue = null;
        androidx.lifecycle.LiveData<com.example.sirmaconsult.data.Task> viewmodelTask = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewmodelCompletedGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewmodelDataLoadingGetValue = false;
        int viewmodelIsDataAvailableViewVISIBLEViewGONE = 0;
        java.lang.String viewmodelTaskTitle = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewmodelIsDataAvailable = null;
        com.example.sirmaconsult.taskdetail.TaskDetailViewModel viewmodel = mViewmodel;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewmodelDataLoading = null;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.completed
                        viewmodelCompleted = viewmodel.getCompleted();
                    }
                    updateLiveDataRegistration(0, viewmodelCompleted);


                    if (viewmodelCompleted != null) {
                        // read viewmodel.completed.getValue()
                        viewmodelCompletedGetValue = viewmodelCompleted.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.completed.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewmodelCompletedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelCompletedGetValue);
            }
            if ((dirtyFlags & 0x30L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel::refresh
                        viewmodelRefreshAndroidxSwiperefreshlayoutWidgetSwipeRefreshLayoutOnRefreshListener = (((mViewmodelRefreshAndroidxSwiperefreshlayoutWidgetSwipeRefreshLayoutOnRefreshListener == null) ? (mViewmodelRefreshAndroidxSwiperefreshlayoutWidgetSwipeRefreshLayoutOnRefreshListener = new OnRefreshListenerImpl()) : mViewmodelRefreshAndroidxSwiperefreshlayoutWidgetSwipeRefreshLayoutOnRefreshListener).setValue(viewmodel));
                    }
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.task
                        viewmodelTask = viewmodel.getTask();
                    }
                    updateLiveDataRegistration(1, viewmodelTask);


                    if (viewmodelTask != null) {
                        // read viewmodel.task.getValue()
                        viewmodelTaskGetValue = viewmodelTask.getValue();
                    }


                    if (viewmodelTaskGetValue != null) {
                        // read viewmodel.task.getValue().description
                        viewmodelTaskDescription = viewmodelTaskGetValue.getDescription();
                        // read viewmodel.task.getValue().title
                        viewmodelTaskTitle = viewmodelTaskGetValue.getTitle();
                    }
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.isDataAvailable
                        viewmodelIsDataAvailable = viewmodel.isDataAvailable();
                    }
                    updateLiveDataRegistration(2, viewmodelIsDataAvailable);


                    if (viewmodelIsDataAvailable != null) {
                        // read viewmodel.isDataAvailable.getValue()
                        viewmodelIsDataAvailableGetValue = viewmodelIsDataAvailable.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isDataAvailable.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewmodelIsDataAvailableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelIsDataAvailableGetValue);
                if((dirtyFlags & 0x34L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewmodelIsDataAvailableGetValue) {
                            dirtyFlags |= 0x80L;
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                            dirtyFlags |= 0x400L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isDataAvailable.getValue()) ? View.GONE : View.VISIBLE
                    viewmodelIsDataAvailableViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelIsDataAvailableGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isDataAvailable.getValue()) ? View.VISIBLE : View.GONE
                    viewmodelIsDataAvailableViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelIsDataAvailableGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x38L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.dataLoading
                        viewmodelDataLoading = viewmodel.getDataLoading();
                    }
                    updateLiveDataRegistration(3, viewmodelDataLoading);


                    if (viewmodelDataLoading != null) {
                        // read viewmodel.dataLoading.getValue()
                        viewmodelDataLoadingGetValue = viewmodelDataLoading.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.dataLoading.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewmodelDataLoadingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelDataLoadingGetValue);
                if((dirtyFlags & 0x38L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewmodelDataLoadingGetValue) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.dataLoading.getValue()) ? View.GONE : View.VISIBLE
                    viewmodelDataLoadingViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelDataLoadingGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            this.mboundView2.setVisibility(viewmodelIsDataAvailableViewGONEViewVISIBLE);
            this.mboundView4.setVisibility(viewmodelIsDataAvailableViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            this.mboundView3.setVisibility(viewmodelDataLoadingViewGONEViewVISIBLE);
            this.refreshLayout.setRefreshing(androidxDatabindingViewDataBindingSafeUnboxViewmodelDataLoadingGetValue);
        }
        if ((dirtyFlags & 0x30L) != 0) {
            // api target 1

            this.refreshLayout.setOnRefreshListener(viewmodelRefreshAndroidxSwiperefreshlayoutWidgetSwipeRefreshLayoutOnRefreshListener);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.taskDetailCompleteCheckbox, androidxDatabindingViewDataBindingSafeUnboxViewmodelCompletedGetValue);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.taskDetailCompleteCheckbox.setOnClickListener(mCallback3);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.taskDetailDescriptionText, viewmodelTaskDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.taskDetailTitleText, viewmodelTaskTitle);
        }
    }
    // Listener Stub Implementations
    public static class OnRefreshListenerImpl implements androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener{
        private com.example.sirmaconsult.taskdetail.TaskDetailViewModel value;
        public OnRefreshListenerImpl setValue(com.example.sirmaconsult.taskdetail.TaskDetailViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onRefresh() {
            this.value.refresh(); 
        }
    }
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewmodel != null
        boolean viewmodelJavaLangObjectNull = false;
        // viewmodel.setCompleted((CompoundButton) view.isChecked())
        kotlinx.coroutines.Job viewmodelSetCompletedCompoundButtonCallbackArg0IsChecked = null;
        // viewmodel
        com.example.sirmaconsult.taskdetail.TaskDetailViewModel viewmodel = mViewmodel;



        viewmodelJavaLangObjectNull = (viewmodel) != (null);
        if (viewmodelJavaLangObjectNull) {



            if ((((android.widget.CompoundButton) (callbackArg_0))) != (null)) {


                ((android.widget.CompoundButton) (callbackArg_0)).isChecked();

                viewmodelSetCompletedCompoundButtonCallbackArg0IsChecked = viewmodel.setCompleted(((android.widget.CompoundButton) (callbackArg_0)).isChecked());
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.completed
        flag 1 (0x2L): viewmodel.task
        flag 2 (0x3L): viewmodel.isDataAvailable
        flag 3 (0x4L): viewmodel.dataLoading
        flag 4 (0x5L): viewmodel
        flag 5 (0x6L): null
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isDataAvailable.getValue()) ? View.GONE : View.VISIBLE
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isDataAvailable.getValue()) ? View.GONE : View.VISIBLE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.dataLoading.getValue()) ? View.GONE : View.VISIBLE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.dataLoading.getValue()) ? View.GONE : View.VISIBLE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isDataAvailable.getValue()) ? View.VISIBLE : View.GONE
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isDataAvailable.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}