package com.example.test_profileaccountdetails_compose.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.test_profileaccountdetails_compose.composable.LoginButtonTest
import com.example.test_profileaccountdetails_compose.composable.LoginTextField
import com.example.test_profileaccountdetails_compose.composable.SocialMediaLoginIcons
import com.example.test_profileaccountdetails_compose.composable.SpacerVertical24
import com.example.test_profileaccountdetails_compose.composable.SpacerVertical32
import com.example.test_profileaccountdetails_compose.composable.StyleCreateAnAccount
import com.example.test_profileaccountdetails_compose.composable.TextOrContinueWith
import com.example.test_profileaccountdetails_compose.composable.TopSectionLogin

@Composable
fun LoginScreen() {
    // Surface = Box
    Surface {

        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            TopSectionLogin()
            SpacerVertical32()
            LoginTFAndBtnSection()

        }
    }
}


@Composable
private fun LoginTFAndBtnSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 32.dp)
    )
    {
        LoginTextField(label = "Email", trailing = "", modifier = Modifier.fillMaxWidth())
        SpacerVertical24()
        LoginTextField(label = "Password", trailing = "Forgot?", modifier = Modifier.fillMaxWidth())
        SpacerVertical24()
        LoginButtonTest()
        SpacerVertical24()
        SocialMediaSection()

    }
}


@Composable
private fun SocialMediaSection() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {

        TextOrContinueWith()

        SpacerVertical24()

        SocialMediaLoginIcons()

        SpacerVertical24()

        StyleCreateAnAccount()


    }
}

