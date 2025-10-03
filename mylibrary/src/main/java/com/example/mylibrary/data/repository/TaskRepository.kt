package com.example.mylibrary.data.repository

import com.example.mylibrary.data.model.ModelTaskMessage

interface TaskRepository {
    suspend fun getMessageData() : ModelTaskMessage
}