package com.example.piaozhe.git_tortoisetest

import android.app.Application
import android.content.Context
import android.util.Log

/**
 * Created by piaozhe on 2018/6/11.
 */
class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Log.i("hahah","sssssss")
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
    }

}
