package com.aimanissa.android.androidacademyproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity(),
    MoviesListFragment.ListClickListener, MovieDetailsFragment.DetailsClickListener {

    private val listFragment =
        MoviesListFragment().apply { setListListener(this@MainActivity) }
    private val detailsFragment =
        MovieDetailsFragment().apply { setDetailsListener(this@MainActivity) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .apply {
                setReorderingAllowed(true)
                add(R.id.fragments_container, listFragment)
                addToBackStack(null)
                commit()
            }
    }

    override fun openDetailsFragment() {
        supportFragmentManager.beginTransaction()
            .apply {
                setReorderingAllowed(true)
                add(R.id.fragments_container, detailsFragment)
                addToBackStack(null)
                commit()
            }
    }

    override fun backToListFragment() {
        supportFragmentManager.popBackStack()
    }
}