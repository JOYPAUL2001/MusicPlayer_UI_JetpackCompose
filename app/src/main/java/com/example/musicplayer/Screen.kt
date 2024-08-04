package com.example.musicplayer

import androidx.annotation.DrawableRes

sealed class Screen(val title: String, val route: String) {

    sealed class BottomScreen(
        val bTitle:String,val bRoute:String, @DrawableRes val icon :Int
    ):Screen(bTitle,bRoute){

        object Home : BottomScreen("Home", "home", R.drawable.baseline_home_24)

        object Library : BottomScreen(
            "Library", "library", R.drawable.baseline_library_music_24
        )
        object Browse: BottomScreen(
            "Browse", "browse",
            R.drawable.baseline_apps_24
        )
    }

    sealed class DrawerScreen(val dTitle: String, val dRoute: String, @DrawableRes val icon: Int) :
        Screen(dTitle, dRoute) {
        object Account : DrawerScreen(
            "Account",
            "account",
            R.drawable.baseline_account_box_24
        )

        object Subscription : DrawerScreen(
            "Subscription",
            "subsribe",
            R.drawable.baseline_subscriptions_24
        )

        object AddAccount : DrawerScreen(
            "Add Account",
            "add_account",
            R.drawable.baseline_person_add_alt_1_24
        )
    }
}
val screenInDrawer = listOf(
    Screen.DrawerScreen.Account,
    Screen.DrawerScreen.AddAccount,
    Screen.DrawerScreen.Subscription
)
val screensInBottom = listOf(
    Screen.BottomScreen.Home,
    Screen.BottomScreen.Browse,
    Screen.BottomScreen.Library
)