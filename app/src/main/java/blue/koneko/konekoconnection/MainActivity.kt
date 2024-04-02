package blue.koneko.konekoconnection

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import blue.koneko.konekoconnection.ui.navigation.Navigation
import blue.koneko.konekoconnection.ui.theme.KonekoconnectionTheme

class MainActivity : ComponentActivity() {
    private lateinit var navController: NavHostController
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen().apply {}
        setContent {
            KonekoconnectionTheme {
                navController = rememberNavController()
                Navigation(navController = navController)
            }
        }
    }
}