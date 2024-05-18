package com.example.test_profileaccountdetails_compose.composable

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.test_profileaccountdetails_compose.R

@Composable
fun HorizontalInformationCard() {
    Row(modifier = Modifier.fillMaxWidth()) {
        Box(modifier = Modifier.weight(1f)) {
            InformationCard(title = stringResource(R.string.first_name), information = "Amr")
        }

        Spacer(modifier = Modifier.width(16.dp))

        Box(modifier = Modifier.weight(1f)) {
            InformationCard(title = stringResource(R.string.last_name), information = "Nasser ")
        }
    }
}