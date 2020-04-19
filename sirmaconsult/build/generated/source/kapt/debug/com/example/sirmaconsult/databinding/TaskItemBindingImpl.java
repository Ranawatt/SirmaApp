package com.example.sirmaconsult.databinding;
import com.example.sirmaconsult.R;
import com.example.sirmaconsult.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class TaskItemBindingImpl extends TaskItemBinding implements com.example.sirmaconsult.generated.callback.OnClickListener.Listener {

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
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public TaskItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private TaskItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.CheckBox) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.completeCheckbox.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.titleText.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.example.sirmaconsult.generated.callback.OnClickListener(this, 1);
        mCallback2 = new com.example.sirmaconsult.generated.callback.OnClickListener(this, 2);
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
        if (BR.task == variableId) {
            setTask((com.example.sirmaconsult.data.Task) variable);
        }
        else if (BR.viewmodel == variableId) {
            setViewmodel((com.example.sirmaconsult.tasks.TasksViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTask(@Nullable com.example.sirmaconsult.data.Task Task) {
        this.mTask = Task;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.task);
        super.requestRebind();
    }
    public void setViewmodel(@Nullable com.example.sirmaconsult.tasks.TasksViewModel Viewmodel) {
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        boolean taskCompleted = false;
        com.example.sirmaconsult.data.Task task = mTask;
        java.lang.String taskTitleForList = null;
        com.example.sirmaconsult.tasks.TasksViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x5L) != 0) {



                if (task != null) {
                    // read task.completed
                    taskCompleted = task.isCompleted();
                    // read task.titleForList
                    taskTitleForList = task.getTitleForList();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.completeCheckbox.setOnClickListener(mCallback2);
            this.mboundView0.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.completeCheckbox, taskCompleted);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.titleText, taskTitleForList);
            com.example.sirmaconsult.tasks.TasksListBindingKt.setStyle(this.titleText, taskCompleted);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // task.id
                java.lang.String taskId = null;
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // task != null
                boolean taskJavaLangObjectNull = false;
                // task
                com.example.sirmaconsult.data.Task task = mTask;
                // viewmodel
                com.example.sirmaconsult.tasks.TasksViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {



                    taskJavaLangObjectNull = (task) != (null);
                    if (taskJavaLangObjectNull) {


                        taskId = task.getId();

                        viewmodel.openTask(taskId);
                    }
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewmodel.completeTask(task, (CompoundButton) view.isChecked())
                kotlinx.coroutines.Job viewmodelCompleteTaskTaskCompoundButtonCallbackArg0IsChecked = null;
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // task
                com.example.sirmaconsult.data.Task task = mTask;
                // viewmodel
                com.example.sirmaconsult.tasks.TasksViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    if ((((android.widget.CompoundButton) (callbackArg_0))) != (null)) {


                        ((android.widget.CompoundButton) (callbackArg_0)).isChecked();

                        viewmodelCompleteTaskTaskCompoundButtonCallbackArg0IsChecked = viewmodel.completeTask(task, ((android.widget.CompoundButton) (callbackArg_0)).isChecked());
                    }
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): task
        flag 1 (0x2L): viewmodel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}