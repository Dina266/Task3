package com.example.task3.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.task3.R

@Composable
fun DetailsScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(red = 235, green = 235, blue = 235))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_google),
            contentDescription = "Google Logo",

            modifier = Modifier.size(120.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "language",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "1525", fontSize = 18.sp)
            Spacer(modifier = Modifier.width(8.dp))
            Image(
                painter = painterResource(id = R.drawable.ic_star), // replace with your image resource
                contentDescription = "Star Icon",
                modifier = Modifier.size(40.dp),
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(text = "Python", fontSize = 18.sp)
            Spacer(modifier = Modifier.width(8.dp))
            Box(
                modifier = Modifier
                    .size(26.dp)
                    .background(color = Color.Blue, shape = CircleShape)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(text = "347", fontSize = 18.sp)
            Spacer(modifier = Modifier.width(4.dp))
            Image(
                painter = painterResource(id = R.drawable.ic_fork), // replace with your image resource
                contentDescription = "Fork Icon",
                modifier = Modifier.size(50.dp),
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Shared repository for open-sourced projects from the Google AI Language team.",
            fontSize = 22.sp,
            textAlign = TextAlign.Start
        )
        Spacer(modifier = Modifier.weight(1F).fillMaxWidth())
        Button(
            onClick = { /* Handle button click */ },
            colors = ButtonDefaults.buttonColors(containerColor = Color(
                red = 39,
                green = 54,
                blue = 139,
                alpha = 255
            )),
            shape = RoundedCornerShape(6.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(85.dp)
                .padding(20.dp)
        ) {
            Text(
                text = "Show Issues",
                color = Color.White,
                fontSize = 20.sp
            )
        }
    }
}
