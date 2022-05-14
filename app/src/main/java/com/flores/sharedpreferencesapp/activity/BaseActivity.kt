package com.flores.sharedpreferencesapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.viewbinding.ViewBinding
import com.flores.sharedpreferencesapp.R

abstract class BaseActivity<B : ViewBinding>(val bindingFactory: (LayoutInflater)-> B) : AppCompatActivity() {

    lateinit var binding: B

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = bindingFactory(layoutInflater)
        setContentView(binding.root)
    }

}