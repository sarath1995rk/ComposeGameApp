package com.eample.coreNetwork.di

import com.eample.coreNetwork.apiSrvice.ApiService
import com.eample.coreNetwork.client.KtorClient
import org.koin.dsl.module

fun getCoreNetworkModule() = module {


    single {
        ApiService(httpClient = KtorClient.getInstance())
    }

}