package com.digitalindo.recycleviewapp

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FlowerAdapter (val dataImg: Array<Int>, val dataFlower: Array<String>) : RecyclerView.Adapter<FlowerAdapter.FlowerViewHolder>() {

    class FlowerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val img = itemView.findViewById<ImageView>(R.id.imageViewFlower)
        val textview = itemView.findViewById<TextView>(R.id.textViewFlower)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlowerViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_flower,parent,false)

        return FlowerViewHolder(view)

    }

    override fun onBindViewHolder(holder: FlowerViewHolder, position: Int) {

        holder.textview.text = dataFlower[position]
        holder.img.setImageResource(dataImg[position])

    }

    override fun getItemCount()= dataFlower.size

//    override fun getItemCount(): Int {
//        return  dataFlower.size
//    }
}