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
package com.example.androiddevchallenge.util

fun getAgeStr(age: Float): String {
    val years = age.toInt()
    val months = Math.round((age % 1) * 12)
    var dateStr = ""

    if (years > 0)
        dateStr = if (years == 1) "1 Year" else "$years Years"
    if (months > 0) {
        if (years > 0) dateStr += " "
        dateStr += if (months == 1) "1 Month" else "$months Months"
    }
    return dateStr
}
