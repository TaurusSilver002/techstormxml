package com.example.techstormxml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import java.nio.channels.AsynchronousFileChannel.open

class MainActivity : AppCompatActivity() {
    lateinit var toggle :ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drawerLayout : DrawerLayout= findViewById(R.id.drawerLayout)
        val navView :NavigationView=findViewById(R.id.Nav_view)

        toggle = ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {

            when(it.itemId){
                R.id.nav_home -> Toast.makeText(applicationContext,"Clicked Home",Toast.LENGTH_SHORT).show()
                R.id.nav_schedule -> Toast.makeText(applicationContext,"Clicked Schedule",Toast.LENGTH_SHORT).show()
                R.id.nav_results -> Toast.makeText(applicationContext,"Clicked Result",Toast.LENGTH_SHORT).show()
                R.id.nav_sponcers -> Toast.makeText(applicationContext,"Clicked Sponcers",Toast.LENGTH_SHORT).show()
                R.id.nav_team -> Toast.makeText(applicationContext,"Clicked Team",Toast.LENGTH_SHORT).show()
                R.id.nav_dev -> Toast.makeText(applicationContext,"Clicked Developers",Toast.LENGTH_SHORT).show()
                R.id.nav_about_us -> Toast.makeText(applicationContext,"Clicked About Us",Toast.LENGTH_SHORT).show()
                R.id.nav_announcement -> Toast.makeText(applicationContext,"Clicked Announcemet",Toast.LENGTH_SHORT).show()
                R.id.nav_photogallery -> Toast.makeText(applicationContext,"Clicked Developers",Toast.LENGTH_SHORT).show()


            }
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if(toggle.onOptionsItemSelected(item))
        {
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}