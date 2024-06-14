package com.example.test_profileaccountdetails_compose.dashBoard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
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
fun previewRegisterScreen() {
    RegisterScreenDashboard()
}

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun RegisterScreenDashboard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(android.graphics.Color.parseColor("#f8eeec"))),
    ) {
        Image(
            painter = painterResource(id = R.drawable.top_background2),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
            
        )
        Text(
            text = "Create\nAccount",
            color = Color(android.graphics.Color.parseColor("#3b608c")),
            modifier = Modifier.padding(top = 16.dp, start = 24.dp),
            fontSize = 42.sp,
            fontWeight = FontWeight.SemiBold
        )
        var text3 by rememberSaveable { mutableStateOf("") }

        TextField(
            value = text3,
            onValueChange = { text3 = it },
            leadingIcon = {
                Image(
                    painter = painterResource(id = R.drawable.name),
                    contentDescription = null,
                    modifier = Modifier
                        .size(24.dp)

                )
            },
            label = { Text(text = "Username") },
            shape = RoundedCornerShape(2.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = androidx.compose.ui.graphics.Color.Transparent,
                unfocusedBorderColor = androidx.compose.ui.graphics.Color.Transparent,
                unfocusedLabelColor = Color(android.graphics.Color.parseColor("#5e5e5e")),
                focusedLabelColor = Color(android.graphics.Color.parseColor("#5e5e5e")),
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, start = 24.dp, end = 24.dp)
                .shadow(3.dp, shape = RoundedCornerShape(20.dp))
                .background(Color.White)

        )

        var text by rememberSaveable { mutableStateOf("") }
        TextField(
            value = text,
            onValueChange = { text = it },
            leadingIcon = {
                Image(
                    painter = painterResource(id = R.drawable.email),
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)

                )
            },
            label = { Text(text = "Email") },
            shape = RoundedCornerShape(2.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = androidx.compose.ui.graphics.Color.Transparent,
                unfocusedBorderColor = androidx.compose.ui.graphics.Color.Transparent,
                unfocusedLabelColor = Color(android.graphics.Color.parseColor("#5e5e5e")),
                focusedLabelColor = Color(android.graphics.Color.parseColor("#5e5e5e")),
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, start = 24.dp, end = 24.dp)
                .shadow(3.dp, shape = RoundedCornerShape(20.dp))
                .background(androidx.compose.ui.graphics.Color.White)

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
                focusedBorderColor = androidx.compose.ui.graphics.Color.Transparent,
                unfocusedBorderColor = androidx.compose.ui.graphics.Color.Transparent,
                unfocusedLabelColor = Color(android.graphics.Color.parseColor("#5e5e5e")),
                focusedLabelColor = Color(android.graphics.Color.parseColor("#5e5e5e")),
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, start = 24.dp, end = 24.dp)
                .shadow(3.dp, shape = RoundedCornerShape(20.dp))
                .background(androidx.compose.ui.graphics.Color.White)

        )

        Image(painter = painterResource(id = R.drawable.btn_arrow2),
            contentDescription = null,
            modifier = Modifier
                .width(80.dp)
                .padding(top = 24.dp)
                .align(Alignment.End)
                .clickable { }
                .padding(end = 24.dp)
        )

        Text(
            text = "Forgot Password? Recovery it ",
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