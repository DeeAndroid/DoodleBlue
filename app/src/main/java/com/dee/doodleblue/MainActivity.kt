package com.dee.doodleblue

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.dee.doodleblue.Fragments.PricelistFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val activity = this@MainActivity as AppCompatActivity


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottom_navigation.itemIconTintList = null

        val dashboardFragment = PricelistFragment()

        setCurrentFragment(dashboardFragment)

        bottom_navigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {

                R.id.dashboard -> setCurrentFragment(dashboardFragment)
                R.id.Favorites -> Toast.makeText(
                    applicationContext,
                    "No View Attached",
                    Toast.LENGTH_SHORT
                ).show()
                R.id.Portfolio -> Toast.makeText(
                    applicationContext,
                    "No View Attached",
                    Toast.LENGTH_SHORT
                ).show()
                R.id.News -> Toast.makeText(
                    applicationContext,
                    "No View Attached",
                    Toast.LENGTH_SHORT
                ).show()
                R.id.Invest -> Toast.makeText(
                    applicationContext,
                    "No View Attached",
                    Toast.LENGTH_SHORT
                ).show()

            }
            true
        }


    }

    private fun setCurrentFragment(fragment: Fragment) =
        activity.supportFragmentManager.beginTransaction().apply {
            replace(R.id.viewview, fragment)
            commit()
        }
}