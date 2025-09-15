package com.devspacecomposeinit

import android.widget.Space
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.devspacecomposeinit.ui.theme.ComposeInitTheme


@Composable
fun ArtistDetailsScreen (
    artistId:Int,
    navController: NavController,
) {
    val repo = ListRepository()
    val artist = repo.getArtistById(artistId)

    Scaffold (
        topBar = {
            ToolBarWithBackButton(title = "Detail") {
                navController.popBackStack()
           }
        },
        content = {paddingValues ->
            ArtistDetailContent(
                artist= artist,
                modifier = Modifier.padding(paddingValues)
            )
        }
    )
}

@Composable
private fun ArtistDetailContent (
    artist: Artist,
    modifier: Modifier = Modifier

) {

    Column (
        modifier = modifier
            .fillMaxSize()
    ){
        ArtistCard(artist = artist,
            onClick = {}
        )


        Text(
            modifier = Modifier.padding(16.dp),
            text = artist.description)

    }
}

@Preview (showBackground = true)
@Composable
private fun ArtistDetailContentPreview (){
    ComposeInitTheme {
        val artist = Artist(
            name = "Leonardo da Vinci",
            lastSeeOnline = "3 minutes ago",
            image = R.drawable.ic_leonardo_da_vinci,
            art = R.drawable.ic_mona_lisa,
            id = 0,
            description = "Leonardo da Vinci foi um polímata renascentista, conhecido por suas obras-primas como a Mona Lisa e a Última Ceia. Além de pintor, ele foi inventor, cientista, arquiteto, anatomista e engenheiro, deixando um vasto legado de cadernos de anotações com estudos detalhados sobre diversas áreas do conhecimento."
        )
        ArtistDetailContent(artist= artist)
    }

}