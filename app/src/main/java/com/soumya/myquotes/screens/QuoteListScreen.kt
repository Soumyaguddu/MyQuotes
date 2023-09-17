package com.soumya.myquotes.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.soumya.myquotes.R
import com.soumya.myquotes.model.Quote

@Composable
fun QuoteListScreen(data: Array<Quote>, onClick: (quote:Quote) -> Unit) {
    Column() {
        Text(
            text = "Hindi Dialogue",
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(8.dp, 16.dp).fillMaxWidth(1f),
            style = MaterialTheme.typography.h6,
            fontFamily = FontFamily(Font(R.font.montserratblackitalic))
        )
        QuoteList(data = data,onClick)
}}