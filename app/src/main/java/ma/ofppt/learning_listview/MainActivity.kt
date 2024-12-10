package ma.ofppt.learning_listview

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val Listview:ListView = findViewById(R.id.ListView1)
        val ListItem = arrayOf(
            "Orange",
            "Banane",
            "Pomme",
            "Setting",
            "Call Emenrgency"
        )

        val ListAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, ListItem)
        Listview.adapter = ListAdapter

        Listview.setOnItemClickListener { parent, view, position, id ->
            var SelectedItem = parent.getItemAtPosition(position) as String
            Toast.makeText(this,"you just clicked on this option: $SelectedItem", Toast.LENGTH_SHORT).show()
        }
    }
}