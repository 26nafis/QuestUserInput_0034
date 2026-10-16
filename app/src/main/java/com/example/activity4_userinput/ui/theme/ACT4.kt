package com.example.activity4_userinput.ui.theme

import android.R
import android.R.attr.text
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Arrangement.Top
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

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
    Column(modifier = modifier.padding(top = 50.dp),
        verticalArrangement = Arrangement,Top,
        horizontalAligment = Alignment.CenterHorizontally) {
        OutlinedTextField(
            value = TextNama,
            singleLine = true,
            shape = MaterialTheme.shapes.large,
            modifier = modifier.width(250.dp),
            label = {text(text = "Nama Lenngkap")},
            onValueChange = {
                textNama = it
            }
        )
        Row() {
            gender.forEach {item ->
                Row(modifier = modifier.selectable(
                    selected = textJK == item,
                    onClick = {textJK = item}
                ), verticalAlignment = aligment.CenterVertically) { }
        }

        }
    }
}
