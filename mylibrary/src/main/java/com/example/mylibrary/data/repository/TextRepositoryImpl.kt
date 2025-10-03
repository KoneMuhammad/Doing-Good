package com.example.mylibrary.data.repository

import com.google.firebase.ai.GenerativeModel
import javax.inject.Inject


class TextRepositoryImpl @Inject constructor(val textRemoteDataSource: TextRemoteDataSource): TextRepository {
    override suspend fun generateResponse(instruction: String): String? {
        val lLMResponse = textRemoteDataSource.generateTextResponse(instruction)
        return lLMResponse
