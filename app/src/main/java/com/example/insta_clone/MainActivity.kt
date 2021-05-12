package com.example.insta_clone;

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.insta_clone.adapters.PostAdapter
import com.example.insta_clone.databinding.ActivityMainBinding
import com.example.insta_clone.models.Posts

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var postrecyclerview: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivDm.setOnClickListener {
            startActivity(Intent(this, DMActivity::class.java))
        }

        val userlist = arrayListOf(
            Posts("Planet1", R.drawable.img1, R.drawable.img1),
            Posts("Planet2", R.drawable.img2, R.drawable.img2),
            Posts("Planet3", R.drawable.img3, R.drawable.img3),
            Posts("Planet4", R.drawable.img4, R.drawable.img4),
            Posts("Planet5", R.drawable.img5, R.drawable.img5),
            Posts("Planet6", R.drawable.img6, R.drawable.img6)
        )
        val postadapter = PostAdapter(userlist)

        postrecyclerview = binding.rvPosts
        postrecyclerview.setHasFixedSize(true)
        postrecyclerview.layoutManager = LinearLayoutManager(this)

        postrecyclerview.adapter = postadapter
    }
}