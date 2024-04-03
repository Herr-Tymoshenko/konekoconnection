package blue.koneko.konekoconnection.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import blue.koneko.konekoconnection.ui.navigation.destinations.homeComposable
import blue.koneko.konekoconnection.ui.navigation.destinations.loginComposable
import blue.koneko.konekoconnection.utils.Constants.LOGIN_SCREEN

@Composable
fun Navigation(
    navController: NavHostController
) {
    val screen = remember(navController) {
        Screens(navController)
    }

    NavHost(navController = navController, startDestination = LOGIN_SCREEN) {
        loginComposable(navigateToHomeScreen = screen.home)
        homeComposable(navigateToLoginScreen = screen.login)
    }
}