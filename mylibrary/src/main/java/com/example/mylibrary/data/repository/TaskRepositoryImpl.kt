package com.example.mylibrary.data.repository

import com.example.mylibrary.data.model.ModelTaskMessage
import javax.inject.Inject


class TaskRepositoryImpl @Inject constructor(private val taskNetworkDataSource: TaskNetworkDataSource) :
    TaskRepository {

    override suspend fun getMessageData(): ModelTaskMessage =
        taskNetworkDataSource.getMessageData()

}


