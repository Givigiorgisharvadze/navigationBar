package com.example.myapplication.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.myapplication.R

class fragmentOne : Fragment (R.layout.fragment_one) {

    private lateinit var name: EditText

    private lateinit var btnSubmitInfo: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        name = view.findViewById(R.id.name)

        btnSubmitInfo = view.findViewById(R.id.btnSubmitInfo)

        val navController = Navigation.findNavController(view)

        btnSubmitInfo.setOnClickListener {

            val nameText = name.text.toString()

            if (nameText.isEmpty()) {

                name.error = "შეავსეთ ველი"

                return@setOnClickListener

            } else if (nameText.length <= 1) {

                if (nameText.contains("1") || nameText.contains("2") || nameText.contains("3") || nameText.contains(
                        "4") || nameText.contains("5") || nameText.contains("6") || nameText.contains(
                        "7") || nameText.contains("8") || nameText.contains("9")
                ) {
                    name.error = "სახელი შეიცავს არასწორ სიმბოლოს"

                    return@setOnClickListener

                }
                else if (nameText.length >= 2) {

                    if (nameText.contains("1") || nameText.contains("2") || nameText.contains("3") || nameText.contains(
                            "4") || nameText.contains("5") || nameText.contains("6") || nameText.contains(
                            "7") || nameText.contains("8") || nameText.contains("9"))
                    {
                        name.error = "სახელი შეიცავს არასწორ სიმბოლოს"

                        return@setOnClickListener

                    }

                }

                else if (nameText.length <= 1) {

                    name.error = "სახელი შეიცავს არასაკმარისი რაოდენობის სიმბოლოებს"

                    return@setOnClickListener

                }

            }

            val action = fragmentOneDirections.actionHomeFragmentToProfileFragment(nameText)

            navController.navigate(action)

        }

    }
}