package com.example.test_profileaccountdetails_compose.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.test_profileaccountdetails_compose.R

@Composable
fun ProfileAvatar(painter: Painter) {
    Image(
        painter = painter,
        contentDescription = "profile picture",
        modifier = Modifier.clip(shape = RoundedCornerShape(16.dp))
    )
}