@file:OptIn(ExperimentalMaterial3Api::class)

package com.sy.montazerisession2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.sy.montazerisession2.ui.theme.MontazeriSession2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MontazeriSession2Theme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = {
                        CenterAlignedTopAppBar(title = {
                            Text(
                                text = "Settings",
                                fontWeight = FontWeight.Bold
                            )
                        }, navigationIcon = {
                            Icon(
                                modifier = Modifier.padding(start = 24.dp),
                                painter = painterResource(id = R.drawable.ic_back),
                                contentDescription = ""
                            )
                        }, actions = {
                            Icon(
                                modifier = Modifier.padding(end = 24.dp),
                                painter = painterResource(id = R.drawable.ic_search),
                                contentDescription = ""
                            )
                        })
                    }) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .padding(innerPadding)
                            .padding(14.dp)
                            .fillMaxSize(),
                        verticalArrangement = Arrangement.spacedBy(14.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Box(contentAlignment = Alignment.BottomEnd) {
                            Image(
                                modifier = Modifier
                                    .padding(bottom = 16.dp)
                                    .size(150.dp)
                                    .clip(CircleShape),
                                contentScale = ContentScale.FillHeight,
                                painter = painterResource(id = R.drawable.profile),
                                contentDescription = ""
                            )
                            IconButton(onClick = { /*TODO*/ }) {
                                Box(
                                    modifier = Modifier
                                        .shadow(4.dp)
                                        .clip(CircleShape)
                                        .background(Color.White)
                                        .padding(6.dp)
                                ) {
                                    Icon(
                                        painter = painterResource(id = R.drawable.ic_search),
                                        modifier = Modifier.size(24.dp),
                                        contentDescription = ""
                                    )
                                }
                            }
                        }
                        SettingsItem()
                        SettingsItem()
                        OutlinedTextField(
                            value = "",
                            onValueChange = {},
                            colors = TextFieldDefaults.colors(
                                focusedContainerColor = Color(0xFFE9E9E9),
                                unfocusedContainerColor = Color(0xFFE9E9E9),
                                focusedIndicatorColor = Color(0xFFA5A5A5),
                                unfocusedIndicatorColor = Color(0xFFCECECE),
                            ),
                            label = { Text(text = "Salam") },
                            modifier = Modifier.fillMaxWidth()
                        )
                        Spacer(modifier = Modifier.weight(1f))
                        Button(
                            onClick = { /*TODO*/ },
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(48.dp),
                            shape = RoundedCornerShape(16.dp)
                        ) {
                            Text(text = "Save Changes")
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun SettingsItem() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .shadow(1.dp, shape = RoundedCornerShape(16.dp))
            .clip(RoundedCornerShape(16.dp))
            .background(Color.White)
            .clickable { }
            .padding(10.dp)
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_search),
            contentDescription = ""
        )
        Text(text = "STH")
        Spacer(modifier = Modifier.weight(1f))
        Icon(
            painter = painterResource(id = R.drawable.ic_back),
            modifier = Modifier
                .rotate(180f)
                .alpha(0.5f), contentDescription = ""
        )
    }
}

