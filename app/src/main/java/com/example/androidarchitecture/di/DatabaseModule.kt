package com.example.androidarchitecture.di

import android.content.Context
import androidx.room.Room
import com.example.androidarchitecture.data.TaskDefaultRepository
import com.example.androidarchitecture.data.TaskRepository
import com.example.androidarchitecture.data.local.TaskDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(context: Context) = Room.databaseBuilder(
        context.applicationContext,
        TaskDatabase::class.java,
        "Tasks.db"
    ).build()
}

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Singleton
    @Provides
    fun provideTasksRepository(
        database: TaskDatabase
    ): TaskRepository {
        return TaskDefaultRepository(database.taskDao())
    }
}