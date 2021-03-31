package com.example.androidwithkotlin.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidwithkotlin.R
import com.example.androidwithkotlin.view.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitAllowingStateLoss()
        }
    }
}
