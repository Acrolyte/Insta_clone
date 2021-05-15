package com.example.insta_clone

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.insta_clone.adapters.PostAdapter
import com.example.insta_clone.adapters.StatusAdapter
import com.example.insta_clone.databinding.FragmentMainScreenBinding
import com.example.insta_clone.models.Posts
import com.example.insta_clone.models.Status

class MainScreen : Fragment() {

    private lateinit var postrecyclerview: RecyclerView
    private lateinit var statusrecyclerview: RecyclerView
    private lateinit var binding: FragmentMainScreenBinding
    private lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentMainScreenBinding.inflate(layoutInflater)
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainScreenBinding.inflate(layoutInflater)
        binding.ivDm.setOnClickListener {
            navController.navigate(R.id.action_mainScreen_to_DMFragment)
        }
        val statuslist = arrayListOf(
            Status("Planet1", R.drawable.img1),
            Status("Planet2", R.drawable.img2),
            Status("Planet3", R.drawable.img3),
            Status("Planet4", R.drawable.img4),
            Status("Planet5", R.drawable.img5),
            Status("Planet6", R.drawable.img6),
            Status("Planet2", R.drawable.img2),
            Status("Planet3", R.drawable.img3),
            Status("Planet4", R.drawable.img4),
            Status("Planet5", R.drawable.img5),
        )
        val userlist = arrayListOf(
            Posts("Planet1", R.drawable.img1, R.drawable.img1),
            Posts("Planet2", R.drawable.img2, R.drawable.img2),
            Posts("Planet3", R.drawable.img3, R.drawable.img3),
            Posts("Planet4", R.drawable.img4, R.drawable.img4),
            Posts("Planet5", R.drawable.img5, R.drawable.img5),
            Posts("Planet6", R.drawable.img6, R.drawable.img6)
        )
        val statusAdapter = StatusAdapter(statuslist)
        statusrecyclerview = binding.rvStatusbar
        statusrecyclerview.setHasFixedSize(true)
        statusrecyclerview.layoutManager = LinearLayoutManager(activity,LinearLayoutManager.HORIZONTAL,false)
        statusrecyclerview.adapter = statusAdapter

        val postadapter = PostAdapter(userlist)
        postrecyclerview = binding.rvPosts
        postrecyclerview.setHasFixedSize(true)
        postrecyclerview.layoutManager = LinearLayoutManager(activity)
        postrecyclerview.adapter = postadapter
        return binding.root
    }
}