package com.kone.fullbodymuscle.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.kone.fullbodymuscle.ui.screen.LandingScreenRoute
import kotlinx.serialization.Serializable

@Serializable
object LandingScreenTrain

@Composable
fun MyAppNavigation(
    navController: NavHostController = rememberNavController(),
) {


    NavHost(
        navController = navController, startDestination = LandingScreenTrain
    ) {
        composable<LandingScreenTrain> { navBackStackEntry ->
            val landingScreenJson: LandingScreenTrain = navBackStackEntry.toRoute()
            LandingScreenRoute()
        }
    }
}
