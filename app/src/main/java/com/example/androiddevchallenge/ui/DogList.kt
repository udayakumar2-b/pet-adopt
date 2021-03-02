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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.sampleDogs
import com.example.androiddevchallenge.model.Dog
import com.example.androiddevchallenge.ui.theme.DogListItem
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun DogList(dogs: List<Dog>, onSelect: (Int) -> Unit, modifier: Modifier = Modifier,) {
    val scrollState = rememberLazyListState()
    LazyColumn(state = scrollState, modifier = modifier) {
        items(dogs) {
            dog ->
            DogListItem(dog = dog, onClick = { onSelect(it.id) }, modifier = Modifier.padding(10.dp))
//           Divider(thickness = 5.dp)
        }
    }
}

@Preview("Light Theme")
@Composable
fun DogListLightPreview() {
    MyTheme(darkTheme = false) {
        DogList(sampleDogs, {})
    }
}

@Preview("Dark Theme")
@Composable
fun DogListDarkPreview() {
    MyTheme(darkTheme = true) {
        DogList(sampleDogs, {})
    }
}
