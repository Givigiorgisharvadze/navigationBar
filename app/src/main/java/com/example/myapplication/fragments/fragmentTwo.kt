package com.example.myapplication.fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.myapplication.R

class fragmentTwo : Fragment (R.layout.fragment_two) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.inputName).text =
            fragmentTwoArgs.fromBundle(requireArguments()).name

    }

}