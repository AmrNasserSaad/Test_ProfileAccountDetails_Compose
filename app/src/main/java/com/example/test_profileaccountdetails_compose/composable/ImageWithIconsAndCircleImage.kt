package com.example.test_profileaccountdetails_compose.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.test_profileaccountdetails_compose.R

@Preview(showSystemUi = true)
@Composable
fun ImageWithIconsAndCircleImage(modifier: Modifier = Modifier) {

    ConstraintLayout(modifier = Modifier.fillMaxWidth()) {

        val (backgroundBox,icons, profileImage) = createRefs()


        Image(
            modifier = Modifier
                .fillMaxWidth()
                .constrainAs(backgroundBox) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)

                },
            painter = painterResource(id = R.drawable.backgroound_image),
            contentDescription = null,
            contentScale = ContentScale.Crop,
        )
        Row(
            modifier = modifier.constrainAs(icons) {
                top.linkTo(backgroundBox.top, margin = 50.dp)
                start.linkTo(parent.start)
                end.linkTo(parent.end)

            }
                .fillMaxWidth()
                .padding(start = 20.dp, end = 10.dp),
        ) {
            Icon(
                modifier = Modifier
                    .size(32.dp)
                    .align(alignment = Alignment.CenterVertically),
                painter = painterResource(id = R.drawable.ic_close),
                contentDescription = null
            )
            Spacer(modifier = Modifier.weight(1f))

            Icon(
                modifier = Modifier.size(56.dp),
                painter = painterResource(id = R.drawable.ic_at),
                contentDescription = null
            )
            Spacer(modifier = Modifier.width(10.dp))
            Icon(
                modifier = Modifier.size(56.dp),
                painter = painterResource(id = R.drawable.ic_save),
                contentDescription = null
            )
            Spacer(modifier = Modifier.width(10.dp))
            Icon(
                modifier = Modifier.size(56.dp),
                painter = painterResource(id = R.drawable.ic_write),
                contentDescription = null
            )
            Spacer(modifier = Modifier.width(10.dp))
            Icon(
                modifier = Modifier.size(56.dp),
                painter = painterResource(id = R.drawable.ic_dots),
                contentDescription = null
            )


        }


        Image(
            modifier = Modifier.constrainAs(profileImage) {
                top.linkTo(backgroundBox.bottom)
                start.linkTo(backgroundBox.start)
                end.linkTo(backgroundBox.end)
                bottom.linkTo(backgroundBox.bottom)


            }
                .padding(bottom = 40.dp)
                .size(132.dp)
                .clip(CircleShape),
            painter = painterResource(id = R.drawable.avatarframe),
            contentDescription = null,
        )


    }


}