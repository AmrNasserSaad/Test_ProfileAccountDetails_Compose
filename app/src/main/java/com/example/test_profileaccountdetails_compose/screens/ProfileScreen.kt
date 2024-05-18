package com.example.test_profileaccountdetails_compose.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.test_profileaccountdetails_compose.R
import com.example.test_profileaccountdetails_compose.composable.HeaderText
import com.example.test_profileaccountdetails_compose.composable.ProfileAvatar
import com.example.test_profileaccountdetails_compose.composable.SpacerVertical24
import com.example.test_profileaccountdetails_compose.composable.SpacerVertical32
import com.example.test_profileaccountdetails_compose.composable.TextButton


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

        ProfileAvatar(painter = painterResource(R.drawable.profile_img))

        SpacerVertical24()

        TextButton(text = "Change profile picture"){}

        SpacerVertical32()

    }
}


@Preview(showBackground = true)
@Composable
fun PreviewProfileScreen(modifier: Modifier = Modifier) {
    ProfileScreen()
}
