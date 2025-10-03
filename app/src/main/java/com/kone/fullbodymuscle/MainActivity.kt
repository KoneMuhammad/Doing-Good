package com.kone.fullbodymuscle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.kone.fullbodymuscle.ui.navigation.MyAppNavigation
import com.kone.fullbodymuscle.ui.theme.FullbodymuscleTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FullbodymuscleTheme {
                        MyAppNavigation()
                    }
                }
            }
        }




