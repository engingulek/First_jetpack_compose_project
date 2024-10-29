package com.example.firstjetpackcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ExampleCardDesign(item:CartData){
    Row(modifier = Modifier
        .background(Color.LightGray)
        .padding(10.dp)

    ) {
        Image(painter = painterResource(R.drawable.ic_launcher_background),
            contentDescription = "",
            Modifier.size(80.dp)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.width(10.dp))
        Column(verticalArrangement = Arrangement.spacedBy(5.dp)) {
            Text(item.name,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Text(item.jop)
            Text(item.info,
                maxLines = 4,
                overflow = TextOverflow.Ellipsis)
        }
    }
}
