package com.example.lingua

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lingua.ui.theme.DarkGreen
import com.example.lingua.ui.theme.Green
import com.example.lingua.ui.theme.LinguaTheme
import com.example.lingua.ui.theme.SpaceGrotesk
import com.example.lingua.ui.theme.White

@Composable
fun LoginContent(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text,
        modifier = modifier.padding(top = 40.dp, start = 25.dp),
        style = TextStyle(
            fontSize = 22.sp,
            fontFamily = SpaceGrotesk,
            fontWeight = FontWeight.Bold,
            color = White,
            textAlign = TextAlign.Left
        )
    )
    Row(modifier = Modifier.padding(top = 650.dp, start = 35.dp))
    {
        Button(onClick = { /* Button click action */ },
            modifier = Modifier.size(width = 310.dp, height = 50.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Green))
        {
            Text(text = "Continue",
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
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = DarkGreen)
                {
                    LoginContent("My native language")
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun LoginPreview() {
    LinguaTheme {
        Surface(
            color = DarkGreen,
            modifier = Modifier.fillMaxSize())
        {
            LoginContent("My native Language")
        }
    }
}
