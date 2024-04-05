package blue.koneko.konekoconnection.ui.content

import android.util.Log
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import blue.koneko.konekoconnection.data.models.BottomBarItem
import blue.koneko.konekoconnection.navigation.ContentNavigation

@Composable
fun ContentScreen(navigateToLoginScreen: () -> Unit) {
    val navController = rememberNavController()

    Scaffold(bottomBar = {
        BottomNavigation(navController = navController)
    }, floatingActionButton = {
        AddPhotoButton()
    }) { paddingValues ->
        Log.d("TAG", "ContentScreen: $paddingValues")

        ContentNavigation(navController = navController,
            navigateToLoginScreen = { navigateToLoginScreen() })
    }
}

@Composable
fun BottomNavigation(navController: NavHostController) {
    var selectedItem by remember { mutableIntStateOf(0) }

    NavigationBar {
        BottomBarItem.items.forEachIndexed { index, item ->
            NavigationBarItem(icon = {
                Icon(
                    imageVector = item.icon,
                    contentDescription = item.contentDescription
                )
            },
                label = { Text(text = item.label) },
                selected = selectedItem == index,
                onClick = {
                    selectedItem = index
                    onNavigationItemClick(navController = navController, route = item.route)
                })
        }
    }
}

@Composable
fun AddPhotoButton() {

}

private fun onNavigationItemClick(navController: NavHostController, route: String) {
    navController.navigate(route) {
        popUpTo(navController.graph.id) {
            inclusive = true
        }
    }
}