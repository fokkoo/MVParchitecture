package com.example.mvparchitecture

class RepoImpl: BaseRepo {
    override fun provideData(): Exercise = Exercise("приседание",3,10,100.5)
}