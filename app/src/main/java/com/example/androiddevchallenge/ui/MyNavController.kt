/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.data.sampleDogs

@Preview
@Composable
fun MyNavController() {
    val navController = rememberNavController()
    Scaffold(topBar = { TopBar() }) {
        NavHost(navController = navController, startDestination = "home") {
            composable("home") {
                BodyContent(navController, Modifier.padding(1.dp))
            }
            composable(
                "dog/{dogId}",
                arguments = listOf(navArgument("dogId") { type = NavType.IntType })
            ) {
                backStackEntry ->
                val id = backStackEntry.arguments?.getInt("dogId")
                var dog = sampleDogs.find { it.id == id }
                DogScreen(dog = dog!!)
            }
        }
    }
}
