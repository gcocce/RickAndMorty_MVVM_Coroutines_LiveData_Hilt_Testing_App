package com.example.rickandmorty_mvvm_coroutines_livedata_hilt_testing_app.data.remote.entities

data class NetInfo(
    val count: Int,
    val next: String,
    val pages: Int,
    val prev: Any
)