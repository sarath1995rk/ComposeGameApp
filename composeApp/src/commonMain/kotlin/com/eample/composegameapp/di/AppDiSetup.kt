package com.eample.composegameapp.di

import com.eample.coreNetwork.di.getCoreNetworkModule
import com.eample.game.data.di.getGameDataModule
import com.eample.game.domain.di.getGameDomainModule
import com.eample.ui.di.getGameUiModule
import org.koin.core.KoinApplication
import org.koin.core.context.startKoin

fun initKoin(koinApplication: ((KoinApplication) -> Unit)? = null) {
    startKoin {
        koinApplication?.invoke(this)
        modules(
            getCoreNetworkModule(),
            getGameDataModule(),
            getGameDomainModule(),
            getGameUiModule(),
//            getSearchDataModule(),
//            getSearchDomainModule(),
//            getSearchUiModule(),
//            getCoreDatabaseModule(),
//            getFavoriteDataModule(),
//            getFavoriteDomainModule(),
//            getFavoriteUiModule()
        )
    }
}