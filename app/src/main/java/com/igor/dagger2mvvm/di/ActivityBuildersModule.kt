package com.igor.dagger2mvvm.di

import com.igor.dagger2mvvm.di.auth.AuthViewModelsModules
import com.igor.dagger2mvvm.ui.auth.AuthActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(modules = [AuthViewModelsModules::class])
    abstract fun contributeAuthActivity(): AuthActivity
}