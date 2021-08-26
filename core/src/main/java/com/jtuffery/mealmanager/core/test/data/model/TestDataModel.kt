package com.jtuffery.mealmanager.core.test.data.model

import com.jtuffery.mealmanager.core.test.domain.model.TestEntity

typealias TestDataModel = TestEntity

fun TestDataModel.toEntity() = this