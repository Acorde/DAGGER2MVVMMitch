package com.igor.dagger2mvvm.di.auth

import com.igor.dagger2mvvm.di.ViewModelKey
import com.igor.dagger2mvvm.ui.auth.AuthViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class AuthViewModelsModules {

    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel::class)
    abstract fun bindAuthViewModel(viewModel: AuthViewModel)
}