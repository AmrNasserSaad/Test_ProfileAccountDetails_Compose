package com.example.test_profileaccountdetails_compose.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.test_profileaccountdetails_compose.composable.AchievementsSection
import com.example.test_profileaccountdetails_compose.composable.ImageWithIconsAndCircleImage
import com.example.test_profileaccountdetails_compose.composable.SpacerVertical24
import com.example.test_profileaccountdetails_compose.composable.TextsAndIconsSection
import com.example.test_profileaccountdetails_compose.ui.theme.BackgroundColorShape

@Preview(showSystemUi = true)
@Composable
fun ProfileScreenElhendawy() {


    Column {

        ImageWithIconsAndCircleImage()

        Column {
            TextsAndIconsSection()
            SpacerVertical24()
            Box(
                modifier = androidx.compose.ui.Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(BackgroundColorShape)
            )
            SpacerVertical24()
            AchievementsSection()
        }

    }


}


//
//Column(
//modifier = Modifier
//.constrainAs(image) {
//    top.linkTo(parent.top)
//    start.linkTo(parent.start)
//    end.linkTo(parent.end)
//}
//) {
//    ImageWithIconsAndCircleImage()
//}
//
//Column(
//modifier = Modifier
//.constrainAs(colText) {
//    top.linkTo(image.bottom)
//    start.linkTo(parent.start)
//    end.linkTo(parent.end)
//}
//.fillMaxWidth()
//.padding(horizontal = 24.dp, vertical = 16.dp)
//) {
//    TextsAndIconsSection()
//    SpacerVertical24()
//    AchievementsSection()
//
//}