package manoellribeiro.dev.processingwithcompose

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.systemGestureExclusion
import androidx.compose.ui.Modifier
import androidx.fragment.app.FragmentActivity
import androidx.fragment.compose.AndroidFragment
import manoellribeiro.dev.processingwithcompose.ui.theme.ProcessingWithComposeTheme

class MainActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProcessingWithComposeTheme {
                AndroidFragment<MyProcessingFragment>(
                    modifier = Modifier
                        .fillMaxSize()
                        .systemGestureExclusion()
                )
            }
        }
    }
}