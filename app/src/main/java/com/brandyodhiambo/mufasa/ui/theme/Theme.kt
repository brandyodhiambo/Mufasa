package com.brandyodhiambo.mufasa.ui.theme

import androidx.compose.runtime.Composable
import com.brandyodhiambo.mufasadesignsystem.theme.MufasaAppTheme
import com.brandyodhiambo.mufasadesignsystem.theme.Theme


@Composable
fun AppTheme(
    content: @Composable () -> Unit
) {
    MufasaAppTheme(
        theme = Theme.FollowSystem,
        lightColors = lightColors,
        darkColors = darkColors,
        shapes = customShapes,
        content = content
    )
}