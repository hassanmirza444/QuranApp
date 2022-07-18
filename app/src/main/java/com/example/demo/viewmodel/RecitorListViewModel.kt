package com.example.demo.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.demo.repository.MainRepository
import com.example.demo.util.ApiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RecitorListViewModel
@Inject
constructor(private val mainRepository: MainRepository) : ViewModel() {

    val postStateFlow: MutableStateFlow<ApiState> = MutableStateFlow(ApiState.Empty)

    fun getAllRecitorsListofGivenType(type : String) = viewModelScope.launch {
        postStateFlow.value = ApiState.Loading
        mainRepository.getAllRecitorsListofGivenType(type)
            .catch { e ->
                Log.d("hssn ex", e.toString())
                postStateFlow.value = ApiState.Failure(e)
            }.collect { data ->
                Log.d("hssn data", data.toString())
                postStateFlow.value = ApiState.Success(data)
            }
    }





}