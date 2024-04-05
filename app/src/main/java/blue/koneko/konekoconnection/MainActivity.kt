package blue.koneko.konekoconnection

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import blue.koneko.konekoconnection.navigation.RootNavigation
import blue.koneko.konekoconnection.ui.theme.KonekoconnectionTheme

class MainActivity : ComponentActivity() {
    private lateinit var navController: NavHostController
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen().apply {}
        setContent {
            KonekoconnectionTheme {
                navController = rememberNavController()
                RootNavigation(navController = navController)
            }
        }
    }
}