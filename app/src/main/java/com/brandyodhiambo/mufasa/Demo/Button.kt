package com.brandyodhiambo.mufasa.Demo

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.brandyodhiambo.mufasadesignsystem.components.MufasaButton
import com.brandyodhiambo.mufasadesignsystem.theme.MufasaButtonDefaults

@Composable
fun ButtonUsage(modifier: Modifier = Modifier) {
    MufasaButton(
        onClick = {},
        text = "Continue",
        colors = MufasaButtonDefaults.primaryColors()
    )

    MufasaButton(
        onClick = {},
        text = "Retry",
        colors = MufasaButtonDefaults.outlineColors()
    )

    MufasaButton(
        onClick = {},
        text = "Cancel",
        colors = MufasaButtonDefaults.secondaryColors()
    )
}