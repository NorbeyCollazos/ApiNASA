package com.ncrdesarrollo.apinasa.apodo.view

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ncrdesarrollo.apinasa.apodo.domain.ApodoInteractor
import com.ncrdesarrollo.apinasa.apodo.util.ApodoModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ApodoViewModel @Inject constructor(
    private val interactor: ApodoInteractor
) : ViewModel() {

    private val _responseApodoModel = MutableLiveData<ApodoModel>()
    val responseApodoModel: LiveData<ApodoModel> get() = _responseApodoModel

    fun getApodo() {
        viewModelScope.launch {
            _responseApodoModel.postValue(interactor.getApodo())
        }
    }
}
