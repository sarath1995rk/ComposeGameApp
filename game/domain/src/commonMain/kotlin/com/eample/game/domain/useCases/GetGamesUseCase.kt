package com.eample.game.domain.useCases

import com.eample.game.domain.model.Game
import com.eample.game.domain.repository.GameRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class GetGamesUseCase(
    private val gameRepository: GameRepository
) {


    operator fun invoke() = flow<Result<List<Game>>> {
        emit(gameRepository.getGames())
    }.catch {
        emit(Result.failure(it))
    }.flowOn(Dispatchers.Default)

}