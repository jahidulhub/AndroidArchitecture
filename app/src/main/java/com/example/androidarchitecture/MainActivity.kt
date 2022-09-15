package com.example.androidarchitecture

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.androidarchitecture.ui.tasks.TasksViewModel
import com.example.androidarchitecture.ui.theme.AndroidArchitectureTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidArchitectureTheme {
                TaskScreen()
            }
        }
    }
}

@Composable
fun TaskScreen(
    viewModel: TasksViewModel = hiltViewModel()
) {
    Text(text = viewModel.task.title)
}

