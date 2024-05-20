package com.example.test_profileaccountdetails_compose.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.test_profileaccountdetails_compose.R
import com.example.test_profileaccountdetails_compose.ui.theme.Green

@Preview
@Composable
fun GoogleBtn() {
    Row {
        Image(
            modifier = Modifier.align(Alignment.CenterVertically),
            painter = painterResource(id = R.drawable.google),
            contentDescription = null
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            modifier = Modifier.align(Alignment.CenterVertically),
            color = Green,
            text = "Google"
        )
    }

}

