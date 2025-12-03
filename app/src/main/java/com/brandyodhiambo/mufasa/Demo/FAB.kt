package com.brandyodhiambo.mufasa.Demo

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.brandyodhiambo.mufasadesignsystem.components.MufasaFab
import com.brandyodhiambo.mufasadesignsystem.components.MufasaFabVariant

@Composable
fun FabDemo(modifier: Modifier = Modifier) {

// Regular FAB with icon
MufasaFab(
    onClick = {   }
) {
    Icon(Icons.Default.Add, contentDescription = "Add")
}

// Small FAB
MufasaFab(
    onClick = {   },
    variant = MufasaFabVariant.Small
) {
    Icon(Icons.Default.Edit, contentDescription = "Edit")
}

// Extended FAB with text + icon
val interaction = remember { MutableInteractionSource() }
val isPressed by interaction.collectIsPressedAsState()

MufasaFab(
    variant = MufasaFabVariant.Extended,
    extendedIcon = { Icon(Icons.Default.Add, null) },
    extendedText = { Text("New") },
    expanded = !isPressed,
    interactionSource = interaction,
    onClick = {},
    content = {}
)

}