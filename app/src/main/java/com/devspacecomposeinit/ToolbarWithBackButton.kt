package com.devspacecomposeinit

import android.graphics.drawable.Icon
import android.icu.text.CaseMap.Title
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.TextUnit

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ToolBarWithBackButton (
    title: String,
    onBackClick: () -> Unit
) {
    TopAppBar(
        title = { Text(title)},
        navigationIcon = {
            IconButton(onClick = onBackClick) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "back button"
                )

            }
        }
    )

}