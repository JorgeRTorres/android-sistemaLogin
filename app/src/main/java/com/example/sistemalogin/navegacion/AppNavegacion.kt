package com.example.sistemalogin.navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.sistemalogin.screens.LoginScreen
import com.example.sistemalogin.screens.MainScreen

@Composable
fun AppNavegacion(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScrenns.LoginScreen.ruta){
        composable(route = AppScrenns.LoginScreen.ruta){
            LoginScreen(navController)
        }
        composable(route = AppScrenns.MainScreen.ruta){
            MainScreen(navController)
        }
    }
}