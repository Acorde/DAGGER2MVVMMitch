package com.igor.dagger2mvvm.ui.auth

import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.RequestManager
import com.igor.dagger2mvvm.R
import com.igor.dagger2mvvm.viewmodeld.ViewModelProvidersFactory
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_auth.*
import javax.inject.Inject


class AuthActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var providerFactory: ViewModelProvidersFactory

    private var viewModel: AuthViewModel? = null


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

        initViewModel()
    }

    private fun initViewModel() {
        viewModel = ViewModelProvider(this, providerFactory).get(AuthViewModel::class.java)
    }

    private fun setLogo() {
        requestManager?.let { requestManager ->
            appLogo?.let { logo ->
                requestManager.load(logo).into(login_logo)
            }

        }
    }
}