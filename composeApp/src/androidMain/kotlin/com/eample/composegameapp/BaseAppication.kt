package com.eample.composegameapp

import android.app.Application
import com.eample.composegameapp.di.initKoin

class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin()

    }
}