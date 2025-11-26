package com.brandyodhiambo.mufasadesignsystem.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.SheetState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MufasaBottomSheet(
    modifier: Modifier = Modifier,
    bottomSheetState: SheetState,
    onDismissRequest: () -> Unit,
    shape: CornerBasedShape = MaterialTheme.shapes.medium,
    content: @Composable () -> Unit,
    containerColor: Color = MaterialTheme.colorScheme.background,
) {
    ModalBottomSheet(
        modifier = modifier,
        containerColor = containerColor,
        onDismissRequest = onDismissRequest,
        sheetState = bottomSheetState,
        shape = shape,
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(24.dp),
        ) {
            content()
            Spacer(modifier = Modifier.height(32.dp))
        }
    }
}