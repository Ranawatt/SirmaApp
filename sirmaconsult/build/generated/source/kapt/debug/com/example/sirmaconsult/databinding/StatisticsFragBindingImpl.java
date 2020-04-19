package com.example.sirmaconsult.databinding;
import com.example.sirmaconsult.R;
import com.example.sirmaconsult.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class StatisticsFragBindingImpl extends StatisticsFragBinding  {

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
    private final android.widget.TextView mboundView2;
    // variables
    // values
    // listeners
    private OnRefreshListenerImpl mViewmodelRefreshAndroidxSwiperefreshlayoutWidgetSwipeRefreshLayoutOnRefreshListener;
    // Inverse Binding Event Handlers

    public StatisticsFragBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private StatisticsFragBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (com.example.sirmaconsult.ScrollChildSwipeRefreshLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            );
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.refreshLayout.setTag(null);
        this.statisticsLayout.setTag(null);
        this.statsActiveText.setTag(null);
        this.statsCompletedText.setTag(null);
        setRootTag(root);
        // listeners
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
            setViewmodel((com.example.sirmaconsult.statistics.StatisticsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable com.example.sirmaconsult.statistics.StatisticsViewModel Viewmodel) {
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
                return onChangeViewmodelActiveTasksPercent((androidx.lifecycle.LiveData<java.lang.Float>) object, fieldId);
            case 1 :
                return onChangeViewmodelEmpty((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewmodelCompletedTasksPercent((androidx.lifecycle.LiveData<java.lang.Float>) object, fieldId);
            case 3 :
                return onChangeViewmodelDataLoading((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelActiveTasksPercent(androidx.lifecycle.LiveData<java.lang.Float> ViewmodelActiveTasksPercent, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelEmpty(androidx.lifecycle.LiveData<java.lang.Boolean> ViewmodelEmpty, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelCompletedTasksPercent(androidx.lifecycle.LiveData<java.lang.Float> ViewmodelCompletedTasksPercent, int fieldId) {
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
        java.lang.String statsCompletedTextAndroidStringStatisticsCompletedTasksViewmodelCompletedTasksPercent = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewmodelEmptyGetValue = false;
        androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener viewmodelRefreshAndroidxSwiperefreshlayoutWidgetSwipeRefreshLayoutOnRefreshListener = null;
        int viewmodelDataLoadingViewGONEViewVISIBLE = 0;
        int viewmodelEmptyViewVISIBLEViewGONE = 0;
        java.lang.Boolean viewmodelDataLoadingGetValue = null;
        java.lang.String statsActiveTextAndroidStringStatisticsActiveTasksViewmodelActiveTasksPercent = null;
        int viewmodelEmptyViewGONEViewVISIBLE = 0;
        java.lang.Float viewmodelCompletedTasksPercentGetValue = null;
        java.lang.Boolean viewmodelEmptyGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewmodelDataLoadingGetValue = false;
        java.lang.Float viewmodelActiveTasksPercentGetValue = null;
        androidx.lifecycle.LiveData<java.lang.Float> viewmodelActiveTasksPercent = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewmodelEmpty = null;
        androidx.lifecycle.LiveData<java.lang.Float> viewmodelCompletedTasksPercent = null;
        com.example.sirmaconsult.statistics.StatisticsViewModel viewmodel = mViewmodel;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewmodelDataLoading = null;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x30L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel::refresh
                        viewmodelRefreshAndroidxSwiperefreshlayoutWidgetSwipeRefreshLayoutOnRefreshListener = (((mViewmodelRefreshAndroidxSwiperefreshlayoutWidgetSwipeRefreshLayoutOnRefreshListener == null) ? (mViewmodelRefreshAndroidxSwiperefreshlayoutWidgetSwipeRefreshLayoutOnRefreshListener = new OnRefreshListenerImpl()) : mViewmodelRefreshAndroidxSwiperefreshlayoutWidgetSwipeRefreshLayoutOnRefreshListener).setValue(viewmodel));
                    }
            }
            if ((dirtyFlags & 0x31L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.activeTasksPercent
                        viewmodelActiveTasksPercent = viewmodel.getActiveTasksPercent();
                    }
                    updateLiveDataRegistration(0, viewmodelActiveTasksPercent);


                    if (viewmodelActiveTasksPercent != null) {
                        // read viewmodel.activeTasksPercent.getValue()
                        viewmodelActiveTasksPercentGetValue = viewmodelActiveTasksPercent.getValue();
                    }


                    // read @android:string/statistics_active_tasks
                    statsActiveTextAndroidStringStatisticsActiveTasksViewmodelActiveTasksPercent = statsActiveText.getResources().getString(R.string.statistics_active_tasks, viewmodelActiveTasksPercentGetValue);
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.empty
                        viewmodelEmpty = viewmodel.getEmpty();
                    }
                    updateLiveDataRegistration(1, viewmodelEmpty);


                    if (viewmodelEmpty != null) {
                        // read viewmodel.empty.getValue()
                        viewmodelEmptyGetValue = viewmodelEmpty.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.empty.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewmodelEmptyGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelEmptyGetValue);
                if((dirtyFlags & 0x32L) != 0) {
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
            if ((dirtyFlags & 0x34L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.completedTasksPercent
                        viewmodelCompletedTasksPercent = viewmodel.getCompletedTasksPercent();
                    }
                    updateLiveDataRegistration(2, viewmodelCompletedTasksPercent);


                    if (viewmodelCompletedTasksPercent != null) {
                        // read viewmodel.completedTasksPercent.getValue()
                        viewmodelCompletedTasksPercentGetValue = viewmodelCompletedTasksPercent.getValue();
                    }


                    // read @android:string/statistics_completed_tasks
                    statsCompletedTextAndroidStringStatisticsCompletedTasksViewmodelCompletedTasksPercent = statsCompletedText.getResources().getString(R.string.statistics_completed_tasks, viewmodelCompletedTasksPercentGetValue);
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
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.dataLoading.getValue()) ? View.GONE : View.VISIBLE
                    viewmodelDataLoadingViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelDataLoadingGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            this.mboundView2.setVisibility(viewmodelEmptyViewVISIBLEViewGONE);
            this.statsActiveText.setVisibility(viewmodelEmptyViewGONEViewVISIBLE);
            this.statsCompletedText.setVisibility(viewmodelEmptyViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            this.refreshLayout.setRefreshing(androidxDatabindingViewDataBindingSafeUnboxViewmodelDataLoadingGetValue);
            this.statisticsLayout.setVisibility(viewmodelDataLoadingViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x30L) != 0) {
            // api target 1

            this.refreshLayout.setOnRefreshListener(viewmodelRefreshAndroidxSwiperefreshlayoutWidgetSwipeRefreshLayoutOnRefreshListener);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.statsActiveText, statsActiveTextAndroidStringStatisticsActiveTasksViewmodelActiveTasksPercent);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.statsCompletedText, statsCompletedTextAndroidStringStatisticsCompletedTasksViewmodelCompletedTasksPercent);
        }
    }
    // Listener Stub Implementations
    public static class OnRefreshListenerImpl implements androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener{
        private com.example.sirmaconsult.statistics.StatisticsViewModel value;
        public OnRefreshListenerImpl setValue(com.example.sirmaconsult.statistics.StatisticsViewModel value) {
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
        flag 0 (0x1L): viewmodel.activeTasksPercent
        flag 1 (0x2L): viewmodel.empty
        flag 2 (0x3L): viewmodel.completedTasksPercent
        flag 3 (0x4L): viewmodel.dataLoading
        flag 4 (0x5L): viewmodel
        flag 5 (0x6L): null
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.dataLoading.getValue()) ? View.GONE : View.VISIBLE
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.dataLoading.getValue()) ? View.GONE : View.VISIBLE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.empty.getValue()) ? View.VISIBLE : View.GONE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.empty.getValue()) ? View.VISIBLE : View.GONE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.empty.getValue()) ? View.GONE : View.VISIBLE
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.empty.getValue()) ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}