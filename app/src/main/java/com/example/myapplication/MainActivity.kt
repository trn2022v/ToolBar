package com.example.myapplication

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bNav.selectedItemId = R.id.item4
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.bNav.setOnItemReselectedListener {
            when (it.itemId) {
                R.id.item1 -> {

                    Toast.makeText(this, "Item1", Toast.LENGTH_SHORT).show()
                }
                R.id.item2 -> {
                    Toast.makeText(this, "Item2  i tak dalee", Toast.LENGTH_SHORT).show()

                }
            }
            true
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)


        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> finish()
            R.id.sync -> {
                Toast.makeText(this, "sync", Toast.LENGTH_SHORT).show()

            }
            R.id.delete -> {
                Toast.makeText(this, "Delete", Toast.LENGTH_SHORT).show()


            }

        }
        return true
    }
}