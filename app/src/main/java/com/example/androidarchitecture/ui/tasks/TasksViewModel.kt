package com.example.androidarchitecture.ui.tasks

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.ViewModel
import com.example.androidarchitecture.data.Task
import com.example.androidarchitecture.data.TaskDefaultRepository
import com.example.androidarchitecture.data.TaskRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TasksViewModel @Inject constructor(
    tasksRepository: TaskRepository
) : ViewModel() {
    val tasks = tasksRepository.getTasks()
    val task = Task("sample id", "title sample")
}