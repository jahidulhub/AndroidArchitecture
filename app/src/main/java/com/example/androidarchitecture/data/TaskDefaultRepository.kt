package com.example.androidarchitecture.data

import androidx.compose.runtime.snapshots.SnapshotApplyResult
import com.example.androidarchitecture.data.local.TaskDao
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class TaskDefaultRepository internal constructor(
    private val taskDao: TaskDao
): TaskRepository{
    override fun getTasks(): Flow<List<Task>> {
        return taskDao.observeTasks()
    }

}