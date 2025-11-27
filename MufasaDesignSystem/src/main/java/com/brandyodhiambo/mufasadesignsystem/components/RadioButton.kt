package com.brandyodhiambo.mufasadesignsystem.components

import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonColors
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MufasaRadioButton(
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: RadioButtonColors = RadioButtonDefaults.colors()
) {
    RadioButton(
        selected = selected,
        onClick = onClick,
        enabled = enabled,
        modifier = modifier,
        colors = colors
    )
}
