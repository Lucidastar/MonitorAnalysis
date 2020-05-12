package com.lucida.monitoranalysis

import android.app.ActivityManager
import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lucida.monitoranalysis.utils.MineLogAdapter
import com.orhanobut.logger.Logger


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val systemService = getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
        val largeMemoryClass = systemService.largeMemoryClass

        Logger.d("hello"+largeMemoryClass);
    }

    override fun onTrimMemory(level: Int) {
        Logger.d("level级别："+level)
        super.onTrimMemory(level)

    }
}
