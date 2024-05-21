package com.example.test_profileaccountdetails_compose.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
                .padding(top = 24.dp, start = 20.dp, end = 10.dp)
        ) {
            Icon(
                modifier = Modifier.size(28.dp)
                    .align(alignment = Alignment.CenterVertically),
                painter = painterResource(id = R.drawable.ic_close),
                contentDescription = null
            )
            Spacer(modifier = Modifier.weight(1f))

            Icon(
                modifier = Modifier.size(48.dp),
                painter = painterResource(id = R.drawable.ic_at),
                contentDescription = null
            )
            Spacer(modifier = Modifier.width(10.dp))
            Icon(
                modifier = Modifier.size(48.dp),
                painter = painterResource(id = R.drawable.ic_save),
                contentDescription = null
            )
            Spacer(modifier = Modifier.width(10.dp))
            Icon(
                modifier = Modifier.size(48.dp),
                painter = painterResource(id = R.drawable.ic_write),
                contentDescription = null
            )
            Spacer(modifier = Modifier.width(10.dp))
            Icon(
                modifier = Modifier.size(48.dp),
                painter = painterResource(id = R.drawable.ic_dots),
                contentDescription = null
            )


        }

        Box(
            modifier = Modifier.padding(top = 200.dp, start = 135.dp),
            contentAlignment = Alignment.BottomCenter

        ) {
            Image(
                modifier = Modifier
                    .size(124.dp)
                    .clip(CircleShape),
                painter = painterResource(id = R.drawable.avatarframe),
                contentDescription = null,
            )
        }


    }

}