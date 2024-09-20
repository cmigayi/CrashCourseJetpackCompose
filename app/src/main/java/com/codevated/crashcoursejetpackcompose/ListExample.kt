package com.codevated.crashcoursejetpackcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ListExample(){
    val someItems = listOf("Red","Green","Blue","Red","Green","Blue","Red","Green","Blue","Red","Green","Blue","Red","Green","Blue")

    LazyColumn (
        Modifier.background(Color.White)
    ) {
        items(someItems) { item: String ->  
            NormalText(text = item)
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ListExamplePreview(){
    ListExample()
}