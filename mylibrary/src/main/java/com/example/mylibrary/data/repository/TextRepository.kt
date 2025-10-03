package com.example.mylibrary.data.repository

internal interface TextRepository {

   suspend fun generateResponse(instruction: String): String?

}