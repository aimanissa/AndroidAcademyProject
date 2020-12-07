package com.aimanissa.android.androidacademyproject

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.GridLayout
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.aimanissa.android.androidacademyproject.data.models.Movie
import com.aimanissa.android.androidacademyproject.domain.ActorsDataSource
import com.aimanissa.android.androidacademyproject.domain.MoviesDataSource

class MoviesListFragment : Fragment() {

    private var recyclerView: RecyclerView? = null
    private val movies = listOf<Movie>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_movies_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.movies_recycler_view)
        recyclerView?.layoutManager = GridLayoutManager(context, 2)
        recyclerView?.adapter = MoviesAdapter(movies, requireContext())

    }

    override fun onStart() {
        super.onStart()
        updateData()
    }

    private fun updateData() {
        (recyclerView?.adapter as? MoviesAdapter)?.apply {
            bindMovies(MoviesDataSource().getMovies())
        }
    }
}