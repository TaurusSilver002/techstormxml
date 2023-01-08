package com.example.techstormxml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    lateinit var toggle: ActionBarDrawerToggle
    lateinit var drawerLayout: DrawerLayout
    lateinit var newRecyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawerLayout = findViewById(R.id.drawerLayout)
        println(drawerLayout)
        val navView: NavigationView = findViewById(R.id.Nav_view)


        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {

            it.isChecked = true

            when (it.itemId) {
                R.id.nav_home -> replaceFragment(HomeFragment(), it.title.toString())
                R.id.nav_schedule -> replaceFragment(ScheduleFragment(), it.title.toString())
                R.id.nav_results -> replaceFragment(ResultsFragment(), it.title.toString())
             //   R.id.blank -> replaceFragment(BlankFragment(), it.title.toString())
                R.id.nav_sponcers -> replaceFragment(SponcerFragment(), it.title.toString())
                R.id.nav_dev -> replaceFragment(DevFragment(), it.title.toString())
                R.id.nav_about_us -> replaceFragment(AboutUsFragment(), it.title.toString())
                R.id.nav_announcement -> replaceFragment(
                    AnnouncementFragment(),
                    it.title.toString()
                )
                R.id.nav_photogallery -> replaceFragment(
                    PhotogalleryFragment(),
                    it.title.toString()
                )


            }
            true
        }
//        getUserData()
        replaceFragment(HomeFragment(), "TECHSTORM 2.23")
    }

    private fun replaceFragment(fragment: Fragment, title: String) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout, fragment)

        fragmentTransaction.commit()
        drawerLayout.closeDrawers()
        setTitle(title)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (toggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }

//    private fun getUserData() {
//        newRecyclerView = findViewById(R.id.recyclerview)
//        newRecyclerView.apply {
//            layoutManager = LinearLayoutManager(this@MainActivity, RecyclerView.VERTICAL, false)
//            adapter = CardAdapter(ParentDataFactory.getParents())
//
//        }
//    }
}