package com.brandyodhiambo.mufasadesignsystem.components

import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun MufasaBottomBar(
    modifier: Modifier = Modifier,
    items: List<MufasaBottomNavItem>,
    selectedIndex: Int,
    onItemSelected: (Int) -> Unit,
    containerColor: Color = MaterialTheme.colorScheme.surface,
    contentColor: Color = MaterialTheme.colorScheme.onSurface,
) {
    NavigationBar(
        modifier = modifier,
        containerColor = containerColor,
        contentColor = contentColor
    ) {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                selected = index == selectedIndex,
                onClick = { onItemSelected(index) },
                icon = { Icon(item.icon, contentDescription = item.label) },
                label = item.label?.let { { Text(it) } },
                alwaysShowLabel = item.alwaysShowLabel
            )
        }
    }
}

data class MufasaBottomNavItem(
    val icon: ImageVector,
    val label: String? = null,
    val alwaysShowLabel: Boolean = false,
)

