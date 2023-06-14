package com.example.buldanyemektarifleri.Activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler


import androidx.appcompat.app.AppCompatActivity
import com.example.buldanyemektarifleri.R



class BuldanSplash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buldan_splash)
        val splashTimeOut: Long = 3000 //
        // 3 saniye sonra ana aktiviteye geçiş yap
        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, splashTimeOut)
    }
}