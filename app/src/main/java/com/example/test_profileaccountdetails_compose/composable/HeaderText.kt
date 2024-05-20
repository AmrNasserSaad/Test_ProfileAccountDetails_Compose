package com.example.test_profileaccountdetails_compose.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.test_profileaccountdetails_compose.ui.theme.PrimaryTextColor
import com.example.test_profileaccountdetails_compose.ui.theme.Rubik
import com.example.test_profileaccountdetails_compose.ui.theme.SecondaryTextColor

@Composable
fun HeaderText(modifier: Modifier = Modifier, title: String, subTitle: String) {

    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.Start
    ) {

        Text(
            text = title,
            color = PrimaryTextColor,
            fontFamily = Rubik,
            fontSize = 18.sp,
            fontWeight = FontWeight.Medium

        )

        Text(
            text = subTitle,
            color = SecondaryTextColor,
            fontFamily = Rubik,
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal
        )
    }
}