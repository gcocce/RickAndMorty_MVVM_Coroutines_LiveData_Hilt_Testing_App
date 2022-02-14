package com.example.rickandmorty_mvvm_coroutines_livedata_hilt_testing_app.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "characters")
data class DBCharacter(
    @PrimaryKey
    val id: Int,
    val created: String,
    val gender: String,
    val image: String,
    val name: String,
    val species: String,
    val status: String,
    val type: String,
    val url: String
)