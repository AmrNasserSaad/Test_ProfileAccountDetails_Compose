package com.example.test_profileaccountdetails_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.test_profileaccountdetails_compose.composable.TestScaffold
import com.example.test_profileaccountdetails_compose.screens.ProfileScreenElhendawy

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            TestScaffold()

        }
    }
}

