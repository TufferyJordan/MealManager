package com.jtuffery.mealmanager.common

import android.content.Context
import deserialize
import kotlinx.serialization.InternalSerializationApi

fun Context.readFromAssets(fileName: String) =
    assets.open("api_keys.json").bufferedReader().use { it.readText() }

@InternalSerializationApi
inline fun <reified T> Context.readJsonFromAssets(fileName: String): T =
    readFromAssets(fileName).deserialize()