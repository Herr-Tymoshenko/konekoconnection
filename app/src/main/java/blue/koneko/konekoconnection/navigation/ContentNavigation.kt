package blue.koneko.konekoconnection.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import blue.koneko.konekoconnection.ui.content.home.HomeScreen
import blue.koneko.konekoconnection.ui.content.profile.ProfileScreen

@Composable
fun ContentNavigation(navController: NavHostController, navigateToLoginScreen: () -> Unit) {
    NavHost(navController = navController, startDestination = ContentScreens.Home.route) {
        composable(ContentScreens.Home.route) {
            HomeScreen()
        }
        composable(ContentScreens.Profile.route) {
            ProfileScreen(navigateToLoginScreen = navigateToLoginScreen)
        }
    }
}

sealed class ContentScreens(val route: String) {
    data object Home : ContentScreens("home")

    data object Profile : RootScreens("profile")
}