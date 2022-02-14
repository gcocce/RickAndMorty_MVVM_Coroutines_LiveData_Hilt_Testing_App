package com.example.rickandmorty_mvvm_coroutines_livedata_hilt_testing_app.data.local.mappers

import com.example.rickandmorty_mvvm_coroutines_livedata_hilt_testing_app.data.local.entities.DBCharacter
import com.example.rickandmorty_mvvm_coroutines_livedata_hilt_testing_app.data.remote.entities.NetCharacter
import com.example.rickandmorty_mvvm_coroutines_livedata_hilt_testing_app.domain.model.Character
import com.example.rickandmorty_mvvm_coroutines_livedata_hilt_testing_app.domain.model.mappers.EntityMapper
import javax.inject.Inject

class DBCharacterMapper
@Inject constructor(): EntityMapper<DBCharacter, Character>{
    override fun mapFromEntity(entity: DBCharacter): Character {
        return Character(
            id=entity.id,
            created= entity.created,
            gender= entity.gender,
            image = entity.image,
            name = entity.name,
            species = entity.species,
            status = entity.status,
            type = entity.type,
            url = entity.url
        )
    }

    override fun mapToEntity(domainModel: Character): DBCharacter {
        return DBCharacter(
            id = domainModel.id,
            created = domainModel.created,
            gender = domainModel.gender,
            image = domainModel.image,
            name = domainModel.name,
            species = domainModel.species,
            status = domainModel.status,
            type = domainModel.type,
            url = domainModel.url
        )
    }

    fun mapFromEntityList(entities: List<DBCharacter>): List<Character>{
        return entities.map { mapFromEntity(it) }
    }
}