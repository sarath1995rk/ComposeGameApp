package com.eample.coreNetwork.apiSrvice

import com.eample.coreNetwork.model.game.GameResponse
import com.eample.coreNetwork.model.game.Result
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.parameter

class ApiService(
    val httpClient : HttpClient
) {
    //https://api.rawg.io/api/games
    suspend fun getGames() :  kotlin.Result<GameResponse>{

       return try {
            val response = httpClient.get("api/games"){
              url {
                  parameter("key" , "befe24a0b3684a609eacf61622134270")
              }
            }.body<GameResponse>()
             kotlin.Result.success(response)

        }catch (e: Exception){
            kotlin.Result.failure(e)
        }



    }

}