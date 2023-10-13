import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class RecipeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RecipeApp()
        }
    }
}

@Composable
fun RecipeApp() {
    val recipes = listOf(
        "Passo 1: Prepare os ingredientes.\n" +
                "\n" +
                "2 xícaras de farinha de trigo\n" +
                "1 xícara de açúcar\n" +
                "1/2 xícara de manteiga derretida\n" +
                "1 colher de chá de fermento em pó\n" +
                "2 ovos\n" +
                "1 xícara de leite",

        "Passo 2: Misture os ingredientes secos.\n" + "\n" + "Em uma tigela grande, combine a farinha de trigo e o fermento em pó.",
        "Passo 3: Misture os ingredientes molhados.\n" + "\n" + "Em outra tigela, bata os ovos e adicione o açúcar, a manteiga derretida e o leite. Misture bem.",
        "Passo 4:Combine os ingredientes.\n" + "\n" + "Despeje a mistura de ingredientes molhados na mistura de ingredientes secos. Mexa até obter uma massa homogênea.",
        "Passo 5:  Asse o bolo.\n" + "\n" + "Pré-aqueça o forno a 180°C.\n" + "Despeje a massa em uma forma untada e asse no forno por 30 minutos.",

    )

    var currentStep by remember { mutableStateOf(0) }

    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column {
            Text(
                text = "Instruções da Receita",
                modifier = Modifier.padding(16.dp)
            )

            Text(
                text = recipes[currentStep],
                modifier = Modifier.padding(16.dp)
            )

            Button(
                onClick = {
                    if (currentStep < recipes.size - 1) {
                        currentStep++
                    }
                },
                modifier = Modifier.padding(16.dp)
            ) {
                Text("Próximo Passo")
            }
        }
    }
}
