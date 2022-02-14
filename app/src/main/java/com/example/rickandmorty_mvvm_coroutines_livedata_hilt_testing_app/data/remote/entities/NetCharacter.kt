package com.example.rickandmorty_mvvm_coroutines_livedata_hilt_testing_app.data.remote.entities

data class NetCharacter (
    val id: Int,
    val created: String,
    val gender: String,
    val image: String,
    val name: String,
    val species: String,
    val status: String,
    val type: String,
    val url: String)