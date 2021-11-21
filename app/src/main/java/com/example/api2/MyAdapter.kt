package com.example.api2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_items.view.*


class MyAdapter(private val context: Context, private val userList: List<myDataItem>): RecyclerView.Adapter<MyAdapter.ViewHolder>(){
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)  {

        var textid: TextView = itemView.textId
        var emails: TextView = itemView.textTitle
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.row_items, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textid.text = userList[position].name
        holder.emails.text = userList[position].email
    }

    override fun getItemCount(): Int {
        return userList.size
    }

}