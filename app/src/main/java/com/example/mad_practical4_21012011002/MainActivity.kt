package com.example.mad_practical4_21012011002

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val login :Button=findViewById(R.id.Login)
        val signup :Button=findViewById(R.id.SignUp)
        login.setOnClickListener {
            intent = Intent(this , LoginActivity::class.java)
            startActivity(intent)
    }

        signup.setOnClickListener(){
            intent = Intent(this , RegistrationActivity::class.java)
            startActivity(intent)
        }
}
}
