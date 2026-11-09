package jp.numero.template

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.ui.NavDisplay
import jp.numero.template.core.ui.navigation.NavigationState
import jp.numero.template.core.ui.navigation.Navigator
import jp.numero.template.core.ui.navigation.rememberNavigationState
import jp.numero.template.core.ui.navigation.toEntries
import jp.numero.template.feature.home.HomeRoute
import jp.numero.template.feature.home.homeScreen

@Composable
fun TemplateAppNavigation(
    modifier: Modifier = Modifier,
    navigationState: NavigationState = rememberNavigationState(
        startRoute = HomeRoute,
    ),
    navigator: Navigator = remember(navigationState) {
        Navigator(navigationState)
    },
) {
    val entryProvider = remember(navigator) {
        entryProvider {
            homeScreen()
        }
    }

    NavDisplay(
        modifier = modifier,
        entries = navigationState.toEntries(entryProvider),
        onBack = { navigator.goBack() },
    )
}
