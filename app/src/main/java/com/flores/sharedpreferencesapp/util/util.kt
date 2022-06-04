package com.flores.sharedpreferencesapp.util

fun formayNumberTo3Digits(number: Int):String="#${"%03d".format(number)}"

fun getIdPokemonFromUrl(url: String): String = url.split("/").toTypedArray()[6]