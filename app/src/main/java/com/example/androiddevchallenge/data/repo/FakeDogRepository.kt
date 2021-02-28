package com.example.androiddevchallenge.data.repo

import android.content.res.Resources
import com.example.androiddevchallenge.model.Dog
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withContext

class FakeDogRepository(
//    private val resources: Resources
): IDogsRepository{
    private val mutex = Mutex()

    override suspend fun getDogs(): List<Dog> {
        return withContext(Dispatchers.IO) {
            delay(200) // pretend we're on a slow network
            sampleDogs
        }
    }

    override suspend fun adoptDog(dogId: Int) {
        mutex.withLock {
            var selectedDog = sampleDogs.find { it.id == dogId }
            selectedDog?.isAdopted = true
        }
    }

}