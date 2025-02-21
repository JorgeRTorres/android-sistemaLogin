package com.example.sistemalogin.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sistemalogin.R

@Composable //indica que va a utilizar todas las herramientas de JetPAck compose
fun LoginScreen(){
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            text = "Sistema Login")
        Spacer(modifier = Modifier.padding(vertical = 15.dp))

        Image(painter = painterResource(R.drawable.login), modifier = Modifier.height(80.dp).width(80.dp),contentDescription = "")
        Spacer(modifier = Modifier.padding(vertical = 15.dp))

        var usuario = remember { mutableStateOf("") }
        OutlinedTextField(value = usuario.value, onValueChange = {usuario.value = it}, label = { Text("Ingresa tu usuario") })
        Spacer(modifier = Modifier.padding(vertical = 5.dp))

        var password = remember { mutableStateOf("") }
        OutlinedTextField(value = password.value, onValueChange = {password.value = it}, label = { Text("Ingresa tu contraseña") })
        Spacer(modifier = Modifier.padding(vertical = 15.dp))

        Row (modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center){
            Button(onClick = {}, modifier = Modifier.width(220.dp)) {
                Text(text = "Iniciar Sesion")
            }
        }
    }
}