  package com.example.p

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(), AdapterView.OnItemClickListener {
    private lateinit var listView: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listview)

        val planetas = PlanetaData.getPlanetas()

        listView.adapter = PlanetaAdapter(this, planetas)

        listView.onItemClickListener = this
    }

    override fun onItemClick(parent: AdapterView<*>, view: View, idx: Int, id: Long) {
        val planeta = parent.getItemAtPosition(idx) as Planeta
        Toast.makeText(this, "Planeta: ${planeta.nome}", Toast.LENGTH_SHORT).show()
    }
}