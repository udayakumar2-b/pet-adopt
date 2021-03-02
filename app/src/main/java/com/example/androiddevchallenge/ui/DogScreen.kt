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

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Female
import androidx.compose.material.icons.outlined.Male
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.sampleDogs
import com.example.androiddevchallenge.model.Dog
import com.example.androiddevchallenge.model.enum.Gender
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.util.getAgeStr

@Composable
fun DogScreen(dog: Dog, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(MaterialTheme.colors.surface)
            .verticalScroll(rememberScrollState())
    ) {

        BoxWithConstraints(contentAlignment = Alignment.BottomStart) {
            Image(
                painter = painterResource(id = dog.image),
                contentDescription = "Puppy Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.5f)
                    .aspectRatio(ratio = 1f, false)
            )
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colors.secondary.copy(0.90f)).padding(5.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(dog.type, style = MaterialTheme.typography.h5)
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        (if (dog.gender == Gender.MALE) Icons.Outlined.Male else Icons.Outlined.Female), "Gender",
                        Modifier
                            .size(35.dp)
                    )
                    Text("|", Modifier.padding(horizontal = 7.dp), color = MaterialTheme.colors.onPrimary.copy(0.3f))
                    Text(getAgeStr(dog.age), style = MaterialTheme.typography.h6)
                }
            }
        }
        Column(modifier = Modifier.padding(5.dp)) {
            Text(dog.name, style = MaterialTheme.typography.h4)
            Spacer(Modifier.height(15.dp))
            Text(dog.description)
        }
    }
}

@Preview("Light Theme")
@Composable
fun DogScreenLightPreview() {
    MyTheme(darkTheme = false) {
        DogScreen(sampleDogs[0])
    }
}

@Preview("Dark Theme")
@Composable
fun DogScreenDarkPreview() {
    MyTheme(darkTheme = true) {
        DogScreen(sampleDogs[0])
    }
}
