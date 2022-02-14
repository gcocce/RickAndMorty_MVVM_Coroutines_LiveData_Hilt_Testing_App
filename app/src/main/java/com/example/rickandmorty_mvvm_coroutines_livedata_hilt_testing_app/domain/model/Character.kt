package com.example.rickandmorty_mvvm_coroutines_livedata_hilt_testing_app.domain.model

data class Character(
    var id: Int,
    var created: String,
    var gender: String,
    var image: String,
    var name: String,
    var species: String,
    var status: String,
    var type: String,
    var url: String)