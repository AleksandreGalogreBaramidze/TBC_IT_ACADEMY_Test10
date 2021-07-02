package com.example.testapi.mainfragment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.testapi.models.Titles
import com.example.testapi.retrofit.RetrofitInstant
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainViewModel : ViewModel() {
    private val jsonLiveData = MutableLiveData<List<Titles>>().apply {
        MutableLiveData<MutableLiveData<Titles>>()
    }

    val _jsonLiveData = jsonLiveData

    private val mutableLiveData = MutableLiveData<MutableMap<Int, Titles>>().apply {
        MutableLiveData<MutableMap<Int, Titles>>()
    }

    val _importantsMap = mutableLiveData

    fun init() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                getImage()
            }
        }

    }
    suspend fun getImage(){
        val result = RetrofitInstant.Instance.getResponse()
        if (result.isSuccessful) {
            val items = result.body()
            jsonLiveData.postValue(items)
        }
    }
}