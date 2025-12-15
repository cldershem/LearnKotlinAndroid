package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BusinessCard(
                        "Bob Smith",
                        "Captain of Industry",
                        "+1 123 123 456 7890",
                        "@bobsmithofindustry",
                        "bob@captofindustry.com",
                        modifier = Modifier,
                    )
                }
            }
        }
    }
}

@Composable
fun NameTitle(name: String, title: String, modifier: Modifier = Modifier) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .padding(
                top = 16.dp,
                bottom = 16.dp
            )
    ) {
        Icon(
            Icons.Filled.Person,
            "mail",
            modifier = Modifier
                .size(150.dp)
        )

        Text(
            text = name,
            fontSize = 36.sp,
            modifier = modifier
        )

        Text(
            text = title,
            fontSize = 24.sp,
            color = Color.Yellow,
            modifier = modifier,
        )
    }
}

@Composable
fun ContactInfo(phone: String, social: String, email: String, modifier: Modifier = Modifier) {
    val iconColor = Color.Green
    val iconPadding = 20.dp
    val fontSize = 20.sp
    val iconSize = 22.dp

    Column (
        modifier = modifier
            .padding(16.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Icon(
                Icons.Filled.Phone,
                "mail",
                tint = iconColor,
                modifier = Modifier
                    .padding(
                        end = iconPadding,
                    )
                    .size(iconSize)
            )

            Text(
                text = phone,
                modifier = modifier,
                fontSize = fontSize
            )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                Icons.Filled.AccountCircle,
                "social",
                tint = iconColor,
                modifier = Modifier
                    .padding(end = iconPadding)
                    .size(iconSize)
            )
            Text(
                text = social,
                modifier = modifier,
                fontSize = fontSize
            )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                Icons.Filled.Email,
                "email",
                tint = iconColor,
                modifier = Modifier
                    .padding(end = iconPadding)
                    .size(iconSize)
            )
            Text(
                text = email,
                modifier = modifier,
                        fontSize = fontSize
            )
        }
    }
}

@Composable
fun BusinessCard(
    name: String,
    title: String,
    phone: String,
    social: String,
    email: String,
    modifier: Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.Blue)
    ) {
        NameTitle(
            name = name,
            title = title,
            modifier = modifier.padding(bottom = 50.dp)
        )

        ContactInfo(
            phone = phone,
            social = social,
            email = email,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        BusinessCard(
           "Bob Smith",
            "Captain of Industry",
            "+1 123 123 456 7890",
            "@bobsmithofindustry",
            "bob@captofindustry.com",
            modifier = Modifier
        )
    }
}