package com.example.androiddevchallenge.data.repo

import com.example.androiddevchallenge.model.Dog
import com.example.androiddevchallenge.model.enum.Gender

val sampleDogs = listOf<Dog>(
    Dog(1, "test1", Gender.FEMALE, 1.2, "Some Type", "Loreum Ipsum", false),
    Dog(2, "test2", Gender.FEMALE, 1.2, "Some Type 2", "Loreum Ipsum", false),
    Dog(3, "test3", Gender.FEMALE, 1.2, "Some Type 2", "Loreum Ipsum", false),
    Dog(4, "test4", Gender.FEMALE, 1.2, "Some Type 2", "Loreum Ipsum", false),
    Dog(5, "test5", Gender.FEMALE, 1.2, "Some Type 2", "Loreum Ipsum", false),
)