package com.aimanissa.android.androidacademyproject

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aimanissa.android.androidacademyproject.data.models.Movie

class MoviesAdapter(
    private var movies: List<Movie>,
    context: Context
) : RecyclerView.Adapter<MoviesViewHolder>() {

    private val clickListener: OnMovieItemClick = context as OnMovieItemClick

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.view_holder_movie, parent, false)
        view.setOnClickListener { clickListener.openDetailsFragment(it) }
        return MoviesViewHolder(view)
    }

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        holder.onBind(movies[position])
    }

    override fun getItemCount(): Int = movies.size

    fun bindMovies(newMovies: List<Movie>) {
        movies = newMovies
        notifyDataSetChanged()
    }
}

class MoviesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val title: TextView = itemView.findViewById(R.id.card_movie_title)
    private val preview: ImageView = itemView.findViewById(R.id.card_preview_image)
    private val ageLimit: TextView = itemView.findViewById(R.id.card_age_limit_text_view)
    private val genre: TextView = itemView.findViewById(R.id.card_genre_text_view)
    private val rating: RatingBar = itemView.findViewById(R.id.card_rating_bar)
    private val reviews: TextView = itemView.findViewById(R.id.card_reviews)
    private val duration: TextView = itemView.findViewById(R.id.card_duration_time)

    fun onBind(movie: Movie) {
        title.text = movie.title
        preview.setImageResource(movie.preview)
        ageLimit.text = movie.ageLimit
        genre.text = movie.genre
        rating.rating = movie.rating.toFloat()
        reviews.text = movie.reviews
        duration.text = movie.duration
    }
}

interface OnMovieItemClick {
    fun openDetailsFragment(holder: View)
}