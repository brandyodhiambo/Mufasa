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


import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape

/**
 * Variants for Mufasa FAB
 */
enum class MufasaFabVariant {
    Regular,
    Small,
    Large,
    Extended
}

@Composable
fun MufasaFab(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    variant: MufasaFabVariant = MufasaFabVariant.Regular,
    shape: Shape = CircleShape,
    containerColor: Color = MaterialTheme.colorScheme.primary,
    contentColor: Color = MaterialTheme.colorScheme.onPrimary,
    extendedText: @Composable (() -> Unit)? = null,
    extendedIcon: @Composable (() -> Unit)? = null,
    expanded: Boolean = true,
    interactionSource: MutableInteractionSource? = remember { MutableInteractionSource() },
    content: @Composable () -> Unit
) {
    when (variant) {
        MufasaFabVariant.Regular -> {
            FloatingActionButton(
                onClick = onClick,
                modifier = modifier,
                shape = shape,
                containerColor = containerColor,
                contentColor = contentColor,
                elevation = FloatingActionButtonDefaults.elevation(),
            ) {
                content()
            }
        }
        MufasaFabVariant.Small -> {
            SmallFloatingActionButton(
                onClick = onClick,
                modifier = modifier,
                shape = shape,
                containerColor = containerColor,
                contentColor = contentColor,
                elevation = FloatingActionButtonDefaults.elevation(),
            ) {
                content()
            }
        }
        MufasaFabVariant.Large -> {
            LargeFloatingActionButton(
                onClick = onClick,
                modifier = modifier,
                shape = shape,
                containerColor = containerColor,
                contentColor = contentColor,
                elevation = FloatingActionButtonDefaults.elevation(),
            ) {
                content()
            }
        }
        MufasaFabVariant.Extended -> {
            if (extendedIcon != null) {
                if (extendedText != null) {
                    ExtendedFloatingActionButton(
                        onClick = onClick,
                        modifier = modifier,
                        shape = shape,
                        containerColor = containerColor,
                        contentColor = contentColor,
                        elevation = FloatingActionButtonDefaults.elevation(),
                        icon = extendedIcon,
                        text = extendedText,
                        expanded = expanded,
                        interactionSource = interactionSource  ,
                    )
                }
            }
        }
    }
}
