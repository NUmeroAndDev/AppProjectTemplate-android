package jp.numero.template.feature.home

import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavKey
import jp.numero.template.core.ui.navigation.Navigator
import kotlinx.serialization.Serializable

@Serializable
data object HomeRoute : NavKey

fun Navigator.navigateToHome() {
    navigate(HomeRoute)
}

fun EntryProviderScope<NavKey>.homeScreen() {
    entry<HomeRoute> {
        Home()
    }
}
