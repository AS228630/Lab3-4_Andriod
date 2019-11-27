package com.senmas.lab3

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.senmas.lab3.adapters.ImageAdapter


@SuppressLint("Registered")
class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    private val urls = arrayOf(
        "https://i.imgur.com/2KxoIsa.jpg",
        "https://i.imgur.com/EZHXbA0.jpg",
        "https://i.imgur.com/qb7Ev7A.jpg",
        "https://i.imgur.com/ZtXXAwX.jpg",
        "https://i.imgur.com/lrE9vha.jpg",
        "https://i.imgur.com/S66rx9n.jpg",
        "https://i.imgur.com/KaSkWef.jpg",
        "https://i.imgur.com/jp5z1s0.jpg",
        "https://i.imgur.com/iLNrl9Z.jpg",
        "https://i.imgur.com/Z3ei74h.jpg",
        "https://i.imgur.com/uXbb81d.jpg",
        "https://i.imgur.com/92mT0BB.jpg"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ImageAdapter(urls)
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

}
