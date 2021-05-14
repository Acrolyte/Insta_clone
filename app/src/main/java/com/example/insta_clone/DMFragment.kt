package com.example.insta_clone

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.insta_clone.adapters.messageadapter
import com.example.insta_clone.databinding.FragmentDMBinding
import com.example.insta_clone.models.Messages

class DMFragment : Fragment() {

    private lateinit var messagerecyclerview: RecyclerView
    private lateinit var binding: FragmentDMBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDMBinding.inflate(layoutInflater)
        val messlist = arrayListOf(
            Messages(R.drawable.img1, "Planet1", "Active 2h ago"),
            Messages(R.drawable.img2, "Planet2", "Sent 1h ago"),
            Messages(R.drawable.img3, "Planet3", "Mentioned you in a story"),
            Messages(R.drawable.img4, "Planet4", "Shared 49m ago"),
            Messages(R.drawable.img5, "Planet5", "Seen by Planet5"),
            Messages(R.drawable.img6, "Planet6", "Liked a message"),
            Messages(R.drawable.img3, "Planet7", "Active 19m ago"),
            Messages(R.drawable.img4, "Planet8", "Reacted to your story"),
            Messages(R.drawable.img1, "Planet1", "Active 2h ago"),
            Messages(R.drawable.img2, "Planet2", "Sent 1h ago"),
            Messages(R.drawable.img3, "Planet3", "Mentioned you in a story"),
            Messages(R.drawable.img4, "Planet4", "Shared 49m ago"),
            Messages(R.drawable.img5, "Planet5", "Seen by Planet5"),
            Messages(R.drawable.img6, "Planet6", "Liked a message"),
            Messages(R.drawable.img3, "Planet7", "Active 19m ago"),
            Messages(R.drawable.img4, "Planet8", "Reacted to your story")
        )

        val messageadapter = messageadapter(messlist)
        messagerecyclerview = binding.rvMessages
        messagerecyclerview.setHasFixedSize(true)
        messagerecyclerview.layoutManager = LinearLayoutManager(activity)
        messagerecyclerview.adapter = messageadapter
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentDMBinding.inflate(layoutInflater)
    }
}