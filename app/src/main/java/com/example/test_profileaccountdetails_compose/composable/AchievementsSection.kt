package com.example.test_profileaccountdetails_compose.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.White
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
            .padding(horizontal = 20.dp)
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
            Card(
                modifier = Modifier.size(122.dp, 128.dp),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = White),
                elevation = CardDefaults.cardElevation(0.dp)
            ) {

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
                        modifier = Modifier.padding(start = 8.dp),
                        text = "1000 5-Star\n" +
                                " Trips",
                        color = TextColorElHendawy,
                        fontFamily = Inter,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Center
                    )
                }


            }
            Spacer(modifier = Modifier.width(16.dp))
            Card(
                modifier = Modifier.size(122.dp, 128.dp),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = White),
                elevation = CardDefaults.cardElevation(0.dp)
            ) {

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        modifier = Modifier.size(72.dp),
                        painter = painterResource(id = R.drawable.item_image),
                        contentDescription = null
                    )

                    Text(
                        modifier = Modifier.padding(start = 8.dp),
                        text = "2 Years with \n" +
                                " Uber",
                        color = TextColorElHendawy,
                        fontFamily = Inter,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Center
                    )
                }


            }
        }



    }
}

@Composable
private fun BackGroundElhendawy() {
    Image(
        modifier = Modifier.fillMaxWidth(),
        painter = painterResource(id = R.drawable.background_image),
        contentDescription = null,
        contentScale = ContentScale.Crop,
    )
}
