package com.jtuffery.mealmanager.appinfos

import android.content.Context
import com.jtuffery.mealmanager.common.readJsonFromAssets
import kotlinx.serialization.InternalSerializationApi

private const val API_KEYS_FILE_NAME = "api_keys.json"

@InternalSerializationApi
class AppInfosImpl(context: Context) : AppInfos {
    override val apiKeys = context.readJsonFromAssets<ApiKeysEntity>(API_KEYS_FILE_NAME)
}