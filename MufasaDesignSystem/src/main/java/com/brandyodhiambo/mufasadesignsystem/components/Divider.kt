package com.brandyodhiambo.mufasadesignsystem.components

import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun MufasaDivider(
    modifier: Modifier = Modifier,
    thickness: Dp = 1.dp,
    color: Color = MaterialTheme.colorScheme.outlineVariant,
    isVertical:Boolean = false
) {
    if (isVertical){
        VerticalDivider(modifier = modifier, thickness = thickness, color = color)
    } else {
        HorizontalDivider(modifier = modifier, thickness = thickness, color = color)
    }
}
