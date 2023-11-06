package com.example.protfolio

import android.widget.Space
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

    @Composable
    fun Protfilio(modifier: Modifier= Modifier) {
       val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()

    ) {
        Card(
            modifier = Modifier
                .background(Color.Red)

        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp, bottom = 10.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.myprofile),
                    contentDescription = "",
                    //to proper 360 degree of image
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(170.dp)
                        .clip(CircleShape)
                )
                Text(
                    text = "Prasad Perugu",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium
                )
                Text(
                    text = "India",
                    fontSize = 16.sp
                )
            }
            Text(
                text = "PERSONAL INFORMATION",
                fontSize = 16.sp,
                modifier = Modifier
                    .padding(10.dp)
            )
        }
        Row(
            modifier = Modifier
                .padding(10.dp)
        ) {
            Text(text = "Born", fontSize = 16.sp)
            Text(
                text = "September 16, 1999(24 Years)",
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.padding(start = 10.dp)
            )

        }
        Divider(color = Color.Gray)
        Row(
            modifier = Modifier
                .padding(10.dp)
        ) {
            Text(text = "Birth Place", fontSize = 16.sp)
            Text(text = "Kumaradevam", fontSize = 16.sp, fontWeight = FontWeight.Medium,  modifier = Modifier.padding(start = 10.dp))

        }
        Divider(color = Color.Gray)

        Row(
            modifier = Modifier
                .padding(10.dp)
        ) {
            Text(text = "Nickname", fontSize = 16.sp)
            Text(text = "Surendra", fontSize = 16.sp, fontWeight = FontWeight.Medium,  modifier = Modifier.padding(start = 10.dp))

        }
        Divider(color = Color.Gray)
        Row(
            modifier = Modifier
                .padding(10.dp)
        ) {
            Text(text = "Profession", fontSize = 16.sp)
            Text(text = "Engineer", fontSize = 16.sp, fontWeight = FontWeight.Medium,  modifier = Modifier.padding(start = 10.dp))

        }
        Divider(color = Color.Gray)
        Row(
            modifier = Modifier.padding(10.dp)
        ) {
            Text(text = "Role", fontSize = 16.sp)
            Text(text = "Android Dev", fontSize = 16.sp, fontWeight = FontWeight.Medium,  modifier = Modifier.padding(start = 10.dp))

        }
        Divider(color = Color.Gray)

        Row(
            //in order to work spaceAround property needs to add next line fillMaxWidth
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier.fillMaxWidth()
                .padding(top = 30.dp)
        ) {
            Button(onClick = {
                Toast.makeText(context,"Will Update Soon",Toast.LENGTH_SHORT).show()
                             },
                ) {
                Text(text = "Intrests")
            }
            Button(onClick = {
                Toast.makeText(context,"Will Update my education Soon",Toast.LENGTH_SHORT).show()
                             },
                ) {
                Text(text = "Education")
            }
        }
        Row(
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier.fillMaxWidth()
                .padding(top=30.dp)
        ) {
            Button(onClick = {
                Toast.makeText(context,"Will Update Soon",Toast.LENGTH_SHORT).show()
                             },
            ) {
                Text(text = "Carrer")
            }
            Button(onClick = {
                             Toast.makeText(context,"Will Update it soon",Toast.LENGTH_SHORT).show()
                            },
            ) {
                Text(text = "Family")
            }
        }
    }


}

@Preview(showBackground = true)
@Composable
fun Dummy(){
    Protfilio()
}

