package com.example.test_profileaccountdetails_compose.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.test_profileaccountdetails_compose.composable.AchievementsSection
import com.example.test_profileaccountdetails_compose.composable.ImageWithIconsAndCircleImage
import com.example.test_profileaccountdetails_compose.composable.SpacerVertical24
import com.example.test_profileaccountdetails_compose.composable.TextsAndIconsSection
@Preview(showSystemUi = true)
@Composable
fun ProfileScreenElhendawy() {
    Column(modifier = Modifier.fillMaxSize()) {
        ImageWithIconsAndCircleImage()
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp, vertical = 16.dp)
        ) {
            TextsAndIconsSection()
            SpacerVertical24()
            AchievementsSection()

        }
    }
}