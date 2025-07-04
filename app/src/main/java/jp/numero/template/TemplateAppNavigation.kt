package jp.numero.template

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import jp.numero.template.feature.home.homeRoute
import jp.numero.template.feature.home.homeScreen

@Composable
fun TemplateAppNavigation(
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = homeRoute,
    ) {
        homeScreen()
    }
}