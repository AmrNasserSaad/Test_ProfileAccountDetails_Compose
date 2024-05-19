package com.example.test_profileaccountdetails_compose.composable

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import com.example.test_profileaccountdetails_compose.R
import com.example.test_profileaccountdetails_compose.ui.theme.Green


@Composable
fun TextFieldTest(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        var textInput by remember { mutableStateOf("") }
        var isPasswordVisible by remember { mutableStateOf(false) }
        // focus requester
        val focusRequester = remember { FocusRequester() }

        // this for password
        OutlinedTextField(value = textInput, onValueChange = { textInput = it }, leadingIcon = {
            Icon(
                painter = painterResource(id = R.drawable.ic_key), contentDescription = null
            )
        },
            trailingIcon = {
                TextButton(onClick = { isPasswordVisible = !isPasswordVisible })
                {
                    Text(text = if (isPasswordVisible) "Hide" else "Show", color = Green)
                }
            },
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Red,
                cursorColor = Color.Red,
            ),
            singleLine = true,

//            placeholder = {
//                //hint
//                Text(text = "Enter your password")
//            },
            label = {
                //hint with text top of the field
                Text(text = "Password")
            },
            // password hide input
            visualTransformation = if (isPasswordVisible) {
                VisualTransformation.None
            } else {
                PasswordVisualTransformation()
            },

            // text type input
            keyboardOptions = KeyboardOptions(
                autoCorrect = false,
                keyboardType = KeyboardType.NumberPassword,
                imeAction = ImeAction.Go
            ), keyboardActions = KeyboardActions(onGo = {
                Log.d("TAG", "TextFieldTest: $textInput")
            }
            ),
            // focus requester
            modifier = Modifier.focusRequester(focusRequester)
        )
        SpacerVertical24()
        // focus requester btn
        Button(onClick = { focusRequester.requestFocus() }) {
            Text(text = "Request Focus")
        }

    }
}


@Preview(showSystemUi = true)
@Composable
fun PreviewTextField(modifier: Modifier = Modifier) {
    TextFieldTest()
}