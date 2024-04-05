package blue.koneko.konekoconnection.data.models

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector
import blue.koneko.konekoconnection.navigation.ContentScreens

data class BottomBarItem(
    val icon: ImageVector, val contentDescription: String, val label: String, val route: String
) {
    companion object {
        val items = listOf(
            BottomBarItem(
                icon = Icons.Default.Home,
                contentDescription = "Home",
                label = "Home",
                route = ContentScreens.Home.route
            ),
            BottomBarItem(
                icon = Icons.Default.Person,
                contentDescription = "Profile",
                label = "Profile",
                route = ContentScreens.Profile.route
            ),
        )
    }
}
