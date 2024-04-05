package blue.koneko.konekoconnection.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import blue.koneko.konekoconnection.ui.content.ContentScreen
import blue.koneko.konekoconnection.ui.login.LoginScreen

@Composable
fun RootNavigation(
    navController: NavHostController
) {
    NavHost(navController = navController, startDestination = RootScreens.Login.route) {
        composable(RootScreens.Login.route) {
            LoginScreen(navController = navController)
        }
        composable(RootScreens.Content.route) {
            ContentScreen(navigateToLoginScreen = {
                navigateToLoginScreen(navController = navController)
            })
        }
    }
}

private fun navigateToLoginScreen(navController: NavHostController) {
    navController.navigate(RootScreens.Login.route) {
        popUpTo(RootScreens.Content.route) {
            inclusive = true
        }
    }
}

sealed class RootScreens(val route: String) {
    data object Login : RootScreens("login")
    data object Content: RootScreens("content")
}