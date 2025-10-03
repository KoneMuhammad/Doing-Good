package com.example.mylibrary.data.repository

import com.example.mylibrary.data.model.ModelTaskMessage


interface TaskNetworkDataSource {

    suspend fun getMessageData() : ModelTaskMessage
}
