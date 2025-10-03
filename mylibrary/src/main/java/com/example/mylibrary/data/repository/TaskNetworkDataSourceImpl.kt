package com.example.mylibrary.data.repository

import com.example.mylibrary.data.model.ModelTaskMessage
import com.example.mylibrary.DependencyInjection.I0Dispatcher
import io.github.jan.supabase.SupabaseClient
import io.github.jan.supabase.postgrest.postgrest
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import javax.inject.Inject


class TaskNetworkDataSourceImpl @Inject constructor(
    private val supabase: SupabaseClient,
    @I0Dispatcher private val ioDispatcher: CoroutineDispatcher,
) :
    TaskNetworkDataSource {

    override suspend fun getMessageData(): ModelTaskMessage =
        withContext(ioDispatcher) {
            supabase.postgrest.rpc("get_random_taskmessage")
                .decodeSingle<ModelTaskMessage>()
        }
}

