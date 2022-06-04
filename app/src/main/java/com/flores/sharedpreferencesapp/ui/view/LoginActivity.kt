package com.flores.sharedpreferencesapp.ui.view
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.flores.sharedpreferencesapp.databinding.ActivityLoginBinding
import com.flores.sharedpreferencesapp.ui.viewmodel.LoginViewModel

class LoginActivity: BaseActivity<ActivityLoginBinding>(ActivityLoginBinding::inflate) {
    private lateinit var loginViewModel: LoginViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginViewModel= LoginViewModel(this)
        loginViewModel.onCreate()
        loginViewModel.emptyFieldError.observe(this){
            Toast.makeText(this,"Ingrese los datos del Usuario", Toast.LENGTH_SHORT).show()
        }
        loginViewModel.fieldAuthenticateError.observe(this){
            Toast.makeText(this,"Error de login", Toast.LENGTH_SHORT).show()
        }
        loginViewModel.goSuccesActivity.observe(this){
            val intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
    fun startLogin(view: View){
        //Validate input

        loginViewModel.validateInputs(binding.edtEmail.text.toString(),binding.edtPassword.text.toString())
    }
    fun register(view: View){
        val intent=Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }
}