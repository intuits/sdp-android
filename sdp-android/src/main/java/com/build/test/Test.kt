package com.build.test

import android.app.Application
import com.build.extensions.checkError

class Test:Application() {

    override fun onCreate() {
        super.onCreate()
        checkError()
    }
}