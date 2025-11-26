package com.brandyodhiambo.mufasadesignsystem.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun MufasaEmptyStateComponent(
    modifier: Modifier = Modifier,
    image: Int,
    message: String,
    subMessage: String? = null,
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painter = painterResource(id = image),
            contentDescription = null,
        )
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = message,
            style = MaterialTheme.typography.titleMedium.copy(
                textAlign = TextAlign.Center,
            ),
        )
        if (subMessage != null) {
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = subMessage,
                style = MaterialTheme.typography.bodySmall.copy(
                    textAlign = TextAlign.Center,
                ),
            )
        }
    }
}