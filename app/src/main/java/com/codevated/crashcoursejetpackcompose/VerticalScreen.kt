package com.codevated.crashcoursejetpackcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.sp

@Composable
fun VerticalScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(all = Dp(7f)),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top
    ) {
        ImageComponent(alignment = Alignment.TopEnd)
        Spacer(modifier = Modifier.height(Dp(5f)))
        TextComponent(
            text = "Text 1",
            color = Color.Black,
            size = 24.sp,
            weight = FontWeight.Bold
            )
        Spacer(modifier = Modifier.height(Dp(5f)))
        TextFieldComponent(labelStr = "Add name", placeholderStr = "Please enter your name:")
        Spacer(modifier = Modifier.height(Dp(5f)))
        TextFieldComponent(
            keyboardType = KeyboardType.Number,
            labelStr = "Add Phone",
            placeholderStr = "Please enter your Phone number:"
        )
        Spacer(modifier = Modifier.height(Dp(20f)))
        SimpleButton()

    }
}

@Preview(showSystemUi = true)
@Composable
fun VerticalScreenPreview(){
    VerticalScreen()
}