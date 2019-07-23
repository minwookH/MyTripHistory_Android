package com.minwook.mytriphistory.kotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.minwook.mytriphistory.R
import com.minwook.mytriphistory.kotlin.DAO.Content
import java.util.ArrayList

class ContentsAdapter(var contents: ArrayList<Content>, var mListener: OnListItemSelectedInterface)
    : RecyclerView.Adapter<ContentsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_contents_cardview, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return contents.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val content = contents[position]
        holder.title.text = content.title
        holder.location.text = content.location
        holder.date.text = content.startDate + " ~ " + content.endDate
    }


    fun addList(list: ArrayList<Content>) {
        contents.addAll(list)
    }

    interface OnListItemSelectedInterface {
        fun onItemSelected(position: Int)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title: TextView
        var location: TextView
        var date: TextView
        var cardView: CardView

        init {
            this.title = itemView.findViewById(R.id.content_title)
            this.location = itemView.findViewById(R.id.location)
            this.date = itemView.findViewById(R.id.date)
            this.cardView = itemView.findViewById(R.id.card_view)
            this.cardView.setOnClickListener { mListener.onItemSelected(adapterPosition) }
        }
    }
}