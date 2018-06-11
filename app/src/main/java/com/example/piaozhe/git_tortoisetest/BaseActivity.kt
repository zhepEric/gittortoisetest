package com.example.piaozhe.git_tortoisetest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by piaozhe on 2018/6/11.
 */
class BaseActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onRestart() {
        super.onRestart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onPause() {
        super.onPause()
    }
}