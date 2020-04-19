package com.example.sirmaconsult.tasks


import androidx.lifecycle.Observer
import androidx.test.core.app.ApplicationProvider
import com.example.sirmaconsult.Event
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.core.IsNot.not
import org.hamcrest.core.IsNull.nullValue
import org.junit.Rule
import org.junit.Test

class TasksViewModelTest {

//    @get:Rule
//    var instantExecutorRule : InstantTaskExecutorRule()
    @Test
    fun addNewTask_setsNewTaskEvent() {
        val tasksViewModel = TasksViewModel(ApplicationProvider.getApplicationContext())

        val observer = Observer<Event<Unit>> {}
        try {
            tasksViewModel.newTaskEvent.observeForever(observer)

            tasksViewModel.addNewTask()

            // Then the new task event is triggered
            val value = tasksViewModel.newTaskEvent.value
            assertThat(value?.getContentIfNotHandled(), (not(nullValue())))
        }finally {
            // Whatever happens, don't forget to remove the observer!
            tasksViewModel.newTaskEvent.removeObserver(observer)
        }
    }
}