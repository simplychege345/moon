package com.maureen.mvvm_morning.ui.theme.screens.Signin

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.maureen.mvvm_morning.navigation.ROUTE_ABOUT
import com.maureen.mvvm_morning.navigation.ROUTE_Login
import com.maureen.mvvm_morning.navigation.ROUTE_Signin
import com.maureen.mvvm_morning.ui.theme.screens.home.HomeScreen


@Composable
fun SigninScreen(navHostController: NavHostController) {
    val context = LocalContext.current
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(1.dp)
            .background(Color.Cyan)
    ) {
        Text(
            text = "WELCOME TO OUR APP",
            color = Color.White,
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive,
        )
        Spacer(modifier = Modifier.height(90.dp))
        Text(
            text = "Fresh food for everyone",
            color = Color.White,
            fontSize = 19.sp,
            fontFamily = FontFamily.Serif,
        )
        Text(
            text = "You are most welcomed",
            color = Color.White,
            fontSize = 14.sp,
            fontFamily = FontFamily.Serif
        )
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick ={
            navHostController.navigate(ROUTE_Login)
        },
            modifier=Modifier.fillMaxWidth()
        )
        {
            Text(text = "login")

        }
//        Spacer(modifier = Modifier.height(130.dp))
//        Button(
//            colors = ButtonDefaults.buttonColors(Color.White),
//            onClick = {
//                navHostController.navigate(ROUTE_ABOUT)
//                Color.White
//            },
//            modifier = Modifier.fillMaxSize()
//        ) {
//            Text(
//                text = "Signin",
//                fontSize = 20.sp,
//                color = Color.Magenta,
//            )

        }
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "Create an account",
            color = Color.White,
            fontSize = 15.sp,
            fontFamily = FontFamily.Default,

            )
    }


@Preview
@Composable
private fun Signinprev() {
    SigninScreen(navHostController = rememberNavController())

}