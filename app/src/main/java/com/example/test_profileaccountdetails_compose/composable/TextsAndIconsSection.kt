package com.example.test_profileaccountdetails_compose.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.test_profileaccountdetails_compose.R
import com.example.test_profileaccountdetails_compose.ui.theme.BackgroundColorShape
import com.example.test_profileaccountdetails_compose.ui.theme.Inter
import com.example.test_profileaccountdetails_compose.ui.theme.TextColorElHendawy

@Preview(showSystemUi = true)
@Composable
fun TextsAndIconsSection() {
    Column(
        modifier = Modifier.fillMaxWidth().padding(horizontal = 24.dp),
        horizontalAlignment = Alignment.Start
    ) {

        Text(
            text = "Ryusuke",
            color = TextColorElHendawy,
            fontFamily = Inter,
            fontSize = 32.sp,
            fontWeight = FontWeight.SemiBold
        )

        SpacerVertical16()

        Row {
            Image(
                modifier = Modifier.size(20.dp),
                painter = painterResource(id = R.drawable.chip),
                contentDescription = null
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "Uber Pro Diamond",
                color = TextColorElHendawy,
                fontFamily = Inter,
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        UnderlinedTextTest("Has passed a ", "multi-step safety screen")

        SpacerVertical32()

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(48.dp)
        ) {
            TripsText(mainText = "2,523", subText = "Trips")
            Column() {
                Row(
                    modifier = Modifier,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "5.00",
                        color = TextColorElHendawy,
                        fontFamily = Inter,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Image(
                        painter = painterResource(id = R.drawable.star),
                        contentDescription = null,
                    )

                }

                Text(
                    text = "Rating",
                    color = TextColorElHendawy,
                    fontFamily = Inter,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal
                )
            }


            TripsText(mainText = "2", subText = "Years")
        }


    }
}

@Composable
private fun UnderlinedTextTest(text: String, underlinedText: String) {
    Row {
        Image(
            modifier = Modifier.size(20.dp),
            painter = painterResource(id = R.drawable.chip),
            contentDescription = null
        )
        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = text,
            color = TextColorElHendawy,
            fontFamily = Inter,
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal
        )

        Text(
            text = underlinedText,
            textDecoration = TextDecoration.Underline,
            color = TextColorElHendawy,
            fontFamily = Inter,
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal
        )
    }
}


@Composable
fun TripsText(mainText: String, subText: String) {

    Column() {
        Text(
            text = mainText,
            color = TextColorElHendawy,
            fontFamily = Inter,
            fontSize = 22.sp,
            fontWeight = FontWeight.SemiBold
        )

        Text(
            text = subText,
            color = TextColorElHendawy,
            fontFamily = Inter,
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal
        )
    }

}