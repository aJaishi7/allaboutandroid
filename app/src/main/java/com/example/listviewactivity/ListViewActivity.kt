package com.example.listviewactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class ListViewActivity : AppCompatActivity() {
    private lateinit var lstAnimals: ListView;
    private lateinit var tvAnimal: TextView;

    val animalList = arrayListOf<String>(
        "Dog", "Cat", "Cow", "Lion", "Elephant"
    );

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view);

        //Binding Data
        lstAnimals = findViewById(R.id.lstAnimals);
        tvAnimal = findViewById(R.id.tvAnimal);

        //Creating Array Adapter
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, animalList);
        lstAnimals.adapter = adapter;

        //OnItemClickListener setting on Listview items
        lstAnimals.setOnItemClickListener { parent, view, position, id ->
            val animal = parent.getItemAtPosition(position).toString();
            tvAnimal.text = animal.toString();
        }
    }
}