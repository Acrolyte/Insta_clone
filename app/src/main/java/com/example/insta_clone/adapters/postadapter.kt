package com.example.insta_clone.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.insta_clone.databinding.PostViewBinding
import com.example.insta_clone.models.Posts

data class PostAdapter(val userlist: ArrayList<Posts>) :
    RecyclerView.Adapter<PostAdapter.PostViewHolder>() {

    class PostViewHolder(val binding: PostViewBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostAdapter.PostViewHolder {
        return PostViewHolder(
            PostViewBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.binding.ivPost.setImageResource(userlist[position].userpost)
        holder.binding.tvUsername.text = userlist[position].username
        holder.binding.ivUserdp.setImageResource(userlist[position].userdp)
    }

    override fun getItemCount(): Int {
        return userlist.size
    }
}