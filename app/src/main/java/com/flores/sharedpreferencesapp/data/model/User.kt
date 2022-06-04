package com.flores.sharedpreferencesapp.data.model

import java.io.Serializable
import com.flores.sharedpreferencesapp.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

data class User(
        val id: String,
        val name: String,
        val email: String,
        val password: String,
    ) : Serializable{
        fun getImage()="https://graph.facebook.com/$id/picture?type=large&width=720&height=720"
    }
