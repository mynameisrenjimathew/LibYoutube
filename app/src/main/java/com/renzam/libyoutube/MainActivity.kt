package com.renzam.libyoutube

import android.content.Context
import android.opengl.Visibility
import android.os.Bundle
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.viedios_list.*

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycleview)
        recyclerView.setHasFixedSize(true)

        val mLayoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = mLayoutManager



        val videoIds = arrayOf("kVYB4PJlwZ8", "74yb9E3WY1I", "XM2Q2rpmxmY", "Ginx7WKq5GE", "QRUNUtZUtEo", "GP4okspbfMM", "KlOodL9Gw4", "LiM7QGy0BSI", "KlOodL9Gw4", "TMSIR210mRg", "nUFT6oN01wI", "BqGCJUXEqxQ","qTa0lCFRD9o","zw_CgYQtr2U","ZWVjleKN7MI","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg","nafJV0im2Sg")


        val recyclerViewAdapter = Adapter(this,videoIds,this.lifecycle)
        recyclerView.adapter = recyclerViewAdapter


    }

    override fun onBackPressed() {

        if (youtube_player_view.isFullScreen())
            youtube_player_view.toggleFullScreen()
        else
            super.onBackPressed()


    }
}

