package com.example.task3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.task3.ui.screens.CenterAlignedTopAppBar
import com.example.task3.ui.screens.DetailsScreen
import com.example.task3.ui.theme.Task3Theme

@ExperimentalMaterial3Api
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Task3Theme {
                Scaffold(
                    topBar = { CenterAlignedTopAppBar() },
                    content = { innerPadding ->
                        DetailsScreen(modifier = Modifier.padding(innerPadding))
                    }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AppBarPreview() {
    Task3Theme {
        CenterAlignedTopAppBar()
    }
}

@Preview(showBackground = true)
@Composable
fun ScreenPreview() {
    Task3Theme {
        DetailsScreen()
    }
}
