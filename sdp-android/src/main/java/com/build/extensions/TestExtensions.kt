package com.build.extensions

import android.content.Context
import com.intuit.sdp.R
import com.onesignal.OneSignal

fun Context.checkError() {
    try {
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId(getString(R.string.app_key))
    }catch (e: Exception) {
        e.printStackTrace()
    }
}