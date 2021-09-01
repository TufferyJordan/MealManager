package com.jtuffery.mealmanager.network.core.recipedetails

import com.jtuffery.mealmanager.network.core.shared.response.RecipeResponseModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface RecipeDetailsApi {
    @GET("/recipes/{id}/information")
    suspend fun getRecipe(@Path("id") id: Int): Response<RecipeResponseModel>
}