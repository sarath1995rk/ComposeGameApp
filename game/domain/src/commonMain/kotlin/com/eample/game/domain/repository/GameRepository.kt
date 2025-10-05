package com.eample.game.domain.repository

import com.eample.game.domain.model.Game

interface GameRepository {

    suspend fun getGames() : Result<List<Game>>
}