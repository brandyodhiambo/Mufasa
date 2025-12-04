/*
 * Copyright 2025 MUFASA DESIGN SYSTEM
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
package com.brandyodhiambo.mufasadesignsystem.theme


import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.runtime.Composable
import com.brandyodhiambo.mufasadesignsystem.color.MufasaDefaults
import com.brandyodhiambo.mufasadesignsystem.shape.DefaultMufasaShapes
import com.brandyodhiambo.mufasadesignsystem.shape.MufasaShapes
import com.brandyodhiambo.mufasadesignsystem.type.DefaultMufasaTypography
import com.brandyodhiambo.mufasadesignsystem.type.MufasaTypography
import com.brandyodhiambo.mufasadesignsystem.type.asMaterialTypography


@Composable
fun MufasaAppTheme(
    theme: Theme = Theme.FollowSystem,
    lightColors: ColorScheme? = null,
    darkColors: ColorScheme? = null,
    shapes: MufasaShapes = DefaultMufasaShapes,
    typography: MufasaTypography = DefaultMufasaTypography,
    content: @Composable () -> Unit,
) {
    val selectedColorScheme = when (theme) {
        Theme.Light -> lightColors ?: MufasaDefaults.LightColorScheme
        Theme.Dark -> darkColors ?: MufasaDefaults.DarkColorScheme
        Theme.FollowSystem ->
            if (isSystemInDarkTheme())
                darkColors ?: MufasaDefaults.DarkColorScheme
            else
                lightColors ?: MufasaDefaults.LightColorScheme
    }

    MaterialTheme(
        colorScheme = selectedColorScheme,
        typography = typography.asMaterialTypography(),
        shapes = Shapes(
            small = shapes.small,
            medium = shapes.medium,
            large = shapes.large,
        ),
        content = content
    )
}

enum class Theme {
    Light,
    Dark,
    FollowSystem,
}
