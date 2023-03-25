package com.example.socialnetwork.presentation.splash


import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.socialnetwork.R
import com.example.socialnetwork.presentation.util.Screen
import com.example.socialnetwork.util.Constants
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    navController: NavController
) {
    val scale = remember {
        Animatable(0f) // Use for initial size of image
    }
    val overshootInterpolator = remember {
        OvershootInterpolator(2f) // use to animate the logo
    }
    LaunchedEffect(key1 = true) {
        scale.animateTo(
            targetValue = 1f, // Customize the final size of image
            animationSpec = tween(
                durationMillis = 500, // use for delay in of logo in the splash screen
                easing = {
                    overshootInterpolator.getInterpolation(it)
                }
            )
        )
        delay(Constants.SPLASH_SCREEN_DURATION)
        navController.popBackStack() // used for successfully exit to the app without showing the splash screen
        navController.navigate(Screen.LoginScreen.route) // It used for navigate to the next screen

    }
    Box(
        modifier = Modifier.fillMaxSize(), // user for implement the ui in the screen
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.android), // use for image
            contentDescription = "Logo",
            modifier = Modifier.scale(scale.value)
        )
    }

}