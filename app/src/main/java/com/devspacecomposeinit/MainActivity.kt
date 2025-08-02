package com.devspacecomposeinit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.devspacecomposeinit.ui.theme.ComposeInitTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeInitTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    val artist = Artist (
                        name = "Leonardo da Vinci",
                        lastSeeOnline = "3 minutes ago",
                        image = R.drawable.ic_leonardo_da_vinci
                    )
                    ArtistCard(artist)
                }
            }
        }
    }
}



@Composable
fun ArtistCard(artist: Artist) {
    Row (verticalAlignment = Alignment.CenterVertically) {
        Image(
            modifier = Modifier
                .size(60.dp)
                .clip(CircleShape),
            contentScale = ContentScale.FillWidth,
            painter = painterResource(id = artist.image), contentDescription = "Artist image")

        Spacer(modifier = Modifier.size(16.dp))

        Column {
            Text(
                artist.name,
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold
            )
            Text(
                artist.lastSeeOnline,
                color = Color.Gray
            )
        }

    }
}

data class Artist (
    val name: String,
    val lastSeeOnline: String,
    @DrawableRes val image: Int,
)

@Preview (showBackground = true)
@Composable
fun ArtistCardPreview() {
    ComposeInitTheme {
        val artist = Artist(
            name = "Leonardo da Vinci",
            lastSeeOnline = "3 minutes ago",
            image = R.drawable.ic_leonardo_da_vinci,
        )
        ArtistCard(artist)
    }
}

