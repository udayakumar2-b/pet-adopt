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
package com.example.androiddevchallenge.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Female
import androidx.compose.material.icons.outlined.Male
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.sampleDogs
import com.example.androiddevchallenge.model.Dog
import com.example.androiddevchallenge.model.enum.Gender
import com.example.androiddevchallenge.util.getAgeStr

@Composable
fun DogListItem(dog: Dog, onClick: (Dog) -> Unit, modifier: Modifier = Modifier) {

    Card(
        elevation = 2.dp,
        backgroundColor = MaterialTheme.colors.surface,
        modifier = modifier
            .height(80.dp)
            .clickable { onClick(dog) }
    ) {
        Row(
            Modifier,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(
                painter = painterResource(dog.image),
                contentDescription = "Puppy image",
                modifier = Modifier
                    .weight(1f)
                    .aspectRatio(1f)
                    .clip(RectangleShape),
                contentScale = ContentScale.Crop
            )
            Row(
                modifier = Modifier.weight(.35f).background(MaterialTheme.colors.secondary).fillMaxHeight()
                    .clip(RectangleShape),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon((if (dog.gender == Gender.MALE) Icons.Outlined.Male else Icons.Outlined.Female), "Gender", Modifier.size(30.dp))
            }
            Column(
                Modifier
                    .weight(2.65f)
                    .padding(start = 20.dp),
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Row() {
                    Text(text = dog.type, style = MaterialTheme.typography.body1, modifier = Modifier.padding(horizontal = 4.dp))
                }
                Text(text = getAgeStr(dog.age), style = MaterialTheme.typography.subtitle2, modifier = Modifier.padding(horizontal = 4.dp))
                Text(text = "Name: ${dog.name}", style = MaterialTheme.typography.subtitle1, modifier = Modifier.padding(horizontal = 4.dp))
            }
        }
    }
}

@Preview("Light Theme")
@Composable
fun DogListItemLightPreview() {
    MyTheme(darkTheme = false) {
        DogListItem(sampleDogs[0], {})
    }
}

@Preview("Dark Theme")
@Composable
fun DogListItemDarkPreview() {
    MyTheme(darkTheme = true) {
        DogListItem(sampleDogs[0], {})
    }
}
