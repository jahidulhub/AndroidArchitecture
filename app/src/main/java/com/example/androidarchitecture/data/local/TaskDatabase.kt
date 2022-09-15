package com.example.androidarchitecture.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.androidarchitecture.data.Task

@Database(
    entities = [Task::class],
    version = 1, exportSchema = false
)
abstract class TaskDatabase : RoomDatabase() {
    abstract fun taskDao(): TaskDao
}