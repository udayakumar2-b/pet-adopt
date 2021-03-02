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
package com.example.androiddevchallenge.data

import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.model.Dog
import com.example.androiddevchallenge.model.enum.Gender
import kotlin.random.Random

private val dummyDescription = listOf<String>(
    "Quisque cursus urna ac fermentum ornare. Pellentesque luctus gravida lorem, quis finibus ipsum. Ut dapibus sit amet nisl vitae rutrum. Cras eleifend orci nec odio feugiat ornare. Quisque ultricies vehicula scelerisque. Curabitur mauris mauris, lacinia quis laoreet a, blandit sit amet enim. Pellentesque lacinia ut arcu in placerat. Maecenas in pellentesque odio. Nam a diam non augue malesuada gravida et quis tellus. Vestibulum venenatis libero et nisi lacinia fermentum nec nec nibh. Sed accumsan tellus eu tellus condimentum rhoncus.",
    "Maecenas tristique blandit leo, eget pellentesque purus porta vel. Integer non lectus interdum, aliquet turpis eget, laoreet leo. Maecenas sed posuere lorem. Vivamus blandit quam turpis, et aliquet purus vestibulum vitae. Nunc vehicula facilisis sem, eget semper nisi vehicula ut. Duis nec augue nulla. Curabitur suscipit sollicitudin sapien, eu lobortis felis efficitur ut.",
    "Fusce bibendum ante quam, sed iaculis nisi viverra sit amet. Nulla ut elit vel risus faucibus posuere. Etiam sed orci rhoncus, posuere magna interdum, dapibus urna. Vivamus nisl neque, iaculis in tincidunt sit amet, auctor sed velit. Proin id quam felis. Nullam nibh arcu, commodo id viverra a, mollis vel sem. Sed aliquet vehicula risus nec tincidunt. Maecenas dolor neque, maximus at metus vel, commodo consectetur nibh. Maecenas blandit, justo non eleifend semper, ipsum arcu ornare ligula, sit amet congue mi est eget nunc."
)

private fun randomAge(): Float {
    return String.format("%.1f", Random.nextDouble(0.3, 2.0)).toFloat()
}

val sampleDogs = listOf<Dog>(
    Dog(1, "Blossom", Gender.FEMALE, randomAge(), "Golden Retriever", dummyDescription[0], R.drawable.golden_retriever_1, false),
    Dog(2, "Blue", Gender.MALE, randomAge(), "Golden Retriever", dummyDescription[1], R.drawable.golden_retriever_2, false),
    Dog(3, "Buttons", Gender.MALE, randomAge(), "Golden Retriever", dummyDescription[0], R.drawable.golden_retriever_3, false),
    Dog(4, "Chance", Gender.FEMALE, randomAge(), "Golden Retriever", dummyDescription[2], R.drawable.golden_retriever_4, false),
    Dog(5, "Champ", Gender.MALE, randomAge(), "Golden Retriever", dummyDescription[0], R.drawable.golden_retriever_5, false),
    Dog(6, "Blossom", Gender.FEMALE, randomAge(), "Beagle", dummyDescription[0], R.drawable.beagle_1, false),
    Dog(7, "Blue", Gender.MALE, randomAge(), "Beagle", dummyDescription[1], R.drawable.beagle_2, false),
    Dog(8, "Buttons", Gender.MALE, randomAge(), "Beagle", dummyDescription[0], R.drawable.beagle_3, false),
    Dog(9, "Chance", Gender.FEMALE, randomAge(), "Beagle", dummyDescription[2], R.drawable.beagle_4, false),
    Dog(10, "Champ", Gender.MALE, randomAge(), "Beagle", dummyDescription[0], R.drawable.beagle_5, false),
    Dog(11, "Blossom", Gender.FEMALE, randomAge(), "Pug", dummyDescription[0], R.drawable.pug_1, false),
    Dog(12, "Blue", Gender.MALE, randomAge(), "Pug", dummyDescription[1], R.drawable.pug_2, false),
    Dog(13, "Buttons", Gender.MALE, randomAge(), "Pug", dummyDescription[0], R.drawable.pug_3, false),
    Dog(14, "Chance", Gender.FEMALE, randomAge(), "Pug", dummyDescription[2], R.drawable.pug_4, false),
    Dog(15, "Champ", Gender.MALE, randomAge(), "Pug", dummyDescription[0], R.drawable.pug_5, false)
).shuffled()
