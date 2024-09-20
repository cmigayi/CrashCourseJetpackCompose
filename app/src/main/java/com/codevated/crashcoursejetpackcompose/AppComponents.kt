package com.codevated.crashcoursejetpackcompose

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HelloWorld(name: String){
    TextComponent(
        text = "Hello $name",
        18.sp,
        FontWeight.Bold,
        Color.Black,
        FontStyle.Normal,
        padding = 5.dp
    )
}

@Preview(showSystemUi = true)
@Composable
fun HelloWorldPreview(){
    HelloWorld(name = "Ken")
}

@Composable
fun TextComponent(
    text: String,
    size: TextUnit = 16.sp,
    weight: FontWeight = FontWeight.Normal,
    color: Color = Color.Black,
    style: FontStyle = FontStyle.Normal,
    padding: Dp = 5.dp,
    lines: Int? = null,
    bgColor: Color = Color.Transparent
){
    Text(
        modifier = Modifier
            .wrapContentSize()
            .background(bgColor)
            .padding(padding),
        text = text,
        fontSize = size,
        color = color,
        fontWeight = weight,
        fontStyle = style,
        maxLines = lines ?: Int.MAX_VALUE,
        overflow = TextOverflow.Ellipsis
    )
}

@Composable
fun SimpleButton() {
    Button(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        onClick = {
        Log.d("SimpleButton", "Button clicked")
    }) {
        NormalText(text = "Click here", align = TextAlign.Center)
    }
}

@Preview
@Composable
fun SimpleButtonPreview(){
    SimpleButton()
}

@Composable
fun NormalText(text: String, align: TextAlign=TextAlign.Start){
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp),
        textAlign = align,
        text = text
    )
}

@Composable
fun TextFieldComponent(
    keyboardType: KeyboardType = KeyboardType.Text,
    labelStr: String,
    placeholderStr: String
    ){
    var text by remember {
        mutableStateOf("")
    }

    TextField(
        modifier = Modifier.fillMaxWidth(),
        value = text,
        onValueChange = { newText ->
        text = newText
        },
        textStyle = TextStyle(fontWeight = FontWeight.Normal, fontSize = 14.sp),
        label = {
            NormalText(text = labelStr)
        },
        placeholder = {
            NormalText(text = placeholderStr)
        },
        keyboardOptions = KeyboardOptions(keyboardType = keyboardType)
    )
}

@Composable
fun ImageComponent(alignment: Alignment= Alignment.CenterStart){
    Image(
        modifier = Modifier.wrapContentSize()
            .background(Color.Black),
        alignment = alignment,
        painter = painterResource(id = R.drawable.ic_launcher_foreground),
        contentDescription = "Just for test"
    )
}