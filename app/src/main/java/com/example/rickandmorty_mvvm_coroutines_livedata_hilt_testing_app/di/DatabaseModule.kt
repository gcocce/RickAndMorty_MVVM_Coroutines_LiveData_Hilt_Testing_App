package com.example.rickandmorty_mvvm_coroutines_livedata_hilt_testing_app.di

import android.content.Context
import com.example.rickandmorty_mvvm_coroutines_livedata_hilt_testing_app.data.local.AppDatabase
import com.example.rickandmorty_mvvm_coroutines_livedata_hilt_testing_app.data.local.CharacterDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase {
        return AppDatabase.getDatabase(context)
    }

    @Provides
    fun provideCharacterDao(appDatabase: AppDatabase): CharacterDao {
        return appDatabase.characterDao()
    }

}