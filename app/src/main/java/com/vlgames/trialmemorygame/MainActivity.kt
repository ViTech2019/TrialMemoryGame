package com.vlgames.trialmemorygame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import com.vlgames.trialmemorygame.R.drawable.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.single_card_layout.*

class MainActivity : AppCompatActivity() {
    val monsters: ArrayList<Card> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gridContainer = findViewById<GridView>(R.id.grid_view_monsters)
        val listView = GridView(this)
        val adapter = GridViewAdapter(this, monsters)
        listView.adapter = adapter
        gridContainer.addView(monster_img)

//        monsterList()
//        val gridView = findViewById<GridView>(R.id.grid_view_monsters)
//        val imageAdapter = GridViewAdapter(this, monsters)
//        gridView.adapter = imageAdapter
//        imageAdapter.getItem(monsters.size)
//        grid_view_monsters.adapter = GridViewAdapter(this, monsters)
//    }
//
//    // Adds animals to the empty animals ArrayList
//    private fun monsterList() {

        monsters.add(blue_monsters)
        monsters.add(blue_monsters2)
        monsters.add(green_monsters)
        monsters.add(green_monsters2)
        monsters.add(orange_monsters)
        monsters.add(plate_blue_monsters)
        monsters.add(plate_red_monsters)
        monsters.add(purple_monsters)
        monsters.add(red_monsters)
        monsters.add(yellow_monsters)
        for (i in monsters) {
            println(i)
        }

    }
}


