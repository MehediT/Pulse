package com.toure.pulse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.toure.pulse.ui.theme.PulseTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PulseTheme {
                val windowSize = calculateWindowSizeClass(this)
                PulseApp(
                    windowSize = windowSize.widthSizeClass,
                    modifier = Modifier.padding()
                )
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun PulseMediumPreview() {
        PulseTheme {
            PulseApp(WindowWidthSizeClass.Medium)
        }
    }
    @Preview(showBackground = true)
    @Composable
    fun PulseExpandedPreview() {
        PulseTheme {
            PulseApp(WindowWidthSizeClass.Expanded)
        }
    }
    @Preview(showBackground = true)
    @Composable
    fun PulseCompactPreview() {
        PulseTheme {
            PulseApp(WindowWidthSizeClass.Compact)
        }
    }
}
