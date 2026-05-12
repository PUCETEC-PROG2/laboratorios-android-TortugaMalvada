package ec.edu.puce.githubclient.ui.components
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
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun Repoitem(
    name: String,
    description: String,
    avatarIng: String,
    language: String
){
    Card (
        modifier = Modifier
            .fillMaxWidth()
            .padding(all=8.dp)
    ){
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(all=16.dp)
        ){
            AsyncImage(
                model = avatarIng,
                contentDescription = "Imagen de $name",
                modifier = Modifier.size(size=60.dp),
                contentScale = ContentScale.Crop
            )
            Spacer(
                modifier = Modifier.width(width=16.dp))
            Column {
                Text(
                    color = Red,
                    text= name,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold
                )
                Spacer(
                    modifier = Modifier.height(height =4.dp))
                Text(
                    color = Red,
                    text= description,
                    style = MaterialTheme.typography.bodyMedium,
                    maxLines = 3
                )
                Spacer(
                    modifier = Modifier.height(height =4.dp))
                Text(
                    color = Red,
                    text= language,
                    style = MaterialTheme.typography.labelSmall,
                )
                Spacer(
                    modifier = Modifier.height(height =4.dp))
            }
        }
    }
}
@Preview (showBackground = true)
@Composable
fun Item () {
    Repoitem(
        name = "Tortuga Malvada",
        description= "Una tortuga llena de maldad",
        avatarIng = "https://media.istockphoto.com/id/172912400/es/foto/tortuga-mordedora-enojado-primer-plano.jpg?s=1024x1024&w=is&k=20&c=DHp3HJQewcdII-2o2bakiNPTJ2LPhSdmxtlGLmanbLo=",
        language = "Python"
    )
}