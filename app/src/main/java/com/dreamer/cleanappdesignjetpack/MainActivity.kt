package com.dreamer.cleanappdesignjetpack

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

import androidx.compose.ui.tooling.preview.Preview
import com.dreamer.cleanappdesignjetpack.composables.OnBoardingPage1
import com.dreamer.cleanappdesignjetpack.composables.LoginPage1
import com.dreamer.cleanappdesignjetpack.ui.theme.CleanAppDesignJetpackTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val windows = this.window
        windows.statusBarColor = Color.WHITE


        setContent {
            CleanAppDesignJetpackTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    LoginPage1()
//                    OnBoardingPage1()
                }
            }
        }
    }
}

