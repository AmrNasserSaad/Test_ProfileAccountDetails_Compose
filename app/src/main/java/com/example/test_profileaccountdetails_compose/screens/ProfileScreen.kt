package com.example.test_profileaccountdetails_compose.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.test_profileaccountdetails_compose.R
import com.example.test_profileaccountdetails_compose.composable.CustomButton
import com.example.test_profileaccountdetails_compose.composable.DefaultButton
import com.example.test_profileaccountdetails_compose.composable.HeaderText
import com.example.test_profileaccountdetails_compose.composable.HorizontalInformationCard
import com.example.test_profileaccountdetails_compose.composable.InformationCard
import com.example.test_profileaccountdetails_compose.composable.ProfileAvatar
import com.example.test_profileaccountdetails_compose.composable.SpacerVertical24
import com.example.test_profileaccountdetails_compose.composable.SpacerVertical32
import com.example.test_profileaccountdetails_compose.composable.TextButton
import com.example.test_profileaccountdetails_compose.composable.TextFieldTest


@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp, vertical = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        HeaderText(
            title = stringResource(R.string.account),
            subTitle = stringResource(R.string.edit_and_mange_your_account)
        )

        SpacerVertical32()

        ProfileAvatar(painter = painterResource(R.drawable.profile_img))

        SpacerVertical24()

        //this {} just for onClick lambda fun
        TextButton(text = stringResource(R.string.change_profile_picture), onClick = {})

        SpacerVertical32()

        HorizontalInformationCard()

        InformationCard(title = stringResource(R.string.location), information = "Egypt")
        InformationCard(title = stringResource(R.string.email), information = "amrnasser@std.com")
        InformationCard(title = stringResource(R.string.phone), information = "+20 102 557 3949")

        // this spacer to the rest of screen
        Spacer(modifier = Modifier.weight(1f))

        //this {} just for onClick lambda fun
        DefaultButton(text = stringResource(R.string.save), onClick = {})

    }
}


@Preview(showBackground = true)
@Composable
fun PreviewProfileScreen(modifier: Modifier = Modifier) {
    ProfileScreen()
}
