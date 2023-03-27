/*
 * Copyright (C) 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.quizgame.data

import com.example.quizgame.R

object DataSource {
    val flavors = listOf(
        R.string.vanilla,
        R.string.chocolate,
        R.string.red_velvet,
        R.string.salted_caramel,
        R.string.coffee
    )

    val quantityOptions = listOf(
        Pair(R.string.one_cupcake, 1),
        Pair(R.string.six_cupcakes, 6),
        Pair(R.string.twelve_cupcakes, 12)
    )

    val allWords: Set<String> =
        setOf(
            "1+1",
            "1+2",
            "1+3",
            "1+4",
            "1+5",
            "1+6",
            "1+7",
            "1+8",
            "1+9",
            "1+10",
            "1+11",
        )

    val Guess: Set<String> =
        setOf(
            "1",
            "2",
            "3",
            "4",
        )
}