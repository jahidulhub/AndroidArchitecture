package com.example.androidarchitecture.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "tasks")
data class Task(
    @PrimaryKey var id: String = UUID.randomUUID().toString(),
    @ColumnInfo var title: String = ""
)