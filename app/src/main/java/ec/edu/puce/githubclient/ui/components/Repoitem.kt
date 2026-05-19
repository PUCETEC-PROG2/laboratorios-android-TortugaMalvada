package ec.edu.puce.githubclient.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import ec.edu.puce.githubclient.models.GithubUser
import ec.edu.puce.githubclient.models.Repository

@Composable
fun Repoitem(
    repository: Repository
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(all = 8.dp)
            .background(color = Black)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(all = 16.dp)
                .background(color = Yellow)
        ) {

            AsyncImage(
                model = repository.owner.avatarUrl,
                contentDescription = "Imagen",
                modifier = Modifier.size(size = 60.dp),
                contentScale = ContentScale.Crop
            )

            Spacer(
                modifier = Modifier.width(width = 16.dp)
            )

            Column {

                repository.name.let {
                    Text(
                        color = Red,
                        text = it,
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold
                    )
                }

                Spacer(
                    modifier = Modifier.height(height = 4.dp)
                )

                repository.description?.let {
                    Text(
                        color = Blue,
                        text = it,
                        style = MaterialTheme.typography.bodyMedium,
                        maxLines = 3
                    )
                }

                Spacer(
                    modifier = Modifier.height(height = 4.dp)
                )

                repository.language?.let {
                    Text(
                        color = Green,
                        text = it,
                        style = MaterialTheme.typography.labelSmall,
                    )
                }

                Spacer(
                    modifier = Modifier.height(height = 4.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RepoItemPreview() {

    val repository: Repository = Repository(
        id = "1234567890",
        name = "Repositorio",
        description = "hola",
        language = "no",
        owner = GithubUser(
            id = "123",
            login = "blblbl",
            avatarUrl = "asad"
        )
    )

    Repoitem(repository = repository)
}