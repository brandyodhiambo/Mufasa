package com.brandyodhiambo.mufasadesignsystem.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color


object MufasaColorTokens {
    val PrimaryColor = Color(0xff80BA27)
    val PrimaryLightColor = Color(0xfffdf2cf)

    val SecondaryColor = Color(0xff4d3b24)
    val SecondaryLightColor = Color(0xffF6DEDE)

    val PrimaryTextColor = Color(0xffffffff)
    val SecondaryTextColor = Color(0xff000000)

    val SurfaceDark = Color(0xFF393938)
    val SurfaceLight = Color(0xFFf5f4f4)

    val BackgroundLightColor = Color(0xfffefeff)
    val BackgroundDarkColor = Color(0xff2c2c2c)

    val ErrorColor = Color(0xFFFF8989)
    val OnErrorColor = Color(0xFF000000)

    val GreenColor = Color(0xff205a41)
    val RedColor = Color(0xffFF0000)
    val WhiteColor = Color(0XFFFFFFFF)
    val LightGreenColor = Color(0xff59D97D)
}

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