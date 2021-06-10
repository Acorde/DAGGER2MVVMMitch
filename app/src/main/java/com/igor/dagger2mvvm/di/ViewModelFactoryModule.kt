package com.igor.dagger2mvvm.di

import com.igor.dagger2mvvm.viewmodeld.ViewModelProvidersFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelFactoryModule {

    //Its same like do @Provides -> Because we don't have function body, we are using @Binds instead of @Provides
    @Binds
    abstract fun bindViewModelFactory(modelProvidersFactory: ViewModelProvidersFactory)
}