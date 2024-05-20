package com.example.test_profileaccountdetails_compose.composable

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.test_profileaccountdetails_compose.R
import com.example.test_profileaccountdetails_compose.ui.theme.Black

@Composable
fun LogoIcon(modifier: Modifier = Modifier) {
    val uiColor = if (isSystemInDarkTheme()) Color.White else Black
    Icon(
        modifier = Modifier.size(42.dp),
        painter = painterResource(id = R.drawable.logo),
        contentDescription = "LogoImage",
        tint = uiColor
    )
}