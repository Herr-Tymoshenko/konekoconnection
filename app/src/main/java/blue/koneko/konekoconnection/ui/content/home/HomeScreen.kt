package blue.koneko.konekoconnection.ui.content.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun HomeScreen(
    navigateToLoginScreen: () -> Unit
) {
    Surface {
        Box(
            modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center
        ) {
            LoginButton(navigateToLoginScreen)
        }
    }
}

@Composable
fun LoginButton(navigateToLoginScreen: () -> Unit) {
    FilledTonalButton(onClick = { navigateToLoginScreen.invoke() }) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = "Logout")
        }
    }
}