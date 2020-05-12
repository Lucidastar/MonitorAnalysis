package com.lucida.monitoranalysis

import android.app.ActivityManager
import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.util.SparseArray
import androidx.appcompat.app.AppCompatActivity
import com.lucida.monitoranalysis.utils.MineLogAdapter
import com.orhanobut.logger.Logger
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val systemService = getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
        val largeMemoryClass = systemService.largeMemoryClass

        Logger.d("内存大小："+largeMemoryClass);

        val fl = Runtime.getRuntime().totalMemory() * 1.0f / (1024 * 1024)
        Logger.d("总共内存大小："+fl);



        var bitmap = BitmapFactory.decodeStream(assets.open(""))
        bitmap.byteCount

    }

    override fun onTrimMemory(level: Int) {
        Logger.d("level级别："+level)
        super.onTrimMemory(level)

    }

    fun testSparseArray(){
        var test = SparseArray<Any>()
        test.put(1,1)
    }

    private fun test() : Int{
        return 1
    }
}
