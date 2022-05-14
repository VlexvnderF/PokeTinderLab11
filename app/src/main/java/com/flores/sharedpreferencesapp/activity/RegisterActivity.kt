package com.flores.sharedpreferencesapp.activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import com.flores.sharedpreferencesapp.databinding.ActivityRegisterBinding
import com.flores.sharedpreferencesapp.util.SharedPreferenceUtil

class RegisterActivity : BaseActivity<ActivityRegisterBinding>(ActivityRegisterBinding::inflate){
    private lateinit var sharedPreferenceUtil: SharedPreferenceUtil
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedPreferenceUtil = SharedPreferenceUtil().also {
            it.setSharedPreference(this)
        }
    }

    fun registerUser(view: View){
        val user = com.flores.sharedpreferencesapp.data.User(
            "1",
            binding.edtUserName.text.toString(),
            binding.edtEmail.text.toString(),
            binding.edtPassword.text.toString())

        sharedPreferenceUtil.saveFacebookUser(user)
        val intent = Intent(applicationContext, LoginActivity::class.java)
        intent.putExtra("user", user)
        startActivity(intent)
    }
    fun loginUser(view: View){
        val intent = Intent(applicationContext, LoginActivity::class.java)
        startActivity(intent)
    }
}