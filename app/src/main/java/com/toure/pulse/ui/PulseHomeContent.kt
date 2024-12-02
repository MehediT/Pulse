package com.toure.pulse.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.toure.pulse.data.LocalFitnessDataProvider
import com.toure.pulse.domain.model.TargetMuscle

@Composable
fun PulseHomeContent(
    modifier: Modifier = Modifier,
     innerPadding: PaddingValues = PaddingValues()) {
    Column(
        modifier = modifier.padding(innerPadding),
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        BodyPartsContent()
    }
}

@Composable
fun BodyPartsContent(modifier: Modifier = Modifier) {
    val state = rememberScrollState()
    LaunchedEffect(Unit) { state.animateScrollTo(100) }
    Scaffold(
        topBar = {
            Row (Modifier.fillMaxWidth().padding(bottom = 12.dp)){
                Text(
                    text = "Body parts",
                    fontSize = 24.sp,
                    maxLines = 3,
                    color = Color.Gray,
                    textAlign = TextAlign.Center,
                )
            }
        },
        modifier = modifier,
    ) { innerPadding ->
        Row (
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(1.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(innerPadding)
                .horizontalScroll(state)
        ) {
            repeat(
                times = LocalFitnessDataProvider.targetMuscles.size
            ) {
                BodyPart(
                    targetMuscle = LocalFitnessDataProvider.targetMuscles[it],
                    modifier =  Modifier.height(152.dp)
                )
            }
        }
    }
}

@Composable
fun BodyPart(
    targetMuscle: TargetMuscle,
    modifier: Modifier = Modifier
) {
    Column (
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Box(
            modifier = Modifier
                .size(76.dp) // Circle size
                .background(
                    color = MaterialTheme.colorScheme.primaryContainer,
                    shape = CircleShape // Makes the background circular
                ),
            contentAlignment = Alignment.Center // Centers the icon
        ) {
            Image(
                painter = painterResource(targetMuscle.muscleImageId),
                contentDescription = null,
                modifier = Modifier.size(52.dp ) // Adjust icon size relative to the circle
            )
        }
        Spacer(modifier = Modifier.padding(8.dp))
        Text(
            text = targetMuscle.name,
            fontSize = 14.sp,
            maxLines = 3,
            color = Color.Gray,
            textAlign = TextAlign.Center,
            modifier = Modifier.width(72.dp)
        )
    }
}

@Preview
@Composable
private fun PulseHomeContentPreview() {
    PulseHomeContent()
}
