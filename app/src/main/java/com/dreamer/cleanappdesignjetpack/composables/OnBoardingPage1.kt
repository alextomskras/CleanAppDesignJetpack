package com.dreamer.cleanappdesignjetpack.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.ZeroCornerSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dreamer.cleanappdesignjetpack.R
import com.dreamer.cleanappdesignjetpack.ui.theme.Arangish
import com.dreamer.cleanappdesignjetpack.ui.theme.CleanAppDesignJetpackTheme
import com.dreamer.cleanappdesignjetpack.ui.theme.Purplish
import java.nio.file.Files.size
import java.util.*


@Preview(showBackground = true)
@Composable
fun OnBoardingPage1(){
    CleanAppDesignJetpackTheme  {
        BgCard2()
        MainCard2()
    }
}

@Composable
fun BgCard2() {
    val signupText = buildAnnotatedString {
        append("Don't have an account? ")
        withStyle(SpanStyle(color = Arangish)) {
            append("Sign up here!")
        }
    }
    Surface(color = Purplish, modifier = Modifier.fillMaxSize()) {
        Column(verticalArrangement = Arrangement.Bottom, horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.offset(y = (-30).dp)
        ) {
            Row {
                Box(modifier = Modifier.background(Color.Gray).size(10.dp).clip(CircleShape))
                Spacer(modifier = Modifier.padding(horizontal = 4.dp))
                Box(modifier = Modifier.background(Color.White).size(12.dp).clip(CircleShape))
                Spacer(modifier = Modifier.padding(horizontal = 4.dp))
                Box(modifier = Modifier.background(Color.Gray).size(10.dp).clip(CircleShape))

            }
            Row(horizontalArrangement = Arrangement.SpaceBetween,modifier = Modifier.fillMaxWidth().padding(16.dp)) {
                TextButton(onClick = {}) {
                    Text(text = "Skip", color = Color.White)
                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    TextButton(onClick = {}) {
                        Text(text = "Next", color = Color.White)
                        Spacer(modifier = Modifier.padding(horizontal = 4.dp))
                        Image(painter = painterResource(id = R.drawable.ic_next),"")
                    }
                }
            }
        }
    }
}


@Composable
fun MainCard2() {
    Surface(color = Color.White, modifier = Modifier.height(600.dp).fillMaxWidth(),
            shape = RoundedCornerShape(60.dp).copy(topStart = ZeroCornerSize, topEnd = ZeroCornerSize)) {
        Column(modifier = Modifier.padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(painter = painterResource(id = R.drawable.ic_cleaning),"11111")
            Spacer(modifier = Modifier.padding(32.dp))
            CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.high) {
                Text(text = "Cleaning on Demand",style = MaterialTheme.typography.h6)
            }

            Spacer(modifier = Modifier.padding(vertical = 12.dp))
            CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
                Text(text = "Book an appointment in less than 60 seconds and get on the schedule as early as tomorrow.",
                        style = MaterialTheme.typography.caption, textAlign = TextAlign.Center)


            }

        }
    }
}