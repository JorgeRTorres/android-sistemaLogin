package com.example.sistemalogin.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.sistemalogin.navegacion.AppScrenns

@Composable
fun MainScreen(navController: NavController){
    Column (horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()){
        Text(text = "Bienvenido!!!")

        Button(onClick = {navController.navigate(route = AppScrenns.LoginScreen.ruta)}) {
            Text("Regresar")
        }
    }
}