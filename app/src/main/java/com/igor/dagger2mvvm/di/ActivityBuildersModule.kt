package com.igor.dagger2mvvm.di

import com.igor.dagger2mvvm.AuthActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {

    @ContributesAndroidInjector
    abstract fun contributeAuthActivity() : AuthActivity
}