package com.devspacecomposeinit

class ListRepository {

    private val leonardo = Artist(
        id = 1,
        name = "Leonardo da Vinci",
        lastSeeOnline = "3 minutes ago",
        image = R.drawable.ic_leonardo_da_vinci,
        art = R.drawable.ic_mona_lisa,
        description = "Leonardo da Vinci foi um polímata renascentista, conhecido por suas obras-primas como a Mona Lisa e a Última Ceia. Além de pintor, ele foi inventor, cientista, arquiteto, anatomista e engenheiro, deixando um vasto legado de cadernos de anotações com estudos detalhados sobre diversas áreas do conhecimento"
    )

    private val picasso = Artist(
        id = 2,
        name = "Pablo Picasso",
        lastSeeOnline = "5 minutes ago",
        image = R.drawable.ic_pablo_picasso,
        art = R.drawable.ic_beijo,
        description = "Pablo Picasso foi um pintor, escultor, ceramista e cenógrafo espanhol, um dos mais influentes artistas do século XX. Cofundador do cubismo, seu trabalho é marcado por uma diversidade de estilos e fases, como as fases Azul e Rosa. Sua obra mais famosa, Guernica, é um poderoso protesto contra a guerra."
    )

    private val vanGogh = Artist(
        id = 3,
        name = "Vicent Van Gogh",
        lastSeeOnline = "2 minutes ago",
        image = R.drawable.ic_vincent_van_gogh,
        art = R.drawable.ic_starry_night,
        description = "Vincent van Gogh foi um pintor pós-impressionista holandês. Sua obra é caracterizada por cores vibrantes, pinceladas expressivas e temas como autorretratos, paisagens e naturezas-mortas. Apesar de uma vida marcada por dificuldades e pouco reconhecimento em vida, Van Gogh é hoje um dos artistas mais renomados e influentes da história da arte, com obras como A Noite Estrelada e Girassóis."
    )

    private val salvador = Artist(
        id = 4,
        name = "Salvador Dali",
        lastSeeOnline = "7 minutes ago",
        image = R.drawable.ic_salvador_dali,
        art = R.drawable.ic_persistence_of_memory,
        description = "Salvador Dalí foi um pintor, escultor e cineasta espanhol, um dos principais nomes do surrealismo. Conhecido por suas obras de arte oníricas e impactantes, ele explorou o mundo dos sonhos e do inconsciente. A Persistência da Memória, com seus relógios derretidos, é uma de suas criações mais famosas, simbolizando a natureza subjetiva do tempo."
    )

    fun getArtistsList(): List<Artist> {
        return listOf(vanGogh, salvador, picasso, leonardo)
    }

    fun getArtistById(id: Int): Artist {
        return getArtistsList().first { it.id == id }
    }

}

