package com.example.demo.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.demo.models.SurahDetailResponse
import com.example.demo.repository.MainRepository
import com.example.demo.util.ApiState
import com.example.demo.util.QuranAppSharedPreferences
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Qualifier

@HiltViewModel
class VerseListViewModel
@Inject
constructor(private val mainRepository: MainRepository) : ViewModel() {

    val postStateFlow: MutableStateFlow<ApiState> = MutableStateFlow(ApiState.Empty)

    fun getSurah(id: Int) = viewModelScope.launch {
        postStateFlow.value = ApiState.Loading
        mainRepository.getSurahDetailData(id,QuranAppSharedPreferences.instance!!.getEditionString())
            .catch { e ->
                Log.d("hssn ex", e.toString())
                postStateFlow.value = ApiState.Failure(e)
            }.collect { data ->
                Log.d("hssn data", data.toString())
                postStateFlow.value = ApiState.Success(data)
            }
    }

    fun getParah(id: Int) = viewModelScope.launch {
        postStateFlow.value = ApiState.Loading
        mainRepository.getParahDetailData(id,QuranAppSharedPreferences.instance!!.getEditionString())
            .catch { e ->
                Log.d("hssn ex", e.toString())
                postStateFlow.value = ApiState.Failure(e)
            }.collect { data ->
                Log.d("hssn data", data.toString())
                postStateFlow.value = ApiState.Success(data)
            }
    }
}