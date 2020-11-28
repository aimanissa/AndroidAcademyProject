package com.aimanissa.android.androidacademyproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment

class MoviesListFragment : Fragment() {

    private var cardView: CardView? = null
    private var listener: ListClickListener? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_movies_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        cardView = view.findViewById<CardView>(R.id.card_view_item).apply {
            setOnClickListener{ listener?.openDetailsFragment() }
        }
    }

    fun setListListener(l: ListClickListener) {
        listener = l
    }

    interface ListClickListener {
        fun openDetailsFragment()
    }
}