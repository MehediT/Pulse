package com.toure.pulse.ui


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PulseHomeContent(
    modifier: Modifier = Modifier,
     innerPadding: PaddingValues = PaddingValues()) {
    Column(
        modifier = modifier.padding(innerPadding),
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
    }
}

@Preview
@Composable
private fun PulseHomeContentPreview() {
    PulseHomeContent()
}
