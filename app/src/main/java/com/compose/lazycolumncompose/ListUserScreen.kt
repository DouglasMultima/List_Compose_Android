package com.compose.lazycolumncompose


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ListUserScreen(){

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {

        item {
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.fillMaxWidth(),
                content = {
                    Text(text = "LazyCOlum")
                }
            )


        }

       items(12){
           UserUi()
       }

        item {
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.fillMaxWidth(),
                content = {
                    Text(text = "LazyCOlum")
                }
            )


        }
    }

}

@Preview
@Composable
fun ListUserScreenPreview(){
    ListUserScreen()
}