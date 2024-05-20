package com.example.test_profileaccountdetails_compose.composable

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.test_profileaccountdetails_compose.ui.theme.Black

@Composable
fun LogoText(modifier: Modifier = Modifier, text :String) {
    // to change between modes
    val uiColor = if (isSystemInDarkTheme()) Color.White else Black
    Text(
        text = text,
        style = MaterialTheme.typography.headlineMedium,
        color = uiColor,
        maxLines = 1,
    )
}