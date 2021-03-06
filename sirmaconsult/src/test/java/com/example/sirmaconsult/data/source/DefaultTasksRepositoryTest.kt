package com.example.sirmaconsult.data.source

import com.example.sirmaconsult.MainCoroutineRule
import com.example.sirmaconsult.data.Result

import com.example.sirmaconsult.data.Result.Success
import com.example.sirmaconsult.data.Task
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.hamcrest.core.IsEqual
import org.junit.After
import org.junit.Before

import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test


@ExperimentalCoroutinesApi
class DefaultTasksRepositoryTest {

    private lateinit var tasksRemoteDataSource: FakeDataSource
    private lateinit var tasksLocalDataSource: FakeDataSource

    // Class under test
    private lateinit var tasksRepository: DefaultTasksRepository

    private val task1 = Task("Title1", "Description1")
    private val task2 = Task("Title2", "Description2")
    private val task3 = Task("Title3", "Description3")
    private val remoteTasks = listOf(task1, task2).sortedBy { it.id }
    private val localTasks = listOf(task3).sortedBy { it.id }
    private val newTasks = listOf(task3).sortedBy { it.id }
    @Before
    fun setUp() {

        tasksRemoteDataSource = FakeDataSource(remoteTasks.toMutableList())
        tasksLocalDataSource = FakeDataSource(localTasks.toMutableList())
        // Get a reference to the class under test
        tasksRepository = DefaultTasksRepository(
                // TODO Dispatchers.Unconfined should be replaced with Dispatchers.Main
                //  this requires understanding more about coroutines + testing
                //  so we will keep this as Unconfined for now.
//                tasksRemoteDataSource, tasksLocalDataSource, Dispatchers.Unconfined
//                Replacing above line with this line
                tasksRemoteDataSource,tasksLocalDataSource, Dispatchers.Main)
    }

    @Test
    fun getTasks_requestsAllTasksFromRemoteDataSource() = mainCoroutineRule.runBlockingTest{
        // When tasks are requested from the tasks repository
        val tasks = tasksRepository.getTasks(true) as Success

        // Then tasks are loaded from the remote data source
        assertThat(tasks.data, IsEqual(remoteTasks))
    }

    @ExperimentalCoroutinesApi
    @get:Rule
    var mainCoroutineRule = MainCoroutineRule()
    @After
    fun tearDown() {
    }
}