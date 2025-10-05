package com.eample.ui.di

import com.eample.ui.game.GameViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

fun getGameUiModule() = module {
    viewModel { GameViewModel(getGameUseCase = get()) }
   }
