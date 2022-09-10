package com.example.challengechap3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView

class KataAdapter(val listKata : ArrayList<ListKata>) : RecyclerView.Adapter<KataAdapter.ViewHolder>()  {
    var onClick:((ListKata) -> Unit)? = null

    class ViewHolder(view: View):RecyclerView.ViewHolder(view) {
        var btnKata = view.findViewById<Button>(R.id.btnKata)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_kata, parent, false)
        return KataAdapter.ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.btnKata.text = listKata[position].kata
        holder.btnKata.setOnClickListener {
            onClick?.invoke(listKata[position])
        }
    }

    override fun getItemCount(): Int {
        return listKata.size
    }

}