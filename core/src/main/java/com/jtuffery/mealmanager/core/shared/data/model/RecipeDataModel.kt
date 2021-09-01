package com.jtuffery.mealmanager.core.shared.data.model

import com.jtuffery.mealmanager.core.shared.domain.model.RecipeEntity

typealias RecipeDataModel = RecipeEntity

fun RecipeDataModel.toEntity() = this