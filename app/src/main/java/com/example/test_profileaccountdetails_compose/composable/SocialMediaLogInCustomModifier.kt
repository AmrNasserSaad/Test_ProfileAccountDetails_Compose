package com.example.test_profileaccountdetails_compose.composable

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.test_profileaccountdetails_compose.ui.theme.BlueGray
import com.example.test_profileaccountdetails_compose.ui.theme.LightBlueWhite

@SuppressLint("ModifierFactoryUnreferencedReceiver")
fun Modifier.socialMediaLogInCustomModifier() : Modifier = composed {
    if (isSystemInDarkTheme()){
        background(Color.Transparent).border(
            width = 1.dp,
            color = BlueGray,
            shape = RoundedCornerShape(4.dp)
        )
    }else{
        background(LightBlueWhite)
    }
}
