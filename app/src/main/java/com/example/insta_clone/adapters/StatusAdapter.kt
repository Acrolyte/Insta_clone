package com.example.insta_clone.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.insta_clone.databinding.StatusViewBinding
import com.example.insta_clone.models.Status

data class StatusAdapter(val statuslist: ArrayList<Status>) :
    RecyclerView.Adapter<StatusAdapter.StatusViewHolder>() {
    class StatusViewHolder(val binding: StatusViewBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): StatusAdapter.StatusViewHolder {
        return StatusViewHolder(
            StatusViewBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: StatusAdapter.StatusViewHolder, position: Int) {
        holder.binding.tvUsername.text = statuslist[position].username
        holder.binding.ivUserdp.setImageResource(statuslist[position].userdp)
    }

    override fun getItemCount(): Int {
        return statuslist.size
    }

}