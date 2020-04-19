package com.example.sirmaconsult;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.sirmaconsult.databinding.AddtaskFragBindingImpl;
import com.example.sirmaconsult.databinding.StatisticsFragBindingImpl;
import com.example.sirmaconsult.databinding.TaskItemBindingImpl;
import com.example.sirmaconsult.databinding.TaskdetailFragBindingImpl;
import com.example.sirmaconsult.databinding.TasksFragBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ADDTASKFRAG = 1;

  private static final int LAYOUT_STATISTICSFRAG = 2;

  private static final int LAYOUT_TASKITEM = 3;

  private static final int LAYOUT_TASKDETAILFRAG = 4;

  private static final int LAYOUT_TASKSFRAG = 5;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(5);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.sirmaconsult.R.layout.addtask_frag, LAYOUT_ADDTASKFRAG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.sirmaconsult.R.layout.statistics_frag, LAYOUT_STATISTICSFRAG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.sirmaconsult.R.layout.task_item, LAYOUT_TASKITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.sirmaconsult.R.layout.taskdetail_frag, LAYOUT_TASKDETAILFRAG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.sirmaconsult.R.layout.tasks_frag, LAYOUT_TASKSFRAG);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ADDTASKFRAG: {
          if ("layout/addtask_frag_0".equals(tag)) {
            return new AddtaskFragBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for addtask_frag is invalid. Received: " + tag);
        }
        case  LAYOUT_STATISTICSFRAG: {
          if ("layout/statistics_frag_0".equals(tag)) {
            return new StatisticsFragBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for statistics_frag is invalid. Received: " + tag);
        }
        case  LAYOUT_TASKITEM: {
          if ("layout/task_item_0".equals(tag)) {
            return new TaskItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for task_item is invalid. Received: " + tag);
        }
        case  LAYOUT_TASKDETAILFRAG: {
          if ("layout/taskdetail_frag_0".equals(tag)) {
            return new TaskdetailFragBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for taskdetail_frag is invalid. Received: " + tag);
        }
        case  LAYOUT_TASKSFRAG: {
          if ("layout/tasks_frag_0".equals(tag)) {
            return new TasksFragBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for tasks_frag is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "task");
      sKeys.put(2, "viewmodel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(5);

    static {
      sKeys.put("layout/addtask_frag_0", com.example.sirmaconsult.R.layout.addtask_frag);
      sKeys.put("layout/statistics_frag_0", com.example.sirmaconsult.R.layout.statistics_frag);
      sKeys.put("layout/task_item_0", com.example.sirmaconsult.R.layout.task_item);
      sKeys.put("layout/taskdetail_frag_0", com.example.sirmaconsult.R.layout.taskdetail_frag);
      sKeys.put("layout/tasks_frag_0", com.example.sirmaconsult.R.layout.tasks_frag);
    }
  }
}
