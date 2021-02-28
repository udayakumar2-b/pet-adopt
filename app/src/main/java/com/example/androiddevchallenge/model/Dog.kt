package com.example.androiddevchallenge.model

import com.example.androiddevchallenge.model.enum.Gender

data class Dog(val id:Int, val name: String, val gender: Gender, val age:Number, val type:String, val description: String, var isAdopted: Boolean)
