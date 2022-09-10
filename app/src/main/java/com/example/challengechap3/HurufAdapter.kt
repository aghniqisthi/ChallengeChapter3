package com.example.challengechap3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView

class HurufAdapter(val listHuruf : ArrayList<ListHuruf>) : RecyclerView.Adapter<HurufAdapter.ViewHolder>() {
    var onClick:((ListHuruf) -> Unit)? = null

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var btnHuruf = view.findViewById<Button>(R.id.btnHuruf)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_huruf, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.btnHuruf.text = listHuruf[position].huruf
        holder.btnHuruf.setOnClickListener {
            onClick?.invoke(listHuruf[position])
        }
    }

    override fun getItemCount(): Int {
        return listHuruf.size
    }

}