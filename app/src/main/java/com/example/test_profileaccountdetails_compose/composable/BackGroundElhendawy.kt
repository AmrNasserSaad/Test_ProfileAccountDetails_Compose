package com.example.test_profileaccountdetails_compose.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.test_profileaccountdetails_compose.R

@Composable
fun BackGroundElhendawy(modifier: Modifier = Modifier) {
    Image(
        modifier = Modifier.fillMaxWidth(),
        painter = painterResource(id = R.drawable.backgroound_image),
        contentDescription = null,
        contentScale = ContentScale.Crop,
    )
}