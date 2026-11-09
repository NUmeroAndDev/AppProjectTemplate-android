package jp.numero.template

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Surface
import androidx.compose.runtime.remember
import dagger.hilt.android.AndroidEntryPoint
import jp.numero.template.core.ui.navigation.Navigator
import jp.numero.template.core.ui.navigation.rememberNavigationState
import jp.numero.template.feature.home.HomeRoute
import jp.numero.template.ui.theme.TemplateAppTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navigationState = rememberNavigationState(
                startRoute = HomeRoute,
            )
            val navigator = remember(navigationState) {
                Navigator(navigationState)
            }
            TemplateAppTheme {
                Surface(
                    color = androidx.compose.ui.graphics.Color.Black,
                ) {
                    TemplateAppNavigation(
                        navigationState = navigationState,
                        navigator = navigator,
                    )
                }
            }
        }
    }
}
