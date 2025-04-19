package com.example.viruj.Fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.viruj.R
import com.example.viruj.activity_pathlabs
import com.example.viruj.doctors_activity


class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val doctor: ImageView = view.findViewById(R.id.doc)
        doctor.setOnClickListener {
            val intent = Intent(requireContext(), doctors_activity::class.java)
            startActivity(intent)
        }
        val pathlabs: ImageView = view.findViewById(R.id.pathlabs)
        pathlabs.setOnClickListener {
            val intent = Intent(requireContext(), activity_pathlabs::class.java)
            startActivity(intent)
        }
        return view
    }

}