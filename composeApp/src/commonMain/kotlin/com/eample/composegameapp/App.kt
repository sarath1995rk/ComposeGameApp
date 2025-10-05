package com.eample.composegameapp

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.rememberNavController
//import com.eample.composegameapp.navigation.FavoriteNavGraph
//import com.eample.composegameapp.navigation.GameNavGraph
//import com.eample.composegameapp.navigation.GameNavGraph.Dest
//import com.eample.composegameapp.navigation.SearchNavGraph
import com.eample.ui.game.GameScreen
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import composegameapp.composeapp.generated.resources.Res
import composegameapp.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {
    MaterialTheme {
     val bottomPadding = WindowInsets.statusBars.asPaddingValues().calculateBottomPadding()
GameScreen(
    modifier = Modifier.padding(top = bottomPadding).fillMaxSize(),
    onFavoriteClick = {
//        navHostController.navigate(route = FavoriteNavGraph.Dest.Favorite.route)
    }, onSearchClick = {
//        navHostController.navigate(SearchNavGraph.Dest.Search.route)
    }, onClick = {
//        navHostController.navigate(Dest.Details.getRoute(it))
    }
)

//        val navHostController = rememberNavController()
//        val bottomPadding = WindowInsets.statusBars.asPaddingValues().calculateBottomPadding()
//        NavHost(navHostController, startDestination = GameNavGraph.Dest.Root.route) {
//            listOf(
//                GameNavGraph,
//                SearchNavGraph,
//                FavoriteNavGraph
//            ).forEach {
//                it.build(
//                    modifier = Modifier.padding(top = bottomPadding).fillMaxSize(),
//                    navHostController = navHostController,
//                    navGraphBuilder = this
//                )
//            }
//        }
    }
}