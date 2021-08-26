package com.jtuffery.mealmanager

import com.jtuffery.mealmanager.appinfos.AppInfos
import com.jtuffery.mealmanager.appinfos.AppInfosImpl
import com.jtuffery.mealmanager.navigation.AppNavigator
import com.jtuffery.mealmanager.navigation.Navigator
import kotlinx.serialization.InternalSerializationApi
import org.koin.dsl.module

@InternalSerializationApi
val mainModule = module {
    single<AppInfos> { AppInfosImpl(get()) }
    single<Navigator> { AppNavigator() }
}