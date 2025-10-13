package com.example.papb_handson_navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.papb_handson_navigation.ui.navigation.RootNavGraph
import com.example.papb_handson_navigation.ui.theme.Papbpraktikumpraktek4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Papbpraktikumpraktek4Theme {
                val navController = rememberNavController()
                RootNavGraph(navController = navController)
            }
        }
    }
}