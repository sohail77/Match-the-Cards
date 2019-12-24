package com.example.matchthecards.menufragment

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

class MenuViewModel (application: Application) : AndroidViewModel(application) {


    val context = application.applicationContext
    val difficultyLevel = MutableLiveData<String>()
    val columnSize = MutableLiveData<Int>()


    init {
        difficultyLevel.value = "Amateur"
        columnSize.value = 5
    }

    fun diffIncrementor() {
        if (difficultyLevel.value.equals("Amateur"))
            difficultyLevel.value = "Pro"
        else if (difficultyLevel.value.equals("Pro"))
            difficultyLevel.value = "Legend"
    }

     fun diffDecrementor() {
        if (difficultyLevel.value.equals("Legend"))
            difficultyLevel.value = "Pro"
        else if (difficultyLevel.value.equals("Pro"))
            difficultyLevel.value = "Amateur"
    }

    fun columnSizeIncrementor() {
        columnSize.value = columnSize.value?.inc()
    }

    fun columnSizeDecrementor() {
        columnSize.value = columnSize.value?.dec()
    }
}