package com.example.aplicativodeintruessamuel
import RecipeApp
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RecipeApp()
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    RecipeApp()
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RecipeApp()
}
