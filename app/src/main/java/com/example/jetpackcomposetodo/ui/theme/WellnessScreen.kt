package com.example.jetpackcomposetodo.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.jetpackcomposetodo.StatefulCounter
import com.example.jetpackcomposetodo.WellnesstaskList

@Composable
fun WellnessScreen(modifier: Modifier = Modifier){
    Column(modifier = modifier) {
        StatefulCounter()
        WellnesstaskList()
    }
}