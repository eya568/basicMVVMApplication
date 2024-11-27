package com.example.movie

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

class MainApplication {
    @HiltAndroidApp
    class MainApplication: Application()
}