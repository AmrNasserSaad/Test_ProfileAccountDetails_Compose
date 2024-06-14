package com.example.test_profileaccountdetails_compose.dashBoard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.test_profileaccountdetails_compose.R
import com.example.test_profileaccountdetails_compose.dashBoard.composableFuns.cardFeature
import com.example.test_profileaccountdetails_compose.dashBoard.composableFuns.searchTextFieldWithIcon

@Preview
@Composable
fun previewHomeScreen() {
    HomeScreenDashboard()
}


@Composable
fun HomeScreenDashboard() {

    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(color = Color(android.graphics.Color.parseColor("#f8eeec"))),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ConstraintLayout {
            val (topImg, profile) = createRefs()
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(245.dp)
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(
                                Color(android.graphics.Color.parseColor("#EA6D35")),
                                Color(android.graphics.Color.parseColor("#3b608c"))
                            )
                        ), shape = RoundedCornerShape(bottomEnd = 38.dp, bottomStart = 38.dp)
                    )
                    .constrainAs(topImg) {
                        top.linkTo(parent.top)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    }
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 48.dp, start = 24.dp, end = 24.dp)
            ) {
                Column(
                    modifier = Modifier
                        .height(100.dp)
                        .padding(start = 14.dp)
                        .weight(0.7f),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = "Hello",
                        color = Color.White,
                        fontSize = 18.sp
                    )
                    Text(
                        text = "Amr Nasser",
                        color = Color.White,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(top = 12.dp)
                    )

                }

                Image(
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = null,
                    modifier = Modifier
                        .size(100.dp)
                        .clickable { },
                )

            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 24.dp, start = 34.dp, end = 34.dp)
                    .shadow(3.dp, shape = RoundedCornerShape(20.dp))
                    .background(color = Color.White, shape = RoundedCornerShape(20.dp))
                    .constrainAs(profile) {
                        top.linkTo(topImg.bottom)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                        bottom.linkTo(topImg.bottom)
                    },
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center

            ) {
                cardFeature(img = R.drawable.video_call, text = "Video Call")
                cardFeature(img = R.drawable.notification, text = "Notification")
                cardFeature(img = R.drawable.voice_call, text = "Voice Call")


            }

        }

        searchTextFieldWithIcon()

        ConstraintLayout(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp, start = 24.dp, end = 24.dp)
                .shadow(3.dp, shape = RoundedCornerShape(24.dp))
                .height(145.dp)
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(
                            Color(android.graphics.Color.parseColor("#4c6184")),
                            Color(android.graphics.Color.parseColor("#f9c177"))
                        )
                    ), shape = RoundedCornerShape(24.dp)
                )
        ) {
            val (img, text1, text2) = createRefs()

            Image(painter = painterResource(id = R.drawable.logo),
                contentDescription = null,
                modifier = Modifier.constrainAs(img) {
                    top.linkTo(parent.top)
                    end.linkTo(parent.end)
                    bottom.linkTo(parent.bottom)
                }
            )
            Text(
                text = "To Get Unlimited",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier
                    .padding(top = 32.dp)
                    .constrainAs(text1) {
                        top.linkTo(parent.top)
                        end.linkTo(img.start)
                        start.linkTo(parent.start)
                    }
            )
            Text(
                text = "Upgrade Your Account",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier
                    .padding(top = 16.dp)
                    .constrainAs(text2) {
                        top.linkTo(text1.bottom)
                        end.linkTo(text1.end)
                        start.linkTo(text1.start)
                    }
            )

        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp, top = 24.dp)
        ) {

            Column(
                modifier = Modifier.weight(0.25f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_1),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(top = 8.dp, bottom = 4.dp)
                        .background(color = Color.White, shape = RoundedCornerShape(10.dp))
                        .padding(16.dp)
                )
                Text(
                    text = "Inbox",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 8.dp),
                    color = Color(android.graphics.Color.parseColor("#2e3d6d")),
                )
            }
            Column(
                modifier = Modifier.weight(0.25f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_2),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(top = 8.dp, bottom = 4.dp)
                        .background(color = Color.White, shape = RoundedCornerShape(10.dp))
                        .padding(16.dp)
                )
                Text(
                    text = "Maps",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 8.dp),
                    color = Color(android.graphics.Color.parseColor("#2e3d6d")),
                )
            }
            Column(
                modifier = Modifier.weight(0.25f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_3),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(top = 8.dp, bottom = 4.dp)
                        .background(color = Color.White, shape = RoundedCornerShape(10.dp))
                        .padding(16.dp)
                )
                Text(
                    text = "Chats",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 8.dp),
                    color = Color(android.graphics.Color.parseColor("#2e3d6d")),
                )
            }
            Column(
                modifier = Modifier.weight(0.25f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_4),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(top = 8.dp, bottom = 4.dp)
                        .background(color = Color.White, shape = RoundedCornerShape(10.dp))
                        .padding(16.dp)
                )
                Text(
                    text = "Report",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 8.dp),
                    color = Color(android.graphics.Color.parseColor("#2e3d6d")),
                )
            }

        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp, top = 24.dp)
        ) {

            Column(
                modifier = Modifier.weight(0.25f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_5),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(top = 8.dp, bottom = 4.dp)
                        .background(color = Color.White, shape = RoundedCornerShape(10.dp))
                        .padding(16.dp)
                )
                Text(
                    text = "Calender",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 8.dp),
                    color = Color(android.graphics.Color.parseColor("#2e3d6d")),
                )
            }
            Column(
                modifier = Modifier.weight(0.25f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_6),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(top = 8.dp, bottom = 4.dp)
                        .background(color = Color.White, shape = RoundedCornerShape(10.dp))
                        .padding(16.dp)
                )
                Text(
                    text = "Tips",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 8.dp),
                    color = Color(android.graphics.Color.parseColor("#2e3d6d")),
                )
            }
            Column(
                modifier = Modifier.weight(0.25f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_7),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(top = 8.dp, bottom = 4.dp)
                        .background(color = Color.White, shape = RoundedCornerShape(10.dp))
                        .padding(16.dp)
                )
                Text(
                    text = "Settings",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 8.dp),
                    color = Color(android.graphics.Color.parseColor("#2e3d6d")),
                )
            }
            Column(
                modifier = Modifier.weight(0.25f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_8),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(top = 8.dp, bottom = 4.dp)
                        .background(color = Color.White, shape = RoundedCornerShape(10.dp))
                        .padding(start = 16.dp, end = 16.dp, top = 32.dp, bottom = 32.dp)
                )
                Text(
                    text = "More",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 8.dp),
                    color = Color(android.graphics.Color.parseColor("#2e3d6d")),
                )
            }

        }


    }
}



