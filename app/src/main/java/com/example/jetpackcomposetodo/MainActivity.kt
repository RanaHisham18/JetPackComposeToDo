package com.example.jetpackcomposetodo

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposetodo.ui.theme.JetPackComposeToDoTheme
import com.example.jetpackcomposetodo.ui.theme.WellnessScreen
import com.example.jetpackcomposetodo.ui.theme.WellnessTaskItem
import java.nio.file.WatchEvent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackComposeToDoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    WellnessScreen()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetPackComposeToDoTheme {
    }
}
@SuppressLint("UnrememberedMutableState")

//fun WaterCounter(modifier: Modifier = Modifier){
//    Column(modifier = modifier.padding(16.dp)) {
//        var count by remember { mutableStateOf(0) }
//        if (count > 0) {
//            var showTask by remember {
//
//                mutableStateOf(true)
//            }
//            if (showTask){
//                WellnessTaskItem(
//                    onClose = {showTask = false },
//                    taskName = "Have you taken your 15 minute walk today?"
//                )
//            }
//            Text("You've had $count glasses.")
//        }
//        Row(modifier = Modifier.padding(8.dp)){
//            Button(onClick = { count++ }, Modifier.padding(top = 8.dp), enabled = count < 10) {
//                Text("Add one")
//        }
//            Button(
//                onClick = { count = 0 },
//                Modifier.padding(start = 8.dp, top = 8.dp)) {
//                Text("Clear water count")
//            }
//
//        }
//    }
//
//
//}
@Composable
fun StatelessCounter(count: Int, onIncrement: () -> Unit, modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        if (count > 0) {
            Text("You've had $count glasses.")
        }
        Button(onClick = onIncrement, Modifier.padding(top = 8.dp), enabled = count < 10) {
            Text("Add one")
        }
    } }

@Composable
fun StatefulCounter() {
    var waterCount by remember { mutableStateOf(0) }

    var juiceCount by remember { mutableStateOf(0) }

    StatelessCounter(waterCount, { waterCount++ })
    StatelessCounter(juiceCount, { juiceCount++ })
}

