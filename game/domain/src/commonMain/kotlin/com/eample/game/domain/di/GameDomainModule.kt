package com.eample.game.domain.di

import com.eample.game.domain.useCases.GetGamesUseCase
import org.koin.dsl.module

fun getGameDomainModule() = module {

    factory {
        GetGamesUseCase(gameRepository = get ())
    }

}