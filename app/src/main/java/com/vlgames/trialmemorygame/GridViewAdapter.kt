package com.vlgames.trialmemorygame

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import com.vlgames.trialmemorygame.R.drawable.*

class GridViewAdapter(context: Context, var list: ArrayList<Card>) : BaseAdapter() {

    private var context: Context? = null

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
//        val imageView: ImageView
//        if (convertView == null) {
//            imageView = ImageView(this.context)
//            imageView.layoutParams = ViewGroup.LayoutParams(250, 250)
//            imageView.scaleType = ImageView.ScaleType.FIT_XY
//        } else
//            imageView = convertView as ImageView
//        imageView.setImageResource(arrayOf(blue_monsters, blue_monsters2, green_monsters,
//            green_monsters2, orange_monsters, plate_blue_monsters, plate_red_monsters,
//            purple_monsters, red_monsters, yellow_monsters)as Int)

//        return imageView

//
        var currentView = convertView
        if (currentView == null) {
            currentView =
                LayoutInflater.from(context).inflate(R.layout.single_card_layout, parent, false)

        }
        (currentView?.findViewById<ImageView>(R.id.monster_img))?.setImageResource(list[position].index)

        return currentView!!
    }

    override fun getItem(position: Int): Any? {
        return null
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return 20
    }

    init {
        this.context = context
    }

}




