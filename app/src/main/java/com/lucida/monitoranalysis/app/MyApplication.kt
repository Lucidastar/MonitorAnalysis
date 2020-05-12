package com.lucida.monitoranalysis.app

import android.app.Application
import com.lucida.monitoranalysis.utils.MineLogAdapter
import com.orhanobut.logger.Logger

/**
 * @date 2020/5/12 16:42
 * @author hyli
 * description：
 */
class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Logger.addLogAdapter(MineLogAdapter())
    }
}