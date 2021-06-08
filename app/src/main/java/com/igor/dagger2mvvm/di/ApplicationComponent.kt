package com.igor.dagger2mvvm.di

import com.igor.dagger2mvvm.BaseApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidInjectionModule::class, ActivityBuildersModule::class, AppModule::class])
public interface ApplicationComponent : AndroidInjector<BaseApplication> {

    override fun inject(application: BaseApplication)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: BaseApplication): Builder

        fun build(): ApplicationComponent
    }
}