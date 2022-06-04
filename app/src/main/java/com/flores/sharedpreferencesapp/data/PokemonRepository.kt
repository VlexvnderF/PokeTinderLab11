package com.flores.sharedpreferencesapp.data

import com.flores.sharedpreferencesapp.data.model.PokemonListModel
import com.flores.sharedpreferencesapp.data.model.PokemonModel
import com.flores.sharedpreferencesapp.data.network.PokemonService
import com.flores.sharedpreferencesapp.domain.model.Pokemon
import com.flores.sharedpreferencesapp.domain.model.toDomain
import javax.inject.Inject

class PokemonRepository @Inject constructor(
    private val pokemonService: PokemonService
) {
    suspend fun getAllPokemonFromApi():List<Pokemon>{
        val listResponse: PokemonListModel= pokemonService.getPokemons()
        val response: List<PokemonModel> = listResponse.results
        return response.map {it.toDomain()}
    }
}