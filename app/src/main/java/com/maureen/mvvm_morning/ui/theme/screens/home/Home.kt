package com.maureen.mvvm_morning.ui.theme.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.magnifier
import androidx.compose.material3.Button
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.maureen.mvvm_morning.navigation.ROUTE_ABOUT
import com.maureen.mvvm_morning.navigation.ROUTE_Login
import com.maureen.mvvm_morning.navigation.ROUTE_SPLASH
import com.maureen.mvvm_morning.navigation.ROUTE_Signin
import com.maureen.mvvm_morning.navigation.ROUTE_signup

@Composable
fun HomeScreen(navController:NavHostController) {
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan)

    ) {
        Text(text = "This is my Homepage",
            color = Color.Gray,
            fontFamily = FontFamily.Cursive,
            fontSize = 30.sp
        )
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick ={
            navController.navigate(ROUTE_ABOUT)
        },
            modifier=Modifier.fillMaxWidth()
        )
        {
            Text(text = "About")
            
        }
//        Spacer(modifier = Modifier.height(20.dp))
//        Button(onClick ={
//            navController.navigate(ROUTE_Login)
//        },
//            modifier=Modifier.fillMaxWidth()
//        )
//        {
//            Text(text = "About")
//
//        }
//        Spacer(modifier = Modifier.height(20.dp))
//        Button(onClick ={
//            navController.navigate(ROUTE_Signin)
//        },
//            modifier=Modifier.fillMaxWidth()
//        )
//        {
//            Text(text = "Sign in")
//
//        }
//        Spacer(modifier = Modifier.height(20.dp))
//        Button(onClick ={
//            navController.navigate(ROUTE_signup)
//        },
//            modifier=Modifier.fillMaxWidth()
//        )
//        {
//            Text(text = "signup")
//
//        }
//        Spacer(modifier = Modifier.height(20.dp))
//        Button(onClick ={
//            navController.navigate(ROUTE_SPLASH)
//        },
//            modifier=Modifier.fillMaxWidth()
//        )
//        {
//            Text(text = "splashscreen")
//
//        }

    }
            
        }
@Preview
@Composable
private fun Homeprev() {
    HomeScreen(navController = rememberNavController())

}