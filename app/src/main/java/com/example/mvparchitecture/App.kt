package com.example.mvparchitecture

import android.app.Application


class App: Application() {

     lateinit var mainActivityPresenter: MainActivityPresenter

    override fun onCreate() {
        super.onCreate()
        instance = this
        mainActivityPresenter = MainActivityPresenter(RepoImpl())
    }
    companion object{
        lateinit var instance: App
            private set
    }
}