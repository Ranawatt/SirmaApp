package com.example.sirmaconsult.statistics

import com.example.sirmaconsult.data.Task
import org.hamcrest.CoreMatchers.`is`
import org.junit.After
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class StatisticsUtilsTest {

    @Before
    fun setUp() {

    }

    @Test
    fun getActiveAndCompletedStats_noCompleted_returnsHundredZero() {

        val tasks = listOf<Task>(
                Task("title","desc", isCompleted = false)
        )

        val result = getActiveAndCompletedStats(tasks)
        assertEquals(result.completedTasksPercent,0f)
        assertEquals(result.activeTasksPercent, 100f)
        assertThat(result.activeTasksPercent, `is`(100f))
        assertThat(result.completedTasksPercent, `is`(0f))
    }

    @Test
    fun getActiveAndCompletedStats_noActive_returnsZeroHundred(){

        val task = listOf<Task>(
                Task("title","desc", isCompleted = true)
        )
        val result = getActiveAndCompletedStats(task)

        assertThat(result.completedTasksPercent,`is`(100f))
        assertThat(result.activeTasksPercent,`is`(0f))
    }

    @Test
    fun getActiveAndCompletedStats_both_returnsFortySixty(){
        val task = listOf<Task>(
                Task("title","desc", isCompleted = true),
                Task("title","desc", isCompleted = true),
                Task("title","desc", isCompleted = true),
                Task("title","desc", isCompleted = false),
                Task("title","desc", isCompleted = false)
        )
        val result = getActiveAndCompletedStats(task)

        assertThat(result.activeTasksPercent,`is`(40f))
        assertThat(result.completedTasksPercent,`is`(60f))

    }

    @Test
    fun getActiveAndCompletedStats_empty_returnsZero(){

    }

    @Test
    fun getActiveAndCompletedStats_error_returnsZero(){

    }
    @After
    fun tearDown() {

    }
}