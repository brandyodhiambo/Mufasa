package com.brandyodhiambo.mufasadesignsystem.components

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import com.brandyodhiambo.mufasadesignsystem.theme.MufasaButtonDefaults

@Composable
fun MufasaAlert(
    modifier: Modifier = Modifier,
    onDismissRequest: () -> Unit,
    title: String? = null,
    message: String? = null,
    confirmText: String = "OK",
    dismissText: String? = null,
    icon: @Composable (() -> Unit)? = null,
    onConfirm: () -> Unit = {},
    onDismiss: (() -> Unit)? = null,
    confirmButtonColors: ButtonColors = MufasaButtonDefaults.primaryColors(),
    dismissButtonColors: ButtonColors = MufasaButtonDefaults.outlineColors(),
    shape: Shape = MaterialTheme.shapes.medium
) {
    AlertDialog(
        modifier = modifier,
        onDismissRequest = onDismissRequest,
        icon = icon,
        title = title?.let {
            { Text(it, style = MaterialTheme.typography.titleLarge) }
        },
        text = message?.let {
            { Text(it, style = MaterialTheme.typography.bodyMedium) }
        },
        confirmButton = {
            MufasaButton(
                onClick = onConfirm,
                colors = confirmButtonColors
            ) { Text(confirmText) }
        },
        dismissButton = dismissText?.let {
            {
                MufasaButton(
                    onClick = { onDismiss?.invoke() },
                    colors = dismissButtonColors
                ) { Text(it) }
            }
        },
        shape = shape
    )
}
