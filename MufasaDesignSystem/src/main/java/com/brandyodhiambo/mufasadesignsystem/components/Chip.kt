package com.brandyodhiambo.mufasadesignsystem.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

@Composable
fun MufasaChip(
    label: String,
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = RoundedCornerShape(50),
    selectedContainerColor: Color = MaterialTheme.colorScheme.primary.copy(alpha = 0.15f),
    selectedLabelColor: Color = MaterialTheme.colorScheme.primary,
    unselectedContainerColor: Color = MaterialTheme.colorScheme.surfaceVariant,
    unselectedLabelColor: Color = MaterialTheme.colorScheme.onSurfaceVariant,
    border: BorderStroke? = null,
    leadingIcon: (@Composable () -> Unit)? = null
) {
    Surface(
        modifier = modifier
            .clip(shape)
            .clickable(enabled = enabled, onClick = onClick),
        color = if (selected) selectedContainerColor else unselectedContainerColor,
        border = border,
        shape = shape
    ) {
        Row(
            modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            leadingIcon?.invoke()
            Text(
                text = label,
                color = if (selected) selectedLabelColor else unselectedLabelColor,
                style = MaterialTheme.typography.labelMedium
            )
        }
    }
}
