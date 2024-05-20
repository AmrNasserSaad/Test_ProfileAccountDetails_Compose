package com.example.test_profileaccountdetails_compose.composable

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.unit.dp
import com.example.test_profileaccountdetails_compose.ui.theme.Black

@Composable
fun TopSectionLogin() {


    Box(
        contentAlignment = Alignment.TopCenter
    ) {

        ImageShapeLogin()

        Row(
            modifier = Modifier.padding(80.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            LogoIcon()
            SpacerHorizontal16()
            Column {
                LogoText(text = "Welcome")
                LogoText(text = "Find House")
            }
        }

        val uiColor = if (isSystemInDarkTheme()) White else Black

        Text(
            modifier = Modifier
                .padding(bottom = 10.dp)
                .align(alignment = Alignment.BottomCenter),
            text = "Log in",
            style = MaterialTheme.typography.headlineLarge,
            color = uiColor
        )

    }
}