package com.example.test_profileaccountdetails_compose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.test_profileaccountdetails_compose.R
import com.example.test_profileaccountdetails_compose.composable.HeaderText
import com.example.test_profileaccountdetails_compose.composable.SpacerVertical32


@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp, vertical = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        HeaderText(title = "Account", subTitle = "Edit and mange your account")

        SpacerVertical32()

        Image(
            painter = painterResource(id = R.drawable.profile_img),
            contentDescription = "profile picture",
            modifier = Modifier.clip(shape = RoundedCornerShape(16.dp))
        )

    }
}


@Preview(showBackground = true)
@Composable
fun PreviewProfileScreen(modifier: Modifier = Modifier) {
    ProfileScreen()
}
