package com.example.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.util.TypedValueCompat
import com.example.artspace.ui.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArtSpaceTheme {
                ArtSpaceApp()
            }
        }
    }
}

class Artwork(
    val title: String,
    val artist: String,
    val year: String,
    @DrawableRes val art: Int,
)

@Composable
fun ArtSpaceApp(modifier: Modifier = Modifier) {
    val collection: ArrayDeque<Artwork> = ArrayDeque(5)
    collection.add(Artwork(
        "One",
        "Bob One",
        "1901",
        R.drawable.dscf8290
    ))
    collection.add(Artwork(
        "Two",
        "Bob Two",
        "1902",
        R.drawable.dscf8291
    ))
    collection.add(Artwork(
        "Three",
        "Bob Three",
        "1903",
        R.drawable.dscf9394
    ))
    collection.add(Artwork(
        "Four",
        "Bob Four",
        "1904",
        R.drawable.dscf9420
    ))
    collection.add(Artwork(
        "Five",
        "Bob Five",
        "1905",
        R.drawable.dscf9421
    ))

    var currentArtworkIndex by remember { mutableStateOf(0)}
    var currentArtwork = collection.get(currentArtworkIndex)

    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image (
            painter = painterResource(currentArtwork.art),
            contentDescription = currentArtwork.title,
            modifier = modifier.padding(24.dp)
        )

        ArtInfo(currentArtwork)

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    top = 12.dp,
                    start = 60.dp,
                    end = 60.dp
                ),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Button(
                onClick = {
                    if (currentArtworkIndex == 0) {
                        currentArtworkIndex = collection.size - 1
                    } else {
                        currentArtworkIndex--
                    }
                },
                modifier = Modifier.size(width = 120.dp, height = 40.dp)
            ) {
                Text(stringResource(R.string.previous))
            }

            Button(
                onClick = {
                    if (currentArtworkIndex == collection.size - 1) {
                        currentArtworkIndex = 0
                    } else {
                        currentArtworkIndex++
                    }
                },
                modifier = Modifier.size(width = 120.dp, height = 40.dp)
            ) {
                Text(stringResource(R.string.next))
            }
        }
    }
}

@Composable
fun ArtInfo(
    artwork: Artwork,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .background(color = Color.LightGray)
            .fillMaxWidth()
            .padding(
                top = 4.dp,
                bottom = 4.dp,
                start = 24.dp
            )
        ,
    ) {
        Text(
            text = artwork.title,
            fontSize = 24.sp
        )
        Row(

        ) {
            Text(
                text = artwork.artist,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = " (${artwork.year.toString()})",
                fontSize = 16.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArtSpaceTheme {
        ArtSpaceApp()
    }
}