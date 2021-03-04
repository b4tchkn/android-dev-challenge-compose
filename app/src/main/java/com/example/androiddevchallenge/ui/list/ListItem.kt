package com.example.androiddevchallenge.ui.list

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ListItem(dog: String, onItemClick: (String) -> Unit) {
    Column(
        modifier = Modifier
            .clickable { onItemClick(dog) }
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Text(
            text = dog,
            style = TextStyle(
                fontWeight = FontWeight.Bold, fontSize = 24.sp, color = Color.White,
            )
        )
    }

}