package com.soumya.myquotes.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FormatQuote
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import com.soumya.myquotes.DataManager
import com.soumya.myquotes.R
import com.soumya.myquotes.model.Quote


@Composable
fun QuoteDetailScreen(quote: Quote) {
    BackHandler() {
        DataManager.switchPages(null)
    }
    Box(
        contentAlignment = Alignment.Center, modifier = Modifier
            .fillMaxSize(1f)
            .background(
                Brush.linearGradient(
                    colors = listOf(
                        Color(0xFFFFFFFF),
                        Color(0xFF60ACE7),
                    )
                )
            )
    ) {
        Card(elevation = 8.dp, modifier = Modifier.padding(32.dp)) {
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .align(Alignment.Center)
                    .padding(16.dp, 24.dp)
            ) {
                Image(
                    imageVector = Icons.Filled.FormatQuote,
                    alignment = Alignment.Center,
                    colorFilter = ColorFilter.tint(Color.Blue),
                    modifier = Modifier
                        .size(60.dp)
                        .clip(CircleShape)
                        .background(Color.Gray)
                        .border(2.dp, Color.LightGray, CircleShape),

                    contentDescription = "Quote",
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = quote.quote,
                    style = MaterialTheme.typography.h6,
                    fontFamily = FontFamily(Font(R.font.montserratblackitalic))
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = quote.dialog_deliverer,
                    style = MaterialTheme.typography.subtitle1,
                    fontFamily = FontFamily(Font(R.font.montserrat_light_italic))
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = quote.movie_name,
                    style = MaterialTheme.typography.subtitle1,
                    fontFamily = FontFamily(Font(R.font.montserrat_light_italic))
                )


            }

        }
    }

}
