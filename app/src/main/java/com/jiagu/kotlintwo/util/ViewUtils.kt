package com.jiagu.kotlintwo.util

import android.content.Context
import android.content.res.Resources
import android.util.DisplayMetrics
import android.util.TypedValue
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.BaseAdapter
import android.widget.ListView

/**
 * Created by 杨佳星 on 2014/12/30.
 * 视图工具类
 */
object ViewUtils {

    fun listviewHeight(listView: ListView) {
        var height = 0
        val adapter = listView.adapter as BaseAdapter
        if (adapter == null) {
            return
        } else {
            val count = adapter.count
            for (i in 0..count - 1) {
                val view = adapter.getView(i, null, listView)
                view.measure(0, 0)
                height += view.measuredHeight
            }
            height += listView.dividerHeight * (count - 1)
            val lp = listView.layoutParams
            lp.height = height
            listView.layoutParams = lp
        }
    }


    fun getScreenWidth(context: Context): Int {
        val manager = context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
        val metrics = DisplayMetrics()
        manager.defaultDisplay.getMetrics(metrics)
        return metrics.widthPixels
    }

    fun getScreenHeight(context: Context): Int {
        val manager = context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
        val metrics = DisplayMetrics()
        manager.defaultDisplay.getMetrics(metrics)
        return metrics.heightPixels
    }

    fun dpToPx(dp: Float, context: Context): Int {
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, context.resources.displayMetrics).toInt()
    }

    fun spToPx(sp: Float, context: Context): Int {
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, sp, context.resources.displayMetrics).toInt()
    }

    //获取虚拟按键的高度
    fun getNavigationBarHeight(context: Context): Int {
        var result = 0
        val res = context.resources
        val resourceId = res.getIdentifier("navigation_bar_height", "dimen", "android")
        if (resourceId > 0) {
            result = res.getDimensionPixelSize(resourceId)
        }

        return result
    }

}
