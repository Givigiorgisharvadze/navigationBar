package com.example.myapplication.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.myapplication.R

class fragmentThree : Fragment (R.layout.fragment_three) {

    private lateinit var phoneNumber: EditText

    private lateinit var btnSubmitNumber : Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        phoneNumber = view.findViewById(R.id.phoneNumber)

        btnSubmitNumber = view.findViewById(R.id.btnSubmitNumber)

        btnSubmitNumber.setOnClickListener {

            val phoneNumberText = phoneNumber.text.toString()

            if(phoneNumberText.isEmpty() || phoneNumberText.length != 9) {

                phoneNumber.error = "ველი არასწორადაა შევსებული, რადგან ნომერი უნდა შედგებოდეს 9 ციფრისაგან"

                return@setOnClickListener

            }

            if (!phoneNumberText.startsWith("5")) {

                phoneNumber.error = "ნომერი უნდა იწყებოდეს 5-იანით"

            }

            else {

                phoneNumber.setText("")

            }

        }

    }

}