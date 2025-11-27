package com.brandyodhiambo.mufasadesignsystem.color

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import com.brandyodhiambo.mufasadesignsystem.theme.token.MufasaColorTokens


val MufasaLightColorScheme = lightColorScheme(
    primary = MufasaColorTokens.PrimaryColor,
    onPrimary = MufasaColorTokens.PrimaryTextColor,
    secondary = MufasaColorTokens.SecondaryColor,
    onSecondary = MufasaColorTokens.SecondaryTextColor,
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

val MufasaDarkColorScheme = darkColorScheme(
    primary = MufasaColorTokens.PrimaryColor,
    onPrimary = MufasaColorTokens.PrimaryTextColor,
    secondary = MufasaColorTokens.SecondaryLightColor,
    onSecondary = MufasaColorTokens.SecondaryTextColor,
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

object MufasaDefaults {
    val LightColorScheme: ColorScheme = MufasaLightColorScheme
    val DarkColorScheme: ColorScheme = MufasaDarkColorScheme
}