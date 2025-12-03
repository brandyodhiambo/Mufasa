package com.brandyodhiambo.mufasadesignsystem.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

@Composable
fun MufasaSnackbarHost(
    hostState: SnackbarHostState,
    modifier: Modifier = Modifier,
    containerColor: Color = MaterialTheme.colorScheme.primary,
    contentColor: Color = MaterialTheme.colorScheme.onPrimary,
    shape: Shape = MaterialTheme.shapes.medium,
) {
    SnackbarHost(
        hostState = hostState,
        modifier = modifier,
        snackbar = { snackbarData ->
            Snackbar(
                modifier = Modifier.padding(16.dp),
                shape = shape,
                containerColor = containerColor,
                contentColor = contentColor,
                action = {
                    snackbarData.visuals.actionLabel?.let { label ->
                        Text(
                            text = label.uppercase(),
                            style = MaterialTheme.typography.labelLarge,
                            modifier = Modifier.clickable {
                                snackbarData.performAction()
                            }
                        )
                    }
                }
            ) {
                Text(
                    text = snackbarData.visuals.message,
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    )
}
