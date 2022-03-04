package com.young.weatherlook.app.common

import android.annotation.SuppressLint
import android.app.Activity
import android.app.Application
import android.content.pm.ActivityInfo
import android.os.Bundle

class WeatherLook: Application() {

    companion object {
        private lateinit var application: WeatherLook
        fun getWeatherLook() = application
    }

    override fun onCreate() {
        super.onCreate()
        application = this
        setAllActivitySettings()
    }

    /**
     * 모든 액티비티 화면 공통적인 부분을 수직으로 셋팅
     */
    private fun setAllActivitySettings() {
        registerActivityLifecycleCallbacks(object : ActivityLifecycleCallbacks {
            @SuppressLint("SourceLockedOrientationActivity")
            override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
                activity.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
            }
            override fun onActivityStarted(activity: Activity) {}
            override fun onActivityResumed(activity: Activity) {}
            override fun onActivityPaused(activity: Activity) {}
            override fun onActivityStopped(activity: Activity) {}
            override fun onActivitySaveInstanceState(activity: Activity, bundle: Bundle) {}
            override fun onActivityDestroyed(activity: Activity) {}
        })
    }
}