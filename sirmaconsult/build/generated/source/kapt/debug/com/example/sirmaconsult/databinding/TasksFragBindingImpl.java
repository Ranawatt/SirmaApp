package com.example.sirmaconsult.databinding;
import com.example.sirmaconsult.R;
import com.example.sirmaconsult.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class TasksFragBindingImpl extends TasksFragBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tasks_container_layout, 8);
        sViewsWithIds.put(R.id.add_task_fab, 9);
    }
    // views
    // variables
    // values
    // listeners
    private OnRefreshListenerImpl mViewmodelRefreshAndroidxSwiperefreshlayoutWidgetSwipeRefreshLayoutOnRefreshListener;
    // Inverse Binding Event Handlers

    public TasksFragBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private TasksFragBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[9]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0]
            , (android.widget.TextView) bindings[3]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.LinearLayout) bindings[5]
            , (android.widget.TextView) bindings[7]
            , (com.example.sirmaconsult.ScrollChildSwipeRefreshLayout) bindings[1]
            , (android.widget.RelativeLayout) bindings[8]
            , (android.widget.LinearLayout) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            );
        this.coordinatorLayout.setTag(null);
        this.filteringText.setTag(null);
        this.noTasksIcon.setTag(null);
        this.noTasksLayout.setTag(null);
        this.noTasksText.setTag(null);
        this.refreshLayout.setTag(null);
        this.tasksLinearLayout.setTag(null);
        this.tasksList.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
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
            setViewmodel((com.example.sirmaconsult.tasks.TasksViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable com.example.sirmaconsult.tasks.TasksViewModel Viewmodel) {
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelNoTasksLabel((androidx.lifecycle.LiveData<java.lang.Integer>) object, fieldId);
            case 1 :
                return onChangeViewmodelItems((androidx.lifecycle.LiveData<java.util.List<com.example.sirmaconsult.data.Task>>) object, fieldId);
            case 2 :
                return onChangeViewmodelNoTaskIconRes((androidx.lifecycle.LiveData<java.lang.Integer>) object, fieldId);
            case 3 :
                return onChangeViewmodelCurrentFilteringLabel((androidx.lifecycle.LiveData<java.lang.Integer>) object, fieldId);
            case 4 :
                return onChangeViewmodelEmpty((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 5 :
                return onChangeViewmodelDataLoading((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelNoTasksLabel(androidx.lifecycle.LiveData<java.lang.Integer> ViewmodelNoTasksLabel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelItems(androidx.lifecycle.LiveData<java.util.List<com.example.sirmaconsult.data.Task>> ViewmodelItems, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelNoTaskIconRes(androidx.lifecycle.LiveData<java.lang.Integer> ViewmodelNoTaskIconRes, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelCurrentFilteringLabel(androidx.lifecycle.LiveData<java.lang.Integer> ViewmodelCurrentFilteringLabel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelEmpty(androidx.lifecycle.LiveData<java.lang.Boolean> ViewmodelEmpty, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelDataLoading(androidx.lifecycle.LiveData<java.lang.Boolean> ViewmodelDataLoading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
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
        java.lang.Integer viewmodelNoTasksLabelGetValue = null;
        java.lang.String contextGetStringViewmodelCurrentFilteringLabel = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewmodelEmptyGetValue = false;
        java.lang.Integer viewmodelCurrentFilteringLabelGetValue = null;
        java.util.List<com.example.sirmaconsult.data.Task> viewmodelItemsGetValue = null;
        androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener viewmodelRefreshAndroidxSwiperefreshlayoutWidgetSwipeRefreshLayoutOnRefreshListener = null;
        int androidxDatabindingViewDataBindingSafeUnboxViewmodelNoTasksLabelGetValue = 0;
        androidx.lifecycle.LiveData<java.lang.Integer> viewmodelNoTasksLabel = null;
        int viewmodelEmptyViewVISIBLEViewGONE = 0;
        java.lang.Boolean viewmodelDataLoadingGetValue = null;
        androidx.lifecycle.LiveData<java.util.List<com.example.sirmaconsult.data.Task>> viewmodelItems = null;
        android.graphics.drawable.Drawable contextCompatGetDrawableContextViewmodelNoTaskIconRes = null;
        int viewmodelEmptyViewGONEViewVISIBLE = 0;
        androidx.lifecycle.LiveData<java.lang.Integer> viewmodelNoTaskIconRes = null;
        int androidxDatabindingViewDataBindingSafeUnboxViewmodelCurrentFilteringLabelGetValue = 0;
        androidx.lifecycle.LiveData<java.lang.Integer> viewmodelCurrentFilteringLabel = null;
        java.lang.String contextGetStringViewmodelNoTasksLabel = null;
        java.lang.Integer viewmodelNoTaskIconResGetValue = null;
        java.lang.Boolean viewmodelEmptyGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewmodelDataLoadingGetValue = false;
        int androidxDatabindingViewDataBindingSafeUnboxViewmodelNoTaskIconResGetValue = 0;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewmodelEmpty = null;
        com.example.sirmaconsult.tasks.TasksViewModel viewmodel = mViewmodel;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewmodelDataLoading = null;

        if ((dirtyFlags & 0xffL) != 0) {


            if ((dirtyFlags & 0xc0L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel::refresh
                        viewmodelRefreshAndroidxSwiperefreshlayoutWidgetSwipeRefreshLayoutOnRefreshListener = (((mViewmodelRefreshAndroidxSwiperefreshlayoutWidgetSwipeRefreshLayoutOnRefreshListener == null) ? (mViewmodelRefreshAndroidxSwiperefreshlayoutWidgetSwipeRefreshLayoutOnRefreshListener = new OnRefreshListenerImpl()) : mViewmodelRefreshAndroidxSwiperefreshlayoutWidgetSwipeRefreshLayoutOnRefreshListener).setValue(viewmodel));
                    }
            }
            if ((dirtyFlags & 0xc1L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.noTasksLabel
                        viewmodelNoTasksLabel = viewmodel.getNoTasksLabel();
                    }
                    updateLiveDataRegistration(0, viewmodelNoTasksLabel);


                    if (viewmodelNoTasksLabel != null) {
                        // read viewmodel.noTasksLabel.getValue()
                        viewmodelNoTasksLabelGetValue = viewmodelNoTasksLabel.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.noTasksLabel.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewmodelNoTasksLabelGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelNoTasksLabelGetValue);


                    // read context.getString(androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.noTasksLabel.getValue()))
                    contextGetStringViewmodelNoTasksLabel = getRoot().getContext().getString(androidxDatabindingViewDataBindingSafeUnboxViewmodelNoTasksLabelGetValue);
            }
            if ((dirtyFlags & 0xc2L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.items
                        viewmodelItems = viewmodel.getItems();
                    }
                    updateLiveDataRegistration(1, viewmodelItems);


                    if (viewmodelItems != null) {
                        // read viewmodel.items.getValue()
                        viewmodelItemsGetValue = viewmodelItems.getValue();
                    }
            }
            if ((dirtyFlags & 0xc4L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.noTaskIconRes
                        viewmodelNoTaskIconRes = viewmodel.getNoTaskIconRes();
                    }
                    updateLiveDataRegistration(2, viewmodelNoTaskIconRes);


                    if (viewmodelNoTaskIconRes != null) {
                        // read viewmodel.noTaskIconRes.getValue()
                        viewmodelNoTaskIconResGetValue = viewmodelNoTaskIconRes.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.noTaskIconRes.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewmodelNoTaskIconResGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelNoTaskIconResGetValue);


                    // read ContextCompat.getDrawable(context, androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.noTaskIconRes.getValue()))
                    contextCompatGetDrawableContextViewmodelNoTaskIconRes = androidx.core.content.ContextCompat.getDrawable(getRoot().getContext(), androidxDatabindingViewDataBindingSafeUnboxViewmodelNoTaskIconResGetValue);
            }
            if ((dirtyFlags & 0xc8L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.currentFilteringLabel
                        viewmodelCurrentFilteringLabel = viewmodel.getCurrentFilteringLabel();
                    }
                    updateLiveDataRegistration(3, viewmodelCurrentFilteringLabel);


                    if (viewmodelCurrentFilteringLabel != null) {
                        // read viewmodel.currentFilteringLabel.getValue()
                        viewmodelCurrentFilteringLabelGetValue = viewmodelCurrentFilteringLabel.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.currentFilteringLabel.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewmodelCurrentFilteringLabelGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelCurrentFilteringLabelGetValue);


                    // read context.getString(androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.currentFilteringLabel.getValue()))
                    contextGetStringViewmodelCurrentFilteringLabel = getRoot().getContext().getString(androidxDatabindingViewDataBindingSafeUnboxViewmodelCurrentFilteringLabelGetValue);
            }
            if ((dirtyFlags & 0xd0L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.empty
                        viewmodelEmpty = viewmodel.getEmpty();
                    }
                    updateLiveDataRegistration(4, viewmodelEmpty);


                    if (viewmodelEmpty != null) {
                        // read viewmodel.empty.getValue()
                        viewmodelEmptyGetValue = viewmodelEmpty.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.empty.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewmodelEmptyGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelEmptyGetValue);
                if((dirtyFlags & 0xd0L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewmodelEmptyGetValue) {
                            dirtyFlags |= 0x200L;
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                            dirtyFlags |= 0x400L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.empty.getValue()) ? View.VISIBLE : View.GONE
                    viewmodelEmptyViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelEmptyGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.empty.getValue()) ? View.GONE : View.VISIBLE
                    viewmodelEmptyViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelEmptyGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0xe0L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.dataLoading
                        viewmodelDataLoading = viewmodel.getDataLoading();
                    }
                    updateLiveDataRegistration(5, viewmodelDataLoading);


                    if (viewmodelDataLoading != null) {
                        // read viewmodel.dataLoading.getValue()
                        viewmodelDataLoadingGetValue = viewmodelDataLoading.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.dataLoading.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewmodelDataLoadingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelDataLoadingGetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0xc8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.filteringText, contextGetStringViewmodelCurrentFilteringLabel);
        }
        if ((dirtyFlags & 0xc4L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.noTasksIcon, contextCompatGetDrawableContextViewmodelNoTaskIconRes);
        }
        if ((dirtyFlags & 0xd0L) != 0) {
            // api target 1

            this.noTasksLayout.setVisibility(viewmodelEmptyViewVISIBLEViewGONE);
            this.tasksLinearLayout.setVisibility(viewmodelEmptyViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0xc1L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.noTasksText, contextGetStringViewmodelNoTasksLabel);
        }
        if ((dirtyFlags & 0xc0L) != 0) {
            // api target 1

            this.refreshLayout.setOnRefreshListener(viewmodelRefreshAndroidxSwiperefreshlayoutWidgetSwipeRefreshLayoutOnRefreshListener);
        }
        if ((dirtyFlags & 0xe0L) != 0) {
            // api target 1

            this.refreshLayout.setRefreshing(androidxDatabindingViewDataBindingSafeUnboxViewmodelDataLoadingGetValue);
        }
        if ((dirtyFlags & 0xc2L) != 0) {
            // api target 1

            com.example.sirmaconsult.tasks.TasksListBindingKt.setItems(this.tasksList, viewmodelItemsGetValue);
        }
    }
    // Listener Stub Implementations
    public static class OnRefreshListenerImpl implements androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener{
        private com.example.sirmaconsult.tasks.TasksViewModel value;
        public OnRefreshListenerImpl setValue(com.example.sirmaconsult.tasks.TasksViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onRefresh() {
            this.value.refresh(); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.noTasksLabel
        flag 1 (0x2L): viewmodel.items
        flag 2 (0x3L): viewmodel.noTaskIconRes
        flag 3 (0x4L): viewmodel.currentFilteringLabel
        flag 4 (0x5L): viewmodel.empty
        flag 5 (0x6L): viewmodel.dataLoading
        flag 6 (0x7L): viewmodel
        flag 7 (0x8L): null
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.empty.getValue()) ? View.VISIBLE : View.GONE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.empty.getValue()) ? View.VISIBLE : View.GONE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.empty.getValue()) ? View.GONE : View.VISIBLE
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.empty.getValue()) ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}