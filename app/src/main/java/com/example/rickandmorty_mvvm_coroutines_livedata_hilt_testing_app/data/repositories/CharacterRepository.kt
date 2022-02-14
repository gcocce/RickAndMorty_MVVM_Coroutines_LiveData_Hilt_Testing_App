package com.example.rickandmorty_mvvm_coroutines_livedata_hilt_testing_app.data.repositories

import com.example.rickandmorty_mvvm_coroutines_livedata_hilt_testing_app.data.local.CharacterDao
import com.example.rickandmorty_mvvm_coroutines_livedata_hilt_testing_app.data.remote.RickAndMortyApiClient
import javax.inject.Inject

class CharacterRepository @Inject constructor(
    private val remoteDataSource: RickAndMortyApiClient,
    private val localDataSource: CharacterDao
) {


}