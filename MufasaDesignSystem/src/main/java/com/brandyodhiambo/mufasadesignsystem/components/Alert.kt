/*
 * Copyright 2025 MUFASA DESIGN SYSTEM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
