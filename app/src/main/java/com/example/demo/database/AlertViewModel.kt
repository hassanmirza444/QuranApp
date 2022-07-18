package com.example.demo.database

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.demo.models.ParaInfo
import com.example.demo.models.SurahInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AlertViewModel
@Inject
constructor(private val surahRepository: SurahRepository,private val paraRepository: ParaRepository) : ViewModel() {

    val getSurahList
        get() = surahRepository.getList.flowOn(Dispatchers.Main)
            .asLiveData(context = viewModelScope.coroutineContext)

    fun insert(user: SurahInfo) {
        viewModelScope.launch {
            surahRepository.insert(user)
        }
    }

    fun delete(user: SurahInfo) {
        viewModelScope.launch {
            surahRepository.delete(user)
        }
    }

    val getParaList
        get() = paraRepository.getList.flowOn(Dispatchers.Main)
            .asLiveData(context = viewModelScope.coroutineContext)

    fun insert(para: ParaInfo) {
        viewModelScope.launch {
            paraRepository.insert(para)
        }
    }

    fun delete(user: ParaInfo) {
        viewModelScope.launch {
            paraRepository.delete(user)
        }
    }
}