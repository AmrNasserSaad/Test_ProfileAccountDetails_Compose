package com.example.test_profileaccountdetails_compose.dashBoard.composableFuns

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.test_profileaccountdetails_compose.R

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun searchTextFieldWithIcon() {
    var text by rememberSaveable { mutableStateOf("") }
    TextField(
        value = text,
        onValueChange = { text = it },
        label = { Text(text = "Searching for ....") },
        trailingIcon = {
            Image(
                painter = painterResource(id = R.drawable.search_icon),
                contentDescription = null,
                modifier = Modifier
                    .size(43.dp)
                    .padding(end = 6.dp)
            )
        },
        shape = RoundedCornerShape(50.dp),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.Transparent,
            unfocusedBorderColor = Color.Transparent,
            containerColor = Color.White,
            unfocusedLabelColor = Color(android.graphics.Color.parseColor("#5e5e5e")),
            focusedLabelColor = Color(android.graphics.Color.parseColor("#5e5e5e")),
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 24.dp, start = 24.dp, end = 24.dp)
            .shadow(3.dp, shape = RoundedCornerShape(50.dp))
            .background(Color.White, CircleShape)
    )
}