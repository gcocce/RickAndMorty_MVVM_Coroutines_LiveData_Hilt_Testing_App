package com.example.rickandmorty_mvvm_coroutines_livedata_hilt_testing_app.data.remote.entities

data class NetCharacterList(
    val info: NetInfo,
    val results: List<NetCharacter>
)