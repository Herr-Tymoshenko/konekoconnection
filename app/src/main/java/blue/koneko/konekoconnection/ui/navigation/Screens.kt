package blue.koneko.konekoconnection.ui.navigation

import androidx.navigation.NavHostController
import blue.koneko.konekoconnection.utils.Constants.HOME_SCREEN
import blue.koneko.konekoconnection.utils.Constants.LOGIN_SCREEN

class Screens(navController: NavHostController) {
    val login = {
        navController.popBackStack()
        navController.navigate("login") {
            popUpTo(LOGIN_SCREEN) { inclusive = true }
        }
    }
    val home = {
        navController.popBackStack()
        navController.navigate("home") {
            popUpTo(HOME_SCREEN) { inclusive = true }
        }
    }
}