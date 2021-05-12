package com.example.insta_clone.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.insta_clone.databinding.MessageViewBinding
import com.example.insta_clone.models.Messages

data class messageadapter(val messlist: ArrayList<Messages>) :
    RecyclerView.Adapter<messageadapter.MessageViewHolder>() {

    class MessageViewHolder(val binding: MessageViewBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): messageadapter.MessageViewHolder {
        return MessageViewHolder(
            MessageViewBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: messageadapter.MessageViewHolder, position: Int) {
        holder.binding.ivUserdp.setImageResource(messlist[position].userdp)
        holder.binding.tvUsername.text = messlist[position].username
        holder.binding.tvUsertime.text = messlist[position].usertime
    }

    override fun getItemCount(): Int {
        return messlist.size
    }
}
