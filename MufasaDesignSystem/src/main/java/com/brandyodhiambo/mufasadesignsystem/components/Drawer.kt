package com.brandyodhiambo.mufasadesignsystem.components

import androidx.compose.material3.DrawerState
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.PermanentDrawerSheet
import androidx.compose.material3.PermanentNavigationDrawer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun MufasaModalDrawer(
    drawerState: DrawerState,
    items: List<MufasaDrawerItem>,
    content: @Composable () -> Unit,
    drawerContainerColor: Color = MaterialTheme.colorScheme.surface,
) {
    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet(
                drawerContainerColor = drawerContainerColor,
            ) {
                items.forEach { item ->
                    NavigationDrawerItem(
                        label = { Text(item.label) },
                        icon = { Icon(item.icon, contentDescription = item.label) },
                        selected = false,
                        onClick = item.onClick
                    )
                }
            }
        }
    ) {
        content()
    }
}

@Composable
fun MufasaPermanentDrawer(
    items: List<MufasaDrawerItem>,
    content: @Composable () -> Unit,
    drawerContainerColor: Color = MaterialTheme.colorScheme.surface,
) {
    PermanentNavigationDrawer(
        drawerContent = {
            PermanentDrawerSheet(
                drawerContainerColor = drawerContainerColor
            ) {
                items.forEach { item ->
                    NavigationDrawerItem(
                        label = { Text(item.label) },
                        icon = { Icon(item.icon, contentDescription = item.label) },
                        selected = false,
                        onClick = item.onClick
                    )
                }
            }
        }
    ) {
        content()
    }
}









data class MufasaDrawerItem(
    val label: String,
    val icon: ImageVector,
    val onClick: () -> Unit
)

