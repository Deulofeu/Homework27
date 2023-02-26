package com.example.homework27.ui

import android.content.Intent
import android.net.Uri
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.homework27.R
import com.example.homework27.domain.NewsData

class NewsViewHolder(
    itemView: View,
) : RecyclerView.ViewHolder(itemView) {
    fun onBind(item: NewsData) {
        val image = itemView.findViewById<ImageView>(R.id.ivNewsImage)
        val name = itemView.findViewById<TextView>(R.id.tvNewsTitle)
        val author = itemView.findViewById<TextView>(R.id.tvNewsAuthor)

        Glide
            .with(itemView.context)
            .load(item.urlToImage)
            .into(image)

        name.text = item.title
        author.text = item.author

        itemView.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(item.url)
            name.context.startActivity(intent)
        }
    }
}