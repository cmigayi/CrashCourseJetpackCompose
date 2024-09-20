package com.codevated.crashcoursejetpackcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MixedListScreen() {
    Column(
        modifier = Modifier.background(Color.Gray)
    ) {
        Spacer(modifier = Modifier.height(50.dp))
        HorizontalListExample()
        Spacer(modifier = Modifier.height(50.dp))
        ListExample()
    }
}

@Preview(showSystemUi = true)
@Composable
fun MixedListScreenPreview() {
    MixedListScreen()
}