package com.example.myapplication.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.myapplication.R

class fragmentFour : Fragment (R.layout.fragment_four) {

    private lateinit var name : EditText

    private lateinit var surName : EditText

    private lateinit var email : EditText

    private lateinit var password : EditText

    private lateinit var submit : Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        name = view.findViewById(R.id.name)

        surName = view.findViewById(R.id.surName)

        email = view.findViewById(R.id.email)

        password = view.findViewById(R.id.password)

        submit = view.findViewById(R.id.submit)

        submit.setOnClickListener {

            val nameText = name.text.toString()

            val surNameText = surName.text.toString()

            val emailText = email.text.toString()

            val passwordText = password.text.toString()

            if(nameText.isEmpty() || nameText.length <= 1) {

                name.error = "აუცილებელია სახელის ველი შედგებოდეს მინიმუმ 2 სიმბოლოსაგან"

                return@setOnClickListener

            }

            if(surNameText.isEmpty() || surNameText.length <= 3) {

                surName.error = "აუცილებელია გვარის ველი შედგებოდეს მინიმუმ 4 სიმბოლოსაგან"

                return@setOnClickListener

            }

            if (emailText.isEmpty() || emailText.length <= 11) {

                email.error = "აუცილებელია ემაილი შედგებოდეს მინიმუმ 12 სიმბოლოსაგან "

                return@setOnClickListener

            }

            if (passwordText.isEmpty() || passwordText.length != 8) {

                password.error = "აუცილებელია პაროლის ველი შედგებოდეს 8 სიმბოლოსაგან"

                return@setOnClickListener
            }

            else {

                name.setText("")

                surName.setText("")

                email.setText("")

                password.setText("")

            }

        }

    }

}