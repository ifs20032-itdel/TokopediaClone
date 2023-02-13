package com.yosuahaloho.tokopediaclone.ui.login

import android.app.Activity
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.yosuahaloho.tokopediaclone.core.data.repository.AppRepository

class LoginViewModel(private val repo: AppRepository) : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text

    fun ubahData() {
        _text.postValue("Percobaan yosua")
    }

    fun login(activity: Activity, username: String, password: String) = repo.login(activity, username, password).asLiveData()

}