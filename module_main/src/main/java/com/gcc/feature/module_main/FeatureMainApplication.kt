package com.gcc.feature.module_main

import android.app.Application
import android.content.Context
import com.alibaba.android.arouter.launcher.ARouter

class FeatureMainApplication : Application() {

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
    }

    override fun onCreate() {
        super.onCreate()
        ARouter.init(this)
    }
}