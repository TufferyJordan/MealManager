package com.jtuffery.mealmanager.core.randomrecipes.data.model

import com.jtuffery.mealmanager.core.randomrecipes.domain.model.RandomRecipeEntity

typealias RandomRecipeDataModel = RandomRecipeEntity

fun RandomRecipeDataModel.toEntity() = this