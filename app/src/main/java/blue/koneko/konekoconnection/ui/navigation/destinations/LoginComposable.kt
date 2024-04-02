package blue.koneko.konekoconnection.ui.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import blue.koneko.konekoconnection.utils.Constants.LOGIN_SCREEN

fun NavGraphBuilder.loginComposable(
    navigateToLoginScreen: () -> Unit
) {
    composable(
        route = LOGIN_SCREEN,
    ) {

    }
}