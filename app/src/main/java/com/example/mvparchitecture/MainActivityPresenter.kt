package com.example.mvparchitecture

class MainActivityPresenter(private val repo: BaseRepo): BasePresenter {

    private var activity: BaseView? = null



    override fun attach(activity: BaseView) {
        this.activity = activity
    }

    override fun deattach() {
        activity = null
    }

    override fun getExercise() {
        val exercise = repo.provideData()
        activity?.showExecise(exercise)
    }

    override fun detach() {

    }
}