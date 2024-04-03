package blue.koneko.konekoconnection.ui.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import blue.koneko.konekoconnection.ui.login.LoginScreen
import blue.koneko.konekoconnection.utils.Constants.LOGIN_SCREEN

fun NavGraphBuilder.loginComposable(
    navigateToHomeScreen: () -> Unit
) {
    composable(
        route = LOGIN_SCREEN,
    ) {
        LoginScreen(navigateToHomeScreen)
    }
}