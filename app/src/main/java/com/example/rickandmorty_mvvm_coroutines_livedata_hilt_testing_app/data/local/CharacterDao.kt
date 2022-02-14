package com.example.rickandmorty_mvvm_coroutines_livedata_hilt_testing_app.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.rickandmorty_mvvm_coroutines_livedata_hilt_testing_app.data.local.entities.DBCharacter

@Dao
interface CharacterDao {

    @Query("SELECT * FROM characters")
    fun getAllCharacters() : LiveData<List<DBCharacter>>

    @Query("SELECT * FROM characters WHERE id = :id")
    fun getCharacter(id: Int): LiveData<DBCharacter>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(characters: List<DBCharacter>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(character: DBCharacter)


}