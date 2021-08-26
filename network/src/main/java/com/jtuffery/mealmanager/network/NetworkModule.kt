package com.jtuffery.mealmanager.network

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import com.jtuffery.mealmanager.appinfos.AppInfos
import jsonSerializer
import kotlinx.serialization.ExperimentalSerializationApi
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit

const val NAMED_RETROFIT_SPOONACULAR = "NAMED_RETROFIT_SPOONACULAR"

@ExperimentalSerializationApi
val networkModule = module {
    single<Retrofit>(named(NAMED_RETROFIT_SPOONACULAR)) {
        val appInfos: AppInfos = get()

        val okHttpClient = OkHttpClient.Builder()
            .addInterceptor {
                val newRequestUrl = it.request().url
                    .newBuilder()
                    .addQueryParameter("apiKey", appInfos.apiKeys.spoonacular)
                    .build()

                val newRequest = it.request().newBuilder()
                    .url(newRequestUrl)
                    .build()

                it.proceed(newRequest)
            }.build()

        val contentType = "application/json".toMediaType()

        Retrofit.Builder()
            .baseUrl("https://api.spoonacular.com")
            .client(okHttpClient)
            .addConverterFactory(jsonSerializer.asConverterFactory(contentType))
            .build()
    }
}