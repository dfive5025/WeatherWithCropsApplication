package com.taru.ui.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.taru.tools.livedata.LiveDataEvent

abstract class ViewModelBase : ViewModel() {
    private val mSnackBarText = MutableLiveData<LiveDataEvent<String>>()
    val snackBarText: LiveData<LiveDataEvent<String>> = mSnackBarText
}