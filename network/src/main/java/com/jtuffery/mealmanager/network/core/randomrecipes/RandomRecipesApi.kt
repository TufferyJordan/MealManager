package com.jtuffery.mealmanager.network.core.randomrecipes

import com.jtuffery.mealmanager.network.core.randomrecipes.response.RandomRecipesResponseModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface RandomRecipesApi {
    @GET("/recipes/random")
    suspend fun getRandomReceipts(@Query("number") number: Int): Response<RandomRecipesResponseModel>
}