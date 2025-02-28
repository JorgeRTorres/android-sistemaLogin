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
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.sistemalogin.R
import com.example.sistemalogin.navegacion.AppScrenns

@Composable //indica que va a utilizar todas las herramientas de JetPAck compose
@Preview
fun LoginScreen(navController: NavController){

    var usuario = remember { mutableStateOf("") }
    var password = remember { mutableStateOf("") }
    var errorUsuario = remember { mutableStateOf(false) }
    var errorPassword = remember { mutableStateOf(false) }


    Column(modifier = Modifier.fillMaxSize(),
           verticalArrangement = Arrangement.Center,
           horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            text = "Sistema Login")
        Spacer(modifier = Modifier.padding(vertical = 15.dp))

        Image(painter = painterResource(R.drawable.login),
              modifier = Modifier.height(80.dp).width(80.dp),
              contentDescription = "")
        Spacer(modifier = Modifier.padding(vertical = 15.dp))

        //caja de tecto de usuario
        OutlinedTextField(value = usuario.value,
                          onValueChange = {usuario.value = it},
                          singleLine = true,
                          isError = errorUsuario.value,
                          label = { Text("Ingresa tu usuario") })

        if (errorUsuario.value){
            Text(color = Color.Red, text = "No deje usuario vacio")
        }
        Spacer(modifier = Modifier.padding(vertical = 5.dp))

        //caja de teto de password
        OutlinedTextField(value = password.value,
                          onValueChange = {password.value = it},
                          singleLine = true,
                          visualTransformation = PasswordVisualTransformation(),
                          isError = errorPassword.value,
                          label = { Text("Ingresa tu contraseña") })
        if (errorPassword.value){
            Text(color = Color.Red, text = "No deje password vacio")
        }
        Spacer(modifier = Modifier.padding(vertical = 15.dp))

        //boton
        Row (modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center){
            Button(onClick = {

                if (usuario.value.isEmpty())
                    errorUsuario.value = true
                else{
                    errorUsuario.value = false
                }

                if (password.value.isEmpty())
                    errorPassword.value = true
                else{
                    errorPassword.value = false
                }

                if(!errorUsuario.value && !errorPassword.value){
                    navController.navigate(AppScrenns.MainScreen.ruta)
                }

            }, modifier = Modifier.width(220.dp)) {
                Text(text = "Iniciar Sesion")
            }
        }
    }
}