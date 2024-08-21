package com.compose.lazycolumncompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable

fun UserUi(){

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(Color.White),
        verticalAlignment = Alignment.CenterVertically

    ) {
        Spacer(modifier = Modifier
            .size(50.dp)
            .clip(CircleShape)
            .background(Color.LightGray))

        Column(
            modifier = Modifier.padding(16.dp)
        ) {

            Text(text = "Douglas Multima")
            Text(text = "Desenvolvedor Android")
        }
    }


}

@Preview
@Composable
fun UserUiPreview(){
    UserUi()

}