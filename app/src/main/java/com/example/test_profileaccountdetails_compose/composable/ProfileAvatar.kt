package com.example.test_profileaccountdetails_compose.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp

@Composable
fun ProfileAvatar(painter: Painter) {
    Image(
        painter = painter,
        contentDescription = "profile picture",
        modifier = Modifier.clip(shape = RoundedCornerShape(16.dp)).size(150.dp)
    )
}