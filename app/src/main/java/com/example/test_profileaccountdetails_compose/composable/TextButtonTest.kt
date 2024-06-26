package com.example.test_profileaccountdetails_compose.composable

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.test_profileaccountdetails_compose.ui.theme.Orange
import com.example.test_profileaccountdetails_compose.ui.theme.Rubik

@Composable
fun TextButtonTest(text: String, onClick: () -> Unit) {
    Text(
        text = text,
        color = Orange,
        fontFamily = Rubik,
        fontSize = 14.sp,
        fontWeight = FontWeight.Medium,
        modifier = Modifier.clickable { onClick() }

    )
}