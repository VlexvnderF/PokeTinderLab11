package com.flores.sharedpreferencesapp.data.network

import com.flores.sharedpreferencesapp.data.model.PokemonListModel
import retrofit2.Response
import retrofit2.http.GET

interface PokemonApi {
    @GET(value = "?limit=20")
    suspend fun getPokemons() : Response<PokemonListModel>
}