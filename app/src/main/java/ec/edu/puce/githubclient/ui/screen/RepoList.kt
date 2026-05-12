package ec.edu.puce.githubclient.ui.screen
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ec.edu.puce.githubclient.ui.components.Repoitem

@Composable
fun RepoList () {
    Column (
        modifier = Modifier
            .padding(horizontal = 4.dp, vertical = 48.dp)
    ){
        Repoitem(
            name = "Tortuga Malvada",
            description= "Una tortuga llena de maldad",
            avatarIng = "https://media.istockphoto.com/id/172912400/es/foto/tortuga-mordedora-enojado-primer-plano.jpg?s=1024x1024&w=is&k=20&c=DHp3HJQewcdII-2o2bakiNPTJ2LPhSdmxtlGLmanbLo=",
            language = "Python"
        )
        Repoitem(
            name = "Tortuga Bondadosa",
            description= "Una tortuga llena de bondad",
            avatarIng = "https://zoo.cordoba.es/wp-content/uploads/2022/01/tortugablan-1200x832.jpg",
            language = "Java"
        )
        Repoitem(
            name = "Tortuga Ingenua",
            description= "Una tortuga llena de ingenuidad",
            avatarIng = "https://thumbs.dreamstime.com/b/clísico-de-tortuga-perro-kawaii-carapace-vida-marina-ingenua-dibujada-mano-ilustración-linda-anfibios-en-peligro-extinción-171615749.jpg?w=768",
            language = "Kotlin"
        )

    }
}
@Preview (showBackground = true)
@Composable
fun Item () {
    RepoList()
}