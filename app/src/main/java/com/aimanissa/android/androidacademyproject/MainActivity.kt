package com.aimanissa.android.androidacademyproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentManager
import com.aimanissa.android.androidacademyproject.data.models.Movie

class MainActivity : AppCompatActivity(), OnMovieItemClick,
    MovieDetailsFragment.DetailsClickListener {

    private val listFragment =
        MoviesListFragment()
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

    override fun openDetailsFragment(holder: View) {
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