package com.brandyodhiambo.mufasadesignsystem.components

import android.annotation.SuppressLint
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDefaults
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.DisplayMode
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf

@SuppressLint("UnrememberedMutableState")
@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun MufasaDatePicker(
    openDateDialog: (Boolean) -> Unit,
    setDate: (Long) -> Unit,
) {
    val datePickerState = rememberDatePickerState(
        initialSelectedDateMillis = null,
        initialDisplayMode = DisplayMode.Picker,
    )

    val confirmEnabled = derivedStateOf { datePickerState.selectedDateMillis != null }

    DatePickerDialog(
        colors = DatePickerDefaults.colors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant,
        ),
        onDismissRequest = {
            openDateDialog(false)
        },
        confirmButton = {
            TextButton(
                onClick = {
                    if (datePickerState.selectedDateMillis != null) {
                        setDate(datePickerState.selectedDateMillis!!)
                    }
                    openDateDialog(false)
                },
                enabled = confirmEnabled.value,
            ) {
                Text(
                    text = "Okay",
                    color = if (confirmEnabled.value) {
                        MaterialTheme.colorScheme.primary
                    } else {
                        MaterialTheme.colorScheme.onSurfaceVariant
                    },
                )
            }
        },
        dismissButton = {
            TextButton(
                onClick = {
                    openDateDialog(false)
                },
            ) {
                Text(
                    text = "Cancel",
                )
            }
        },
    ) {
        DatePicker(
            state = datePickerState,
        )
    }
}