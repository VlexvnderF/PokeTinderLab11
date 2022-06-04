package com.flores.sharedpreferencesapp.domain.usecase

import com.flores.sharedpreferencesapp.data.PokemonRepository
import com.flores.sharedpreferencesapp.domain.model.Pokemon
import javax.inject.Inject

class GetPokemonUseCase @Inject constructor(private  val repository: PokemonRepository){
    suspend operator fun invoke():List<Pokemon> {
        return repository.getAllPokemonFromApi()
    }
}