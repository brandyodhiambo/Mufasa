package com.brandyodhiambo.mufasadesignsystem.components


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.brandyodhiambo.mufasadesignsystem.theme.MufasaButtonDefaults

@Composable
fun MufasaButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    enabled: Boolean = true,
    text: String? = null,
    leadingIcon: (@Composable () -> Unit)? = null,
    trailingIcon: (@Composable () -> Unit)? = null,
    colors: ButtonColors = MufasaButtonDefaults.primaryColors(),
    shape: CornerBasedShape = MaterialTheme.shapes.small,
    contentPadding: PaddingValues = PaddingValues(horizontal = 16.dp),
    content: (@Composable () -> Unit)? = null,
) {
    Button(
        onClick = onClick,
        enabled = enabled,
        shape = shape,
        colors = colors,
        modifier = modifier
            .fillMaxWidth()
            .height(56.dp),
        contentPadding = contentPadding
    ) {
        if (content != null) {
            content()
            return@Button
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            if (leadingIcon != null) {
                leadingIcon()
                Spacer(Modifier.width(8.dp))
            }
            text?.let {
                Text(text = it, style = MaterialTheme.typography.labelLarge)
            }
            if (trailingIcon != null) {
                Spacer(Modifier.width(8.dp))
                trailingIcon()
            }
        }
    }
}





/*
Button usage:
*MufasaButton(
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
* */

