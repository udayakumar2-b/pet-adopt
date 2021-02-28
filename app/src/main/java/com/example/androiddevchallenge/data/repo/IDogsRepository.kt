package com.example.androiddevchallenge.data.repo

import com.example.androiddevchallenge.model.Dog

interface IDogsRepository {
    suspend fun getDogs(): List<Dog>

    suspend fun adoptDog(dogId: Int)
}