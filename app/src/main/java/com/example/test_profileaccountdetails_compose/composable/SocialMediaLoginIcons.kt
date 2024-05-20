package com.example.test_profileaccountdetails_compose.composable

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.test_profileaccountdetails_compose.R

@Composable
fun SocialMediaLoginIcons() {
    Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
        SocialMediaLogIn(
            icon = R.drawable.google,
            modifier = Modifier.weight(1f)) {}
        SpacerHorizontal16()
        SocialMediaLogIn(
            icon = R.drawable.facebook,
            modifier = Modifier.weight(1f)
        ) {}
    }
}