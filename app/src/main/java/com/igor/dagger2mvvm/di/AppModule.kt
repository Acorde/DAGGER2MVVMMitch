package com.igor.dagger2mvvm.di

import android.app.Application
import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.bumptech.glide.request.RequestOptions
import com.igor.dagger2mvvm.BaseApplication
import com.igor.dagger2mvvm.R
import dagger.Module
import dagger.Provides

/**
 * In this module we will declare all the Dependencies we will use in the app like Repository, Glide...
 */

@Module
open class AppModule {



    @Provides
    fun provideRequestOptions(): RequestOptions {
        return RequestOptions().placeholder(R.drawable.white_background)
            .error(R.drawable.white_background)
    }

    @Provides
    fun provideGlideInstance(
        application: BaseApplication?,
        requestOptions: RequestOptions
    ): RequestManager? {
        return application?.let {
            Glide.with(it).setDefaultRequestOptions(requestOptions)
        }
    }

    @Provides
    fun provideAppLogo(application: BaseApplication?): Drawable? {
        return application?.let {
            ContextCompat.getDrawable(it, R.drawable.logo)
        }
    }
}