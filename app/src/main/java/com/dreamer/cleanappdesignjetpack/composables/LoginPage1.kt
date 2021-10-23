package com.dreamer.cleanappdesignjetpack.composables


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.ZeroCornerSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.shapes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.DarkGray
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dreamer.cleanappdesignjetpack.R
import com.dreamer.cleanappdesignjetpack.R.drawable
import com.dreamer.cleanappdesignjetpack.ui.theme.Arangish
import com.dreamer.cleanappdesignjetpack.ui.theme.CleanAppDesignJetpackTheme
import com.dreamer.cleanappdesignjetpack.ui.theme.Purplish


@Composable
fun BgCard() {
    val signupText = buildAnnotatedString {
        append("Don't have an account? ")
        withStyle(SpanStyle(color = Arangish)) {
            append("Sign up here!")
        }
    }
    Surface(color = Purplish, modifier = Modifier.fillMaxSize()) {
        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.offset(y = (-30).dp)
        ) {
            Row() {
                Image(painter = painterResource(id = drawable.ic_fb), "")
                Spacer(modifier = Modifier.padding(horizontal = 4.dp))
                Image(painter = painterResource(id = drawable.ic_google), "")
                Spacer(modifier = Modifier.padding(horizontal = 4.dp))
                Image(painter = painterResource(id = drawable.ic_twitter), "")

            }
            Spacer(modifier = Modifier.padding(vertical = 8.dp))
            Text(text = signupText, color = Color.White)
        }
    }
}


@Composable
fun MainCard() {
    var emailState by remember { mutableStateOf("mtirjbirah@gmail.com") }
    var passState by remember { mutableStateOf("") }
    Surface(
        color = Color.White, modifier = Modifier
            .height(600.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(60.dp).copy(topStart = ZeroCornerSize, topEnd = ZeroCornerSize)
    ) {
        Column(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(horizontal = 16.dp, vertical = 4.dp),
                modifier = Modifier.padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.SpaceBetween
        ) {

            val modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
            Image(painter = painterResource(id = drawable.ic_vaccum), null)
            Spacer(modifier = Modifier.padding(16.dp))



            OutlinedTextField(
                modifier=Modifier.fillMaxWidth(),
                value = emailState,
                onValueChange = { emailState = it },
                label = { Text("Email address") },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    cursorColor = Arangish,
                    disabledLabelColor = Gray,
                    focusedLabelColor = Arangish,
                    leadingIconColor = Arangish,
                    focusedBorderColor = Arangish,
                    unfocusedBorderColor = Gray
                ),
                leadingIcon = {Icon(
                    imageVector = Icons.Filled.Email,
                    contentDescription = stringResource(R.string.Set_email)
                )}
            )
            Spacer(modifier = Modifier.padding(6.dp))
            OutlinedTextField(
                modifier=Modifier.fillMaxWidth(),
                visualTransformation = PasswordVisualTransformation(),
                value = passState,
                onValueChange = { passState = it },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                label = { Text("Password") },
                singleLine=true,
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    cursorColor = Arangish,
                    disabledLabelColor = Gray,
                    focusedLabelColor = Arangish,
                    leadingIconColor = Arangish,
                    focusedBorderColor = Arangish,
                    unfocusedBorderColor = Gray
                ),
                leadingIcon = {Icon(
                    imageVector = Icons.Filled.Lock,
                    contentDescription = stringResource(R.string.Set_password)
                )}
            )

            Spacer(modifier = Modifier.padding(vertical = 12.dp))
            CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
                Text(text = "Forgot password?", textAlign = TextAlign.End, modifier = modifier)
            }
            Spacer(modifier = Modifier.padding(vertical = 12.dp))
            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(backgroundColor = Arangish,contentColor = Color.White),
                shape = shapes.medium,
                contentPadding = PaddingValues(16.dp)
            ) {
                Text(text = "Log In", fontSize = 14.sp, fontWeight = FontWeight.Bold)
            }
//            Spacer(modifier = Modifier.padding(vertical = 16.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginPage1() {

    CleanAppDesignJetpackTheme {
        BgCard()
        MainCard()

    }

}