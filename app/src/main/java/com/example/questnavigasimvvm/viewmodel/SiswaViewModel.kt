package com.example.questnavigasimvvm.viewmodel

import androidx.lifecycle.ViewModel
import com.example.questnavigasimvvm.model.DataSiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class SiswaViewModel : ViewModel() {

    private val _statusUI = MutableStateFlow(DataSiswa())

    val statusUI: StateFlow<DataSiswa> = _statusUI.asStateFlow()

    fun saveDataSiswa(ls: MutableList<String>){
        _statusUI.update { statusSaatIni ->
            statusSaatIni.copy(
                nama = ls[0],
                gender = ls[1],
                email = ls[2],
                nim = ls[3],
                alamat = ls[4],
                notelpon = ls[5]
            )
        }
    }
}