package com.aimanissa.android.androidacademyproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.aimanissa.android.androidacademyproject.domain.ActorsDataSource
import java.util.zip.Inflater

class MovieDetailsFragment : Fragment() {

    private var backButton: TextView? = null
    private var listener: DetailsClickListener? = null
    private var recyclerView: RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_movie_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.actors_recycler_view)
        recyclerView?.adapter = ActorsAdapter()

        backButton = view.findViewById<TextView>(R.id.back_text_view).apply {
            setOnClickListener{ listener?.backToListFragment() }
        }
    }

    override fun onStart() {
        super.onStart()
        updateData()
    }


    private fun updateData() {
        (recyclerView?.adapter as? ActorsAdapter)?.apply {
            bindActors(ActorsDataSource().getActors())
        }
    }

    fun setDetailsListener(l: DetailsClickListener) {
        listener = l
    }

    interface DetailsClickListener {
        fun backToListFragment()
    }
}
