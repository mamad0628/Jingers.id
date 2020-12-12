package com.zechx.jingersid.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.zechx.jingersid.R
import com.zechx.jingersid.databinding.ActivityMainBinding
import com.zechx.jingersid.ui.auth.AuthActivity
import com.zechx.jingersid.ui.auth.JingersidAuth

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.buttonLogout.setOnClickListener {
            JingersidAuth.logout(this) {
                startActivity(Intent(this, AuthActivity::class.java))
                finish()
            }
        }
    }
}