package com.example.challengechap3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView

class HurufAdapter(val listHuruf: ArrayList<ListHuruf>): RecyclerView.Adapter<HurufAdapter.ViewHolder>() {
    var listener:  RecyclerViewClickListener? = null
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view), View.OnClickListener {
        var huruf = view.findViewById<Button>(R.id.btnHuruf)
        init {
            view.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            TODO("Not yet implemented")
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_huruf, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.huruf.text = listHuruf[position].huruf
        holder.huruf.setOnClickListener{
            listener?.onItemClicked(it, listHuruf[position])
        }
    }

    override fun getItemCount(): Int {
        return listHuruf.size
    }

}