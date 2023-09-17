package com.soumya.myquotes.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.soumya.myquotes.model.Quote
import com.soumya.myquotes.R

@Composable
fun QuoteListItem(quote: Quote, onClick: (quote:Quote) -> Unit) {
    Card(
        elevation = 8.dp, modifier = Modifier
            .clickable { onClick(quote) }
            .padding(12.dp),
        backgroundColor = Color(0xFFDDDFE0)
    ) {
        Row(modifier = Modifier.padding(10.dp)) {
            Image(
                imageVector = Icons.Filled.FormatQuote,
                alignment = Alignment.Center,
                colorFilter = ColorFilter.tint(Color.Blue),
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .background(Color.Gray)
                    .align(Alignment.CenterVertically)
                    .border(2.dp, Color.LightGray, CircleShape),

                contentDescription = "Quote",
            )

            Spacer(modifier = Modifier.padding(4.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = quote.quote,
                    style = MaterialTheme.typography.body2,
                    modifier = Modifier.padding(5.dp),
                    fontWeight = FontWeight.Bold,
                    maxLines = 3
                )
                Box(
                    modifier = Modifier
                        .background(Color.Gray)
                        .fillMaxWidth(.4f)
                        .height(1.dp)
                )
                Text(
                    text = quote.dialog_deliverer + " (${quote.movie_name})",
                    style = MaterialTheme.typography.subtitle1,
                    fontFamily = FontFamily(Font(R.font.montserratmedium)),
                    modifier = Modifier.padding(5.dp)
                )


            }

        }
    }
}
