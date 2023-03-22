package com.ncrdesarrollo.apinasa.apodo.view

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ncrdesarrollo.apinasa.apodo.domain.ApodoInteractor
import com.ncrdesarrollo.apinasa.apodo.util.ApodoModel
import kotlinx.coroutines.launch

class ApodoViewModel : ViewModel() {

    private val interactor = ApodoInteractor()

    private val _responseApodoModel = MutableLiveData<ApodoModel>()
    val responseApodoModel: LiveData<ApodoModel> get() = _responseApodoModel

    fun getApodo() {
        viewModelScope.launch {
            _responseApodoModel.postValue(interactor.getApodo())
        }
    }
}
