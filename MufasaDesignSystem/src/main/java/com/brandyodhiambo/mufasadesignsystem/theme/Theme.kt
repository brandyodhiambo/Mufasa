package com.brandyodhiambo.mufasadesignsystem.theme


import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.runtime.Composable


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

/*
* Theme Usage:
*
* val myBrandColors = MufasaDefaults.LightColorScheme.copy(
    primary = Color(0xFF00BCD4),
    onPrimary = Color.White
)
*
* val typography = MufasaTypography(
        displayLarge = TextStyle(...),
    )

MufasaAppTheme(
    theme = Theme.Light,
    lightColors = myBrandColors,
    shapes = MufasaShapes(
        small = RoundedCornerShape(2.dp),
        medium = RoundedCornerShape(12.dp),
        large = RoundedCornerShape(24.dp)
    ),
    typography = typography
    * {
        AppScreen()
    }
*
*

*
*
* */


enum class Theme {
    Light,
    Dark,
    FollowSystem,
}
