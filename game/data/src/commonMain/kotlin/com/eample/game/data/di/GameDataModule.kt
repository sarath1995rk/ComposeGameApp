package com.eample.game.data.di

import com.eample.game.data.repository.GameRepositoryImpl
import com.eample.game.domain.repository.GameRepository
import org.koin.dsl.module

fun getGameDataModule() = module {
    factory<GameRepository> { GameRepositoryImpl(apiService = get()) }
}