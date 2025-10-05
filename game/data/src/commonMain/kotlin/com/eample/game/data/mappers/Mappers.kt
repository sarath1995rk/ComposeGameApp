import com.eample.coreNetwork.model.game.Result
import com.eample.game.domain.model.Game

fun List<Result>.toDomainListOfGames(): List<Game> = map {

    Game(
        id = it.id,
        it.name,
        imageUrl = it.background_image
    )
}