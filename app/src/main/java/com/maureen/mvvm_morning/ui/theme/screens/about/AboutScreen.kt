package com.maureen.mvvm_morning.ui.theme.screens.about

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.maureen.mvvm_morning.navigation.ROUTE_ABOUT
import com.maureen.mvvm_morning.navigation.ROUTE_Login
import com.maureen.mvvm_morning.navigation.ROUTE_SPLASH
import com.maureen.mvvm_morning.navigation.ROUTE_Signin
import com.maureen.mvvm_morning.navigation.ROUTE_signup
import com.maureen.mvvm_morning.ui.theme.screens.signup.Signupscreen

@Composable
fun Aboutscreen(navController: NavHostController) {
    Column (horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Green)

    ){
        Text(text = "This is my About us page",
            color= Color.DarkGray,
            fontSize = 30.sp
            )
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick ={
            navController.navigate(ROUTE_Login)
        },
            modifier=Modifier.fillMaxWidth()
        )
        {
            Text(text = "Login")

        }

        }

//        Spacer(modifier = Modifier.height(20.dp))
//        Button(onClick ={
//            navController.navigate(ROUTE_Login)
//        },
//            modifier=Modifier.fillMaxWidth()
//        )
//        {
//            Text(text = "Login")
//
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

        }





@Preview
@Composable
private fun Aboutprev() {
    Aboutscreen(navController = rememberNavController())

}