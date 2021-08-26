package com.jtuffery.mealmanager.network.core.test

import com.jtuffery.mealmanager.network.core.test.response.RandomResponseModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface TestApi {
    @GET("/recipes/random")
    suspend fun getRandomReceipts(@Query("number") number: Int): Response<RandomResponseModel>
}