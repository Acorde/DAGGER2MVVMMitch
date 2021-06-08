package com.igor.dagger2mvvm

import android.graphics.drawable.Drawable
import android.os.Bundle
import com.bumptech.glide.RequestManager
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_auth.*
import javax.inject.Inject

class AuthActivity : DaggerAppCompatActivity() {

    @Inject
    @JvmField
    var appLogo: Drawable? = null

    @Inject
    @JvmField
    var requestManager: RequestManager? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
        setLogo()
    }

    private fun setLogo() {
        requestManager?.let { requestManager ->
            appLogo?.let { logo ->
                requestManager.load(logo).into(login_logo)
            }

        }
    }
}