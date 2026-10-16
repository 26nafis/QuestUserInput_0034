package com.example.activity4_userinput.ui.theme

import android.R
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable
fun FormDataDiri(modifier: Modifier){
    //variable' unutk mengingat nilai masukan dari keyboard
    var textNama by remember { mutableStateOf( ="") }
    var textNama by remember {mutableStateOf( ="")}
    var textNama by remember {mutableStateOf( ="")}


    //variable' unutk menyimpan data yang diperoleh dari komponen UI
    var nama by remember { mutableStateOf( ="") }
    var nama by remember { mutableStateOf(="") }
    var nama by remember {mutableStateOf(="")}
    val gender:list<R.string> = listOf("Laki-Laki","Perempuan")
}
