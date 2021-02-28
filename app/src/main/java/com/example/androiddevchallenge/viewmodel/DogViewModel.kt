package com.example.androiddevchallenge.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.data.repo.FakeDogRepository
import com.example.androiddevchallenge.data.repo.IDogsRepository
import com.example.androiddevchallenge.model.Dog

class DogViewModel: ViewModel() {
    private var currentEditPosition by mutableStateOf(-1)
    private val dogsRepo: IDogsRepository by lazy {
        FakeDogRepository()    }

    var dogs by mutableStateOf(dogsRepo.getDogs())

    fun adoptDog(item: Dog) {
        print("adopting")
    }
}