package com.example.jetpack

sealed class Screens (val screen: String){
    data object Home: Screens("home")
    data object Search: Screens("Search")
    data object Notifications: Screens("notifications")
    data object Profile: Screens("profile")
}

