package com.eample.game.data.repository

import com.eample.coreNetwork.apiSrvice.ApiService
import com.eample.game.domain.model.Game
import com.eample.game.domain.repository.GameRepository
import toDomainListOfGames

class GameRepositoryImpl(
    private val apiService: ApiService
) : GameRepository{
    override suspend fun getGames(): Result<List<Game>> {

        val result = apiService.getGames()
        return if(result.isSuccess){
           Result.success( result.getOrThrow().results.toDomainListOfGames())
        }else{
            Result.failure(result.exceptionOrNull()!!)
        }



    }
}