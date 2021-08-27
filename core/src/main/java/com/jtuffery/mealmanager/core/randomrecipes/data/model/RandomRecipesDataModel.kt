package com.jtuffery.mealmanager.core.randomrecipes.data.model

import com.jtuffery.mealmanager.core.randomrecipes.domain.model.RandomRecipesEntity

typealias RandomRecipesDataModel = RandomRecipesEntity

fun RandomRecipesDataModel.toEntity() = this
