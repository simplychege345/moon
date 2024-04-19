package com.maureen.mvvm_morning.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.maureen.mvvm_morning.ui.theme.screens.about.Aboutscreen
import com.maureen.mvvm_morning.ui.theme.screens.home.HomeScreen
//import com.maureen.mvvm_morning.ui.theme.screens.Login.LoginScreen
import com.maureen.mvvm_morning.ui.theme.screens.Login.loginScreen
import com.maureen.mvvm_morning.ui.theme.screens.Signin.SigninScreen
//import com.maureen.mvvm_morning.ui.theme.screens.Signin.Signinscreen
//import com.maureen.mvvm_morning.ui.theme.screens.about.Aboutscreen
import com.maureen.mvvm_morning.ui.theme.screens.signup.Signupscreen
import com.maureen.mvvm_morning.ui.theme.screens.splash.SplashScreen

@Composable
fun AppNavHost(modifier: Modifier,
               navController: NavHostController= rememberNavController(),
               startDestination: String= ROUTE_HOME) {
    NavHost(navController = navController, modifier = Modifier,
        startDestination =startDestination ) {

        composable(ROUTE_ABOUT){
            Aboutscreen(navController)
//            Aboutscreen(navController)
        }
        composable(ROUTE_HOME) {
            HomeScreen(navController)
        }

        composable(ROUTE_SPLASH){
            SplashScreen(navController)
        }
        composable(ROUTE_Signin){
           SigninScreen (navController)
        }
        composable(ROUTE_Login){
            loginScreen(navController)

            }
        composable(ROUTE_signup){
            Signupscreen(navController)
        }

    }

}