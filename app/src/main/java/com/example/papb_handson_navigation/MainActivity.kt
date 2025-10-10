package com.example.papb_handson_navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.papb_handson_navigation.ui.theme.Papbpraktikumpraktek4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Papbpraktikumpraktek4Theme {
            }
        }
    }
}