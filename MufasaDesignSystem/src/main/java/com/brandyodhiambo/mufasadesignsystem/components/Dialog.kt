package com.brandyodhiambo.mufasadesignsystem.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MufasaDialog(
    onDismiss: () -> Unit,
    modifier: Modifier = Modifier,
    dismissable: Boolean = true,
    title: @Composable (() -> Unit)? = null,
    icon: @Composable (() -> Unit)? = null,
    dismissButtonContent: @Composable () -> Unit = {},
    confirmButtonContent: @Composable () -> Unit = {},
    dialogBackgroundColor: Color = MaterialTheme.colorScheme.background,
    content: @Composable () -> Unit,
) {
    AlertDialog(
        modifier = modifier.fillMaxWidth(),
        icon = icon,
        containerColor = dialogBackgroundColor,
        onDismissRequest = {
            if (dismissable) onDismiss()
        },
        shape = RoundedCornerShape(8.dp),
        title = title,
        text = content,
        dismissButton = dismissButtonContent,
        confirmButton = confirmButtonContent,
    )
}