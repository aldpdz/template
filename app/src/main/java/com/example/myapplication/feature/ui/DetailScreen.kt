package com.example.myapplication.feature.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun StatefulDetailScreen() {
    DetailScreen()
}

@Composable
fun DetailScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "This is a second screen")
    }
}

@Preview(device = Devices.NEXUS_5)
@Composable
fun SecondScreenPreview() {
    MyApplicationTheme {
        DetailScreen()
    }
}