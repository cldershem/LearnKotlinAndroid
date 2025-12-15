package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrantTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Column(modifier = Modifier.fillMaxSize()) {
        Row (modifier = Modifier.weight(1F)) {
            Quadrant(
                title = stringResource(R.string.text_composable),
                description = stringResource(R.string.text_composable_description),
                modifier = Modifier
                    .background(color = Color(0xFFEADDFF))
                    .fillMaxHeight()
                    .weight(1f)
            )
            Quadrant(
                title = stringResource(R.string.image_composable),
                description = stringResource(R.string.image_composable_description),
                modifier = modifier
                    .background(color = Color(0xFFD0BCFF))
                    .fillMaxHeight()
                    .weight(1f)
            )
        }

        Row (modifier = Modifier.weight(1F)) {
            Quadrant(
                title = stringResource(R.string.column_composable),
                description = stringResource(R.string.column_composable_description),
                modifier = modifier
                    .background(color = Color(0xFFB69DF8))
                    .fillMaxHeight()
                    .weight(1f)
            )
            Quadrant(
                title = stringResource(R.string.row_composable),
                description = stringResource(R.string.row_composable_description),
                modifier = modifier
                    .background(color = Color(0xFFF6EDFF))
                    .fillMaxHeight()
                    .weight(1f)
            )
        }
    }
}

@Composable
fun Quadrant(title: String, description: String, modifier: Modifier) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.padding(16.dp),
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = title,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantTheme {
        Greeting()
    }
}