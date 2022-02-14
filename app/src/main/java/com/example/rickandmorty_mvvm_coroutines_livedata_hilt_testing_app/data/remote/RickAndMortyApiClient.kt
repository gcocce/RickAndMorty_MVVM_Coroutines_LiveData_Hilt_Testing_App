package com.example.rickandmorty_mvvm_coroutines_livedata_hilt_testing_app.data.remote

import com.example.rickandmorty_mvvm_coroutines_livedata_hilt_testing_app.data.remote.entities.NetCharacter
import com.example.rickandmorty_mvvm_coroutines_livedata_hilt_testing_app.data.remote.entities.NetCharacterList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface RickAndMortyApiClient {
    @GET("character")
    suspend fun getAllCharacters() : Response<NetCharacterList>

    @GET("character/{id}")
    suspend fun getCharacter(@Path("id") id: Int): Response<NetCharacter>
}