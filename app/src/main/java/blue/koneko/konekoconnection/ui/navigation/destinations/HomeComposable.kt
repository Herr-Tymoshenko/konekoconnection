package blue.koneko.konekoconnection.ui.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import blue.koneko.konekoconnection.ui.content.home.HomeScreen
import blue.koneko.konekoconnection.utils.Constants.HOME_SCREEN

fun NavGraphBuilder.homeComposable(
    navigateToLoginScreen: () -> Unit
) {
    composable(
        route = HOME_SCREEN
    ) {
        HomeScreen(navigateToLoginScreen)
    }
}