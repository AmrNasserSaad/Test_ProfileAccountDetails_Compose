package com.example.test_profileaccountdetails_compose.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.test_profileaccountdetails_compose.R
import com.example.test_profileaccountdetails_compose.ui.theme.Inter
import com.example.test_profileaccountdetails_compose.ui.theme.TextColorElHendawy

@Preview(showSystemUi = true)
@Composable
fun AchievementsSection(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()

    ) {
        Text(
            text = "Achievements",
            color = TextColorElHendawy,
            fontFamily = Inter,
            fontSize = 22.sp,
            fontWeight = FontWeight.SemiBold
        )
        Spacer(modifier = Modifier.height(16.dp))

        Row {
            ImageBottonText(
                "1000 5-Star\n" +
                        " Trips"
            )
            Spacer(modifier = Modifier.width(10.dp))
            ImageBottonText(
                "2 Years with\n" +
                        " Uber"
            )
        }


    }
}

@Composable
private fun ImageBottonText(text: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            modifier = Modifier.size(72.dp),
            alignment = Alignment.Center,
            painter = painterResource(id = R.drawable.item_image),
            contentDescription = null,
            contentScale = ContentScale.Fit,
        )

        Text(
            text = text,
            color = TextColorElHendawy,
            fontFamily = Inter,
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center
        )
    }
}

