package blue.koneko.konekoconnection.ui.login

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LoginScreen(
    navigateToHomeScreen: () -> Unit
) {
    Surface {
        Box(
            modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center
        ) {
            LoginButton(navigateToHomeScreen)
        }
    }
}

@Composable
fun LoginButton(navigateToHomeScreen: () -> Unit) {
    FilledTonalButton(onClick = { navigateToHomeScreen.invoke() }) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = "Login with Google")
            Spacer(modifier = Modifier.size(8.dp))
            Icon(imageVector = Icons.Filled.AccountCircle, contentDescription = "login with google")
        }
    }
}