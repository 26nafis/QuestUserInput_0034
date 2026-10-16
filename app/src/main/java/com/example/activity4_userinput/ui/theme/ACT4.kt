package com.example.activity4_userinput.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FormDataDiri(modifier: Modifier) {

    // variable untuk mengingat nilai masukan dari keyboard
    var textNama by remember { mutableStateOf("") }

    // variable untuk menyimpan data yang diperoleh dari komponen UI
    var textJK by remember { mutableStateOf("") }

    val gender: List<String> = listOf("Laki-Laki", "Perempuan")

    Column(
        modifier = modifier.padding(top = 50.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        OutlinedTextField(
            value = textNama,
            singleLine = true,
            shape = MaterialTheme.shapes.large,
            modifier = Modifier.width(250.dp),
            label = {
                Text(text = "Nama Lengkap")
            },
            onValueChange = {
                textNama = it
            }
        )

        Row {
            gender.forEach { item ->

                Row(
                    modifier = Modifier.selectable(
                        selected = textJK == item,
                        onClick = {
                            textJK = item
                        }
                    ),
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    RadioButton(
                        selected = textJK == item,
                        onClick = {
                            textJK = item
                        }
                    )

                    Text(item)
                }
            }
        }
    }
}