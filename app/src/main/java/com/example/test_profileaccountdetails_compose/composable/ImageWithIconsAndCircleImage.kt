package com.example.test_profileaccountdetails_compose.composable

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.test_profileaccountdetails_compose.R

@Preview(showSystemUi = true)
@Composable
fun ImageWithIconsAndCircleImage(modifier: Modifier = Modifier) {

    Box {
        BackGroundElhendawy()
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(top = 20.dp, start = 20.dp, end = 20.dp)
        ) {
            Icon(modifier = Modifier.size(28.dp),painter = painterResource(id = R.drawable.ic_cancel), contentDescription = null)
            Spacer(modifier = Modifier.weight(1f))

            Icon(
                modifier = Modifier.size(28.dp),painter = painterResource(id = R.drawable.ic_cancel), contentDescription = null)
            Spacer(modifier = Modifier.width(10.dp))
            Icon(modifier = Modifier.size(28.dp),painter = painterResource(id = R.drawable.ic_cancel), contentDescription = null)
            Spacer(modifier = Modifier.width(10.dp))
            Icon(modifier = Modifier.size(28.dp),painter = painterResource(id = R.drawable.ic_cancel), contentDescription = null)
            Spacer(modifier = Modifier.width(10.dp))
            Icon(modifier = Modifier.size(28.dp),painter = painterResource(id = R.drawable.ic_cancel), contentDescription = null)


        }
    }



}