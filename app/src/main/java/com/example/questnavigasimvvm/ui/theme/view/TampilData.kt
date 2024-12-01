package com.example.questnavigasimvvm.ui.theme.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.questnavigasimvvm.model.DataSiswa

@Composable
fun TampilDataView(
    modifier: Modifier = Modifier,
    uiState: DataSiswa,
    onBackButton: () -> Unit
){
    Column(
        modifier = Modifier.fillMaxSize().
        padding(16.dp)) {
        TampilData(param = "Nama", argu = uiState.nama)
        TampilData(param = "Gender", argu = uiState.gender)
        TampilData(param = "Email", argu = uiState.email)
        TampilData(param = "NIM", argu = uiState.nim)
        TampilData(param = "Alamat", argu = uiState.alamat)
        TampilData(param = "Notelpon", argu = uiState.notelpon)
        Button(onClick =  onBackButton ) {
            Text(text = "Kembali")
        }
    }
}

@Composable
fun TampilData(param: String, argu: String) {

}