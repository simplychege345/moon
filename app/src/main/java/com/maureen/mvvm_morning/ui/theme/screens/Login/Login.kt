package com.maureen.mvvm_morning.ui.theme.screens.Login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.semantics.SemanticsProperties.ImeAction
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
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
import com.maureen.mvvm_morning.ui.theme.screens.Signin.SigninScreen

@Composable
fun loginScreen(navHostController: NavHostController) {
    var Email by remember { mutableStateOf("") }
    var Password by remember { mutableStateOf("") }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(1.dp)
            .background(Color.Cyan)
    ) {
        Text(
            text = "Welcome Back",
            color = Color.White,
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive,
        )
        Text(
            text = "Login to your account",
            color = Color.White,
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive,
        )


        OutlinedTextField(
            value = Email,
            onValueChange = { Email = it },
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "pass") },
            label = {
                Text(
                    text = "User Name/Mail",
                    color = Color.Black,
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 30.dp),
        )
        OutlinedTextField(
            value = Password,
            onValueChange = { Password = it },
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "pass") },
//            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "pass") },
            label = {
                Text(
                    text = " password",
                    color = Color.Black,
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 30.dp),
        )
        Spacer(modifier = Modifier.height(130.dp))
        Button(
            colors = ButtonDefaults.buttonColors(Color.White),
            onClick = {
                navHostController.navigate(ROUTE_signup)
                Color.White
            },
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                text = "login",
                fontSize = 20.sp,
                color = Color.Magenta,
            )

        }
//        Spacer(modifier = Modifier.height(30.dp))
//        Text(
//            text = "Don't have  an account",
//            color = Color.White,
//            fontSize = 15.sp,
//            fontFamily = FontFamily.Default,
//
//            )
//        Spacer(modifier = Modifier.height(20.dp))
//        Button(onClick ={
//            navHostController.navigate(ROUTE_Login)
//        },
//            modifier=Modifier.fillMaxWidth()
//        )
//        {
//            Text(text = "About")
//
//        }
//        Spacer(modifier = Modifier.height(20.dp))
//        Button(onClick ={
//            navHostController.navigate(ROUTE_Signin)
//        },
//            modifier=Modifier.fillMaxWidth()
//        )
//        {
//            Text(text = "Sign in")
//
//        }
//        Spacer(modifier = Modifier.height(20.dp))
//        Button(onClick ={
//            navHostController.navigate(ROUTE_signup)
//        },
//            modifier=Modifier.fillMaxWidth()
//        )
//        {
//            Text(text = "signup")
//
//        }
//        Spacer(modifier = Modifier.height(20.dp))
//        Button(onClick ={
//            navHostController.navigate(ROUTE_SPLASH)
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
private fun loginnprev() {
    loginScreen(navHostController = rememberNavController())

}