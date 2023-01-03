package com.example.techstormxml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.quicksettings.Tile
import android.view.MenuItem
import android.widget.FrameLayout
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationView
import java.nio.channels.AsynchronousFileChannel.open

class MainActivity : AppCompatActivity() {
    lateinit var toggle :ActionBarDrawerToggle
    lateinit var drawerLayout: DrawerLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawerLayout  = findViewById(R.id.drawerLayout)
        val navView :NavigationView=findViewById(R.id.Nav_view)

        toggle = ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {

            it.isChecked=true

            when(it.itemId){
                R.id.nav_home -> replaceFragment(HomeFragment(), it.title.toString())
                R.id.nav_schedule -> replaceFragment(ScheduleFragment(), it.title.toString())
                R.id.nav_results -> replaceFragment(ResultsFragment(), it.title.toString())
                R.id.nav_sponcers -> replaceFragment(SponcerFragment(), it.title.toString())
                R.id.nav_team -> replaceFragment(TeamFragment(), it.title.toString())
                R.id.nav_dev -> replaceFragment(DevFragment(), it.title.toString())
                R.id.nav_about_us -> replaceFragment(AboutUsFragment(), it.title.toString())
                R.id.nav_announcement -> replaceFragment(AnnouncementFragment(), it.title.toString())
                R.id.nav_photogallery -> replaceFragment(PhotogalleryFragment(), it.title.toString())


            }
            true
        }
    }
private fun replaceFragment(fragment: Fragment,title:String ){
    val  fragmentManager=supportFragmentManager
    val fragmentTransaction =fragmentManager.beginTransaction()
    fragmentTransaction.replace(R.id.frameLayout,fragment)

    fragmentTransaction.commit()
    drawerLayout.closeDrawers()
    setTitle(title)
}
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if(toggle.onOptionsItemSelected(item))
        {
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}