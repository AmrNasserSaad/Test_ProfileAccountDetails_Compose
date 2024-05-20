package com.example.test_profileaccountdetails_compose.composable

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun TextOrContinueWith() {
    Text(
        text = "or continue with",
        style = MaterialTheme.typography.bodyMedium.copy(color = Color(0xFF64748B))
    )
}