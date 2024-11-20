package com.toure.pulse

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.graphics.shapes.RoundedPolygon
import com.toure.pulse.ui.PulseHomeContent
import com.toure.pulse.ui.theme.PulseTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PulseApp(
    windowSize : WindowWidthSizeClass,
    modifier: Modifier = Modifier,
    hasAiChatBot :  Boolean = false,
) {
    var presses by remember { mutableIntStateOf(0) }
    Scaffold(
        topBar = {
            PulseAppTopBar(
                modifier = Modifier.padding(16.dp)
            )
        },
        bottomBar = {
            PulseAppBottomBar()
        },
        floatingActionButton = {
            AnimatedVisibility(
                visible = hasAiChatBot
            ) {
                FloatingActionButton(onClick = { presses++ }) {
                    Icon(Icons.Default.Add, contentDescription = "Add")
                }
            }
        }
    ) { innerPadding ->
        PulseHomeContent(Modifier.padding(16.dp),innerPadding)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PulseAppTopBar(modifier: Modifier = Modifier) {
    TopAppBar(
        modifier = modifier
                .fillMaxWidth(),
//        colors = topAppBarColors(
//            containerColor = MaterialTheme.colorScheme.primaryContainer,
//            titleContentColor = MaterialTheme.colorScheme.primary,
//        ),
        title = {
            Row (
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
            ){
                Box(
                    modifier = Modifier
                        .size(52.dp) // Circle size
                        .background(
                            color = MaterialTheme.colorScheme.primaryContainer,
                            shape = CircleShape // Makes the background circular
                        ),
                    contentAlignment = Alignment.Center // Centers the icon
                ) {
                    Icon(
                        imageVector = Icons.Rounded.ShoppingCart,
                        contentDescription = null,
                        tint = Color.Black,
                        modifier = Modifier.size(52.dp * 0.6f) // Adjust icon size relative to the circle
                    )
                }
                Column (
                    modifier = Modifier.weight(2f).padding(start = 14.dp)
                ){
                    Text(
                        text = "Hey hi ! Mister foo ✌",
                        fontSize = 28.sp,
                        color = Color.Black,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "Some advice... lorem ipsum...",
                        fontSize = 18.sp,
                        color = Color.Gray,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    )
}
@Composable
fun PulseAppBottomBar(modifier: Modifier = Modifier) {
    BottomAppBar(
        containerColor = MaterialTheme.colorScheme.primaryContainer,
        contentColor = MaterialTheme.colorScheme.primary,
    ) {
        Text(
            modifier = Modifier
                .fillMaxWidth(),
            textAlign = TextAlign.Center,
            text = "Bottom app bar",
        )
    }
}

@Preview(
    showBackground = true,
    widthDp = 440,
    heightDp = 925
)
@Composable
fun GreetingPreview() {
    PulseTheme {
        PulseApp(WindowWidthSizeClass.Medium)
    }
}