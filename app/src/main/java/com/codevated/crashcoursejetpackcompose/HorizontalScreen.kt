package com.codevated.crashcoursejetpackcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HorizontalScreen(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(400.dp)
            .background(Color.Blue),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        TextComponent(text = "Text 1", color = Color.White)
        TextComponent(text = "text 2", color = Color.White)
        TextComponent(text = "text 3", color = Color.White)
    }
}

@Preview(showSystemUi = true)
@Composable
fun HorizontalScreenPreview(){
    HorizontalScreen()
}