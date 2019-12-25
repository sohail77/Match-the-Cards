package com.example.matchthecards

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.matchthecards.menufragment.MenuFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState != null) {
            val fragment = MenuFragment()
            supportFragmentManager.beginTransaction()
                .add(R.id.my_Nav, fragment)
                .commit()
        }
    }
}
