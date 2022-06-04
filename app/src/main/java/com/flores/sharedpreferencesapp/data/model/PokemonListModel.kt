package com.flores.sharedpreferencesapp.data.model

import com.google.gson.annotations.SerializedName

data class PokemonListModel (
    @SerializedName(value = "count") val count:Int,
    @SerializedName(value ="results") val results: List<PokemonModel>
)
