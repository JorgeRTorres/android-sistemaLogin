package com.example.sistemalogin.navegacion

sealed class AppScrenns(val ruta: String){
    object LoginScreen: AppScrenns("Login_Screen")
    object MainScreen: AppScrenns("Main_Screen")
}
