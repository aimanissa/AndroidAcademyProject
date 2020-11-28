package com.aimanissa.android.androidacademyproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import java.util.zip.Inflater

class MovieDetailsFragment : Fragment() {

    private var backButton: TextView? = null
    private var listener: DetailsClickListener? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_movie_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        backButton = view.findViewById<TextView>(R.id.back_text_view).apply {
            setOnClickListener{ listener?.backToListFragment() }
        }
    }

    fun setDetailsListener(l: DetailsClickListener) {
        listener = l
    }

    interface DetailsClickListener {
        fun backToListFragment()
    }
}
