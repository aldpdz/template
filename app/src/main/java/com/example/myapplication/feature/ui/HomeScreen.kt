package com.example.myapplication.feature.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun StatefulHomeScreen(
    navHostController: NavHostController
) {
    HomeScreen(
        onButtonClicked = {
            navHostController.navigate("detail")
        }
    )
}

@Composable
fun HomeScreen(
    onButtonClicked: () -> Unit,
) {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "This is the home screen")
        Button(onClick = onButtonClicked) {
            Text(text = "Next screen")
        }
    }
}

@Preview(device = Devices.NEXUS_5)
@Composable
fun HomeScreenPreview() {
    MyApplicationTheme {
        HomeScreen(
            onButtonClicked = {}
        )
    }
}