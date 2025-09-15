package com.devspacecomposeinit

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun App () {

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "artistList") {
        composable(route = "artistList") {
            ArtistListScreen(navController)
        }
        composable(
            "artistDetail" + "/{itemId}",
            arguments = listOf(navArgument("itemId") {type = NavType.IntType})
        ) { backStackEntry ->
            val artistId = requireNotNull(backStackEntry.arguments?.getInt("itemId"))

            ArtistDetailsScreen(
                artistId = artistId,
                navController = navController
            )

        }

    }
}