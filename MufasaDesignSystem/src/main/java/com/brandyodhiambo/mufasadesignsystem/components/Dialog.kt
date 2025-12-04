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
