package com.example.regproject.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = ""){
        composable("reg_screen"){
            RegScreen(navController)
        }
        composable("signin_screen"){
            SignInScreen(navController)
        }
    }
}