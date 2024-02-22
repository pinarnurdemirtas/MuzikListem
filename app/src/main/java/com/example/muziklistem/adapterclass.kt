package com.example.muziklistem

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class adapterclass(context: Context, liste:ArrayList<sarki>) : BaseAdapter(){
    val inflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    val liste = liste
    override fun getCount(): Int {
        return liste.size
    }

    override fun getItem(position: Int): Any {
        return liste.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    @SuppressLint("MissingInflatedId")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view = inflater.inflate(R.layout.item_layout,parent,false)
        val textView = view.findViewById<TextView>(R.id.textView)
        val imageView = view.findViewById<ImageView>(R.id.imageView)

        textView.text = liste.get(position).ad
        imageView.setImageResource(liste.get(position).id)

        return view
    }
}