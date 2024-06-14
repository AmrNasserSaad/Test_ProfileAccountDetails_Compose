package com.example.test_profileaccountdetails_compose.dashBoard

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.test_profileaccountdetails_compose.R

@Preview
@Composable
fun previewLoginScreen() {
    LoginScreenDashboard()
}

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun LoginScreenDashboard() {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = Color(android.graphics.Color.parseColor("#f8eeec"))),
    ) {
        Image(
            painter = painterResource(id = R.drawable.top_background1),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxWidth()
        )
        Text(
            text = "Welcome\nBack",
            color = Color(android.graphics.Color.parseColor("#Ea6d35")),
            modifier = Modifier.padding(top = 16.dp, start = 24.dp),
            fontSize = 42.sp,
            fontWeight = FontWeight.SemiBold
        )

        var text by rememberSaveable { mutableStateOf("") }
        TextField(
            value = text,
            onValueChange = { text = it },
            leadingIcon = {
                Image(
                    painter = painterResource(id = R.drawable.email),
                    contentDescription = null,
                    modifier = Modifier

                )
            },
            label = { Text(text = "Email") },
            shape = RoundedCornerShape(2.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Transparent,
                unfocusedBorderColor = Color.Transparent,
                unfocusedLabelColor = Color(android.graphics.Color.parseColor("#5e5e5e")),
                focusedLabelColor = Color(android.graphics.Color.parseColor("#5e5e5e")),
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, start = 24.dp, end = 24.dp)
                .shadow(3.dp, shape = RoundedCornerShape(20.dp))
                .background(Color.White)

        )
        var text2 by rememberSaveable { mutableStateOf("") }
        TextField(
            value = text2,
            onValueChange = { text2 = it },
            leadingIcon = {
                Image(
                    painter = painterResource(id = R.drawable.password),
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)

                )
            },
            label = { Text(text = "Password") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            shape = RoundedCornerShape(2.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Transparent,
                unfocusedBorderColor = Color.Transparent,
                unfocusedLabelColor = Color(android.graphics.Color.parseColor("#5e5e5e")),
                focusedLabelColor = Color(android.graphics.Color.parseColor("#5e5e5e")),
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, start = 24.dp, end = 24.dp)
                .shadow(3.dp, shape = RoundedCornerShape(20.dp))
                .background(Color.White)

        )

        Image(painter = painterResource(id = R.drawable.btn_arraw1),
            contentDescription = null,
            modifier = Modifier
                .width(80.dp)
                .padding(top = 24.dp)
                .align(Alignment.End)
                .clickable { }
                .padding(end = 24.dp)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 12.dp, start = 24.dp, end = 24.dp)
        ) {
            // Button

            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(top = 10.dp, bottom = 10.dp, end = 8.dp)
                    .weight(0.5f)
                    .height(55.dp),
                border = BorderStroke(
                    width = 1.dp,
                    color = Color(android.graphics.Color.parseColor("#4d4d4d"))
                ),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                shape = RoundedCornerShape(10.dp)

            ) {

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(0.3f),
                    verticalArrangement = Arrangement.Center,
                ) {
                    Image(painter = painterResource(id = R.drawable.google),
                        contentDescription = null,
                        modifier = Modifier
                            .width(25.dp)
                            .clickable { }
                    )

                }

                Column(
                    modifier = Modifier
                        .padding(start = 14.dp)
                        .weight(0.7f),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = "Google",
                        color = Color(android.graphics.Color.parseColor("#2f4f86")),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )

                }

            }
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(top = 10.dp, bottom = 10.dp, end = 8.dp)
                    .weight(0.5f)
                    .height(55.dp),
                border = BorderStroke(
                    width = 1.dp,
                    color = Color(android.graphics.Color.parseColor("#4d4d4d"))
                ),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                shape = RoundedCornerShape(10.dp)

            ) {

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(0.3f),
                    verticalArrangement = Arrangement.Center,
                ) {
                    Image(painter = painterResource(id = R.drawable.facebook),
                        contentDescription = null,
                        modifier = Modifier
                            .width(25.dp)
                            .clickable { }
                    )

                }

                Column(
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .weight(0.7f),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = "Facebook",
                        color = Color(android.graphics.Color.parseColor("#2f4f86")),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )

                }

            }

        }

        Text(
            text = "Are you a new user? Register now",
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier
                .padding(top = 8.dp)
                .fillMaxWidth(),
            textAlign = TextAlign.Center,
            color = Color(android.graphics.Color.parseColor("#3b608c"))
        )
    }
}