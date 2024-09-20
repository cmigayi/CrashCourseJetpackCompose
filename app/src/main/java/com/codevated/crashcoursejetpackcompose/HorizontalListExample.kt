package com.codevated.crashcoursejetpackcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HorizontalListExample() {
    val someItems = listOf("Red","Green","Blue","Red","Green","Blue","Red","Green","Blue")

    LazyRow(
        Modifier.background(Color.White)
    ) {
        items(someItems){ item: String ->
            Row (
                modifier = Modifier.width(150.dp)
            ) {
                NormalText(text = item)
            }
            Spacer(modifier = Modifier
                .background(Color.Black)
                .height(30.dp)
                .width(3.dp)
            )
        }
    }

}

@Preview(showSystemUi = true)
@Composable
fun HorizontalListExamplePreview() {
    HorizontalListExample()
}