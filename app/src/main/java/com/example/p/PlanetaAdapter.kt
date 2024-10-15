package com.example.p

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class PlanetaAdapter(private val context: Context, private val planetas: List<Planeta>) : BaseAdapter() {
    override fun getCount(): Int {
        return planetas.size
    }

    override fun getItem(position: Int): Any {
        return planetas[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.adapter_planeta, parent, false)

        val tNomePlaneta = view.findViewById<TextView>(R.id.tNomePlaneta)
        val imgPlaneta = view.findViewById<ImageView>(R.id.imgPlaneta)

        val planeta = planetas[position]
        tNomePlaneta.text = planeta.nome
        imgPlaneta.setImageResource(planeta.img)

        return view
    }
}