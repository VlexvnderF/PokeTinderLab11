package com.flores.sharedpreferencesapp.data.network

import com.flores.sharedpreferencesapp.data.model.PokemonListModel
import com.flores.sharedpreferencesapp.data.model.PokemonModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response
import javax.inject.Inject

class PokemonService @Inject constructor(private val pokemonApi:PokemonApi) {

    suspend fun getPokemons() : PokemonListModel{
        return withContext(Dispatchers.IO){
            val res: Response<PokemonListModel> = pokemonApi.getPokemons()
            res.body()!!
        }
    }
}