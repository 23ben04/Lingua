package com.example.lingua

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lingua.ui.theme.DarkGreen
import com.example.lingua.ui.theme.Green
import com.example.lingua.ui.theme.LightBlue
import com.example.lingua.ui.theme.LinguaTheme
import com.example.lingua.ui.theme.SpaceGrotesk
import com.example.lingua.ui.theme.White


@Composable
fun LanguageLevel(text: String) {

    val levels = listOf("A1", "A2", "B1", "B2")
    val texts = listOf("Beginner", "Elementary", "Intermediate", "Advanced")
    var selectedIndex = 0

    Text(
        text = text,
        modifier = Modifier.padding(top = 40.dp),
        style = TextStyle(
            fontSize = 22.sp,
            fontFamily = SpaceGrotesk,
            fontWeight = FontWeight.Bold,
            color = White,
            textAlign = TextAlign.Center
        )
    )

    Column(modifier = Modifier.padding(top = 130.dp,start = 40.dp)) {
        repeat(4) {
            Box(
                modifier = Modifier
                    .size(width = 305.dp, height = 60.dp)
                    .background(color = LightBlue, shape = RoundedCornerShape(15.dp))
            ){
                Text(text = levels[it],
                    color = White,
                    fontSize = 22.sp,
                    modifier = Modifier.padding(start = 20.dp, top = 15.dp))

                    Spacer(modifier = Modifier.width(10.dp))

                    Text(text = texts[it],
                    fontSize = 22.sp,
                    color = White,
                    modifier = Modifier.padding(start = 75.dp, top = 15.dp))

                RadioButton(
                            modifier = Modifier.padding(start = 250.dp,top = 5.dp),
                            selected = (selectedIndex == it),
                            onClick = { selectedIndex = it},
                            colors = RadioButtonDefaults.colors(unselectedColor = DarkGreen,selectedColor = DarkGreen))
            }
            Spacer(modifier = Modifier.height(70.dp))
        }
    }


    Row(modifier = Modifier.padding(top = 675.dp, start = 35.dp))
    {
        Button(onClick = { /* Button click action */ },
            modifier = Modifier.size(width = 310.dp, height = 50.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Green))
        {
            Text(text = "Save",
                style = TextStyle(
                    fontSize = 18.sp,
                    fontFamily = SpaceGrotesk,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = White
                )
            )
        }
    }
}


class MainActivity : ComponentActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            LinguaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = DarkGreen)
                {
                    LanguageLevel("Language Level")
                }
            }
        }
    }
}