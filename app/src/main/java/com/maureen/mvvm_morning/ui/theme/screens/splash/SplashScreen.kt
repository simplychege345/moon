package com.maureen.mvvm_morning.ui.theme.screens.splash

import android.os.Build.VERSION_CODES.S
import android.view.animation.OvershootInterpolator
import android.window.SplashScreen
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.magnifier
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.maureen.mvvm_morning.R
import com.maureen.mvvm_morning.navigation.ROUTE_HOME
import com.maureen.mvvm_morning.navigation.ROUTE_Login
import com.maureen.mvvm_morning.navigation.ROUTE_SPLASH
import com.maureen.mvvm_morning.navigation.ROUTE_Signin
import com.maureen.mvvm_morning.navigation.ROUTE_signup
import kotlinx.coroutines.delay
import java.lang.reflect.Modifier


@Composable
fun SplashScreen(navController: NavHostController) {
    val scale = remember {
        Animatable(0f)
    }

    // AnimationEffect
    LaunchedEffect(key1 = true) {
        scale.animateTo(
            targetValue = 0.7f,
            animationSpec = tween(
                durationMillis = 800,
                easing = {
                    OvershootInterpolator(4f).getInterpolation(it)
                })
        )
        delay(3000L)
        navController.navigate(ROUTE_HOME)
    }

    // Image
    Box(contentAlignment = Alignment.Center,
        modifier = androidx.compose.ui.Modifier.fillMaxSize()) {
        Image(painter = painterResource(id = R.drawable.sneaker1),
            contentDescription = "Logo",)

    }
    Spacer(modifier = androidx.compose.ui.Modifier.height(20.dp))
    Button(onClick ={
        navController.navigate(ROUTE_Login)
    },
        modifier= androidx.compose.ui.Modifier.fillMaxWidth()
    )
    {
        Text(text = "About")

    }
    Spacer(modifier = androidx.compose.ui.Modifier.height(20.dp))
    Button(onClick ={
        navController.navigate(ROUTE_Signin)
    },
        modifier= androidx.compose.ui.Modifier.fillMaxWidth()
    )
    {
        Text(text = "Sign in")

    }
    Spacer(modifier = androidx.compose.ui.Modifier.height(20.dp))
    Button(onClick ={
        navController.navigate(ROUTE_signup)
    },
        modifier= androidx.compose.ui.Modifier.fillMaxWidth()
    )
    {
        Text(text = "signup")

    }
    Spacer(modifier = androidx.compose.ui.Modifier.height(20.dp))
    Button(onClick ={
        navController.navigate(ROUTE_SPLASH)
    },
        modifier= androidx.compose.ui.Modifier.fillMaxWidth()
    )
    {
        Text(text = "splashscreen")

    }


}

@Preview
@Composable
private fun Splashscreenprev() {
    SplashScreen(navController = rememberNavController())

}



    
