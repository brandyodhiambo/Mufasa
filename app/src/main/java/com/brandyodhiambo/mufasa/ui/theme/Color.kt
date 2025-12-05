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
package com.brandyodhiambo.mufasa.ui.theme

import androidx.compose.ui.graphics.Color
import com.brandyodhiambo.mufasadesignsystem.color.MufasaDefaults
import com.brandyodhiambo.mufasadesignsystem.theme.token.MufasaColorTokens

val PrimaryColor = Color(0xff800080)
val PrimaryLightColor = Color(0xfffdf2cf)

val SecondaryColor = Color(0xffDFC5FE)
val SecondaryLightColor = Color(0xffF6DEDE)

val PrimaryTextColor = Color(0xffffffff)
val SecondaryTextColor = Color(0xff000000)

val lightColors =
    MufasaDefaults.LightColorScheme.copy(
        primary = PrimaryColor,
        onPrimary = PrimaryTextColor,
        secondary = SecondaryColor,
        onSecondary = SecondaryTextColor,
        tertiary = MufasaColorTokens.PrimaryLightColor,
        onTertiary = MufasaColorTokens.PrimaryTextColor,
        background = MufasaColorTokens.BackgroundLightColor,
        onBackground = Color.Black,
        surface = MufasaColorTokens.SurfaceLight,
        onSurface = Color.Black,
        surfaceVariant = MufasaColorTokens.SurfaceLight,
        onSurfaceVariant = Color.Black,
        secondaryContainer = MufasaColorTokens.PrimaryColor,
        onSecondaryContainer = Color.White,
        error = MufasaColorTokens.ErrorColor,
        onError = MufasaColorTokens.OnErrorColor,
    )

val darkColors =
    MufasaDefaults.DarkColorScheme.copy(
        primary = PrimaryColor,
        onPrimary = PrimaryTextColor,
        secondary = SecondaryColor,
        onSecondary = SecondaryTextColor,
        tertiary = MufasaColorTokens.PrimaryLightColor,
        onTertiary = MufasaColorTokens.PrimaryTextColor,
        background = MufasaColorTokens.BackgroundDarkColor,
        onBackground = Color.White,
        surface = MufasaColorTokens.SurfaceDark,
        onSurface = Color.White,
        surfaceVariant = MufasaColorTokens.SurfaceDark,
        onSurfaceVariant = Color.White,
        secondaryContainer = MufasaColorTokens.PrimaryColor,
        onSecondaryContainer = Color.White,
        error = MufasaColorTokens.ErrorColor,
        onError = MufasaColorTokens.OnErrorColor,
    )
