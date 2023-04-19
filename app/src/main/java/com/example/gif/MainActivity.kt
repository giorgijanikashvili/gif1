package com.example.gif

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {


   private lateinit var bottom_naw_menu: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottom_naw_menu = findViewById(R.id.bottom_naw_menu)
        val appBarConfiguration = AppBarConfiguration(setOf(
            R.id.firstfragment,
            R.id.secondfragment,
            R.id.thirdfragment
        ))


        setupActionBarWithNavController(Controller, appBarConfiguration )
        bottom_naw_menu.setupWithNavController(controller)

    }



    }
}