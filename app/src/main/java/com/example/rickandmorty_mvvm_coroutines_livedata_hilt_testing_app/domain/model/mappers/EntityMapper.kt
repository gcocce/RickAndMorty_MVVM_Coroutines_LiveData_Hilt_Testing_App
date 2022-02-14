package com.example.rickandmorty_mvvm_coroutines_livedata_hilt_testing_app.domain.model.mappers

interface EntityMapper <Entity, DomainModel> {

    fun mapFromEntity(entity: Entity): DomainModel
    fun mapToEntity(domainModel: DomainModel): Entity
}