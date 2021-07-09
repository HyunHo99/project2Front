package com.example.myapplication.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.data.DataDiv
import com.example.myapplication.model.Division

class DivAdapter (
    private val context: Context,
    private val dataset: List<Division>
    ): RecyclerView.Adapter<DivAdapter.DivViewHolder>() {

    class DivViewHolder(val view: View) : RecyclerView.ViewHolder(view){
        val divView: TextView = view.findViewById(R.id.div_name)
//        val divButtonView: Button = view.findViewById(R.id.div_button)
//        val divImg : ImageView = view.findViewById(R.id.)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DivViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_division, parent, false)
        return DivViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: DivViewHolder, position: Int) {
        val item = dataset[position]
        holder.divView.setText(item.DivisionResourceId)
//        holder.divButtonView.setOnClickListener{
//            val context = holder.view.context
//            val intent = Intent(context, DetailActivity::class.java)
//        }

    }

    override fun getItemCount(): Int {
        return dataset.size
    }

}