package com.example.test_profileaccountdetails_compose.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.test_profileaccountdetails_compose.ui.theme.CardBackgroundColor
import com.example.test_profileaccountdetails_compose.ui.theme.PrimaryTextColor
import com.example.test_profileaccountdetails_compose.ui.theme.Rubik
import com.example.test_profileaccountdetails_compose.ui.theme.SecondaryTextColor

@Composable
fun InformationCard(title: String, information: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        colors = CardDefaults.cardColors(containerColor = CardBackgroundColor),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(0.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(horizontal = 24.dp, vertical = 16.dp)
        ) {

            Text(
                text = title,
                color = SecondaryTextColor,
                fontFamily = Rubik,
                fontSize = 9.sp,
                fontWeight = FontWeight.Normal

            )
            Text(
                text = information,
                color = PrimaryTextColor,
                fontFamily = Rubik,
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal

            )

        }
    }


}