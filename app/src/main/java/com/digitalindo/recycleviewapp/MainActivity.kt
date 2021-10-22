package com.digitalindo.recycleviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataFlower = arrayOf("bunga 1","bunga 2","bunga 3","bunga 4")
        val dataImg = arrayOf(R.drawable.mawar,R.drawable.lily,R.drawable.kamboja,R.drawable.matahari)

        val listflower = findViewById<RecyclerView>(R.id.listFlower)

        val adapter = FlowerAdapter(dataImg, dataFlower)
        listflower.adapter= adapter
        listflower.layoutManager = LinearLayoutManager(this)
    }
}