package com.example.mvparchitecture

interface BasePresenter {

    fun attach(activity: BaseView)

    fun deattach()

    fun getExercise()

    fun detach()
}