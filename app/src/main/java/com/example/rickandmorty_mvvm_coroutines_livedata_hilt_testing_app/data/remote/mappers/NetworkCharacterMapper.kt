package com.example.rickandmorty_mvvm_coroutines_livedata_hilt_testing_app.data.remote.mappers

import com.example.rickandmorty_mvvm_coroutines_livedata_hilt_testing_app.data.remote.entities.NetCharacter
import com.example.rickandmorty_mvvm_coroutines_livedata_hilt_testing_app.domain.model.mappers.EntityMapper
import com.example.rickandmorty_mvvm_coroutines_livedata_hilt_testing_app.domain.model.Character
import javax.inject.Inject

class NetworkCharacterMapper
@Inject constructor(): EntityMapper<NetCharacter, Character> {
    override fun mapFromEntity(entity: NetCharacter): Character {
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

    override fun mapToEntity(domainModel: Character): NetCharacter {
        return NetCharacter(
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

    fun mapFromEntityList(entities: List<NetCharacter>): List<Character>{
        return entities.map { mapFromEntity(it) }
    }

}