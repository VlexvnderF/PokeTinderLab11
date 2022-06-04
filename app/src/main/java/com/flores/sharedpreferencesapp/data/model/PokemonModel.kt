package com.flores.sharedpreferencesapp.data.model

import com.google.gson.annotations.SerializedName

data class PokemonModel (
        @SerializedName(value = "name") val name:String,
        @SerializedName(value = "url") val url: String
)