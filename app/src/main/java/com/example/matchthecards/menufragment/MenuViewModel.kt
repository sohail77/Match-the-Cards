package com.example.matchthecards.menufragment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MenuViewModel : ViewModel() {


    val difficultyLevel = MutableLiveData<String>()
    val columnSize = MutableLiveData<Int>()


    init {
        difficultyLevel.value = "Amateur"
        columnSize.value = 5
    }

    /**
     * These 4 functions are triggered when the + and - buttons are clicked in the UI.
     */
    fun diffIncrementor() {
        when {
            difficultyLevel.value.equals("Amateur") -> difficultyLevel.value = "Pro"
            difficultyLevel.value.equals("Pro") -> difficultyLevel.value = "Legend"
        }
    }

    fun diffDecrementor() {
        when {
            difficultyLevel.value.equals("Legend") -> difficultyLevel.value = "Pro"
            difficultyLevel.value.equals("Pro") -> difficultyLevel.value = "Amateur"
        }
    }

    fun columnSizeIncrementor() {
        columnSize.value = columnSize.value?.inc()
    }

    fun columnSizeDecrementor() {
        columnSize.value = columnSize.value?.dec()
    }
}