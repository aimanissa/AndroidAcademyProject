package com.aimanissa.android.androidacademyproject.domain

import com.aimanissa.android.androidacademyproject.R
import com.aimanissa.android.androidacademyproject.data.models.Movie

class MoviesDataSource {
    fun getMovies(): List<Movie> {
        return listOf(
            Movie("Avengers: End Game", R.drawable.preview_avengers,"13+", "Action, Adveture, Fantasy", 4, "125 REVIEWS", "137 MIN" ),
            Movie("Tenet", R.drawable.preview_tenet, "16+", "Action, Sci-Fi, Thriller", 5, "98 REVIEWS", "97 MIN"),
            Movie("Black Widow", R.drawable.preview_black_widow,"13+", "Action, Adventure, Sci-Fi", 4, "38 REVIEWS", "102 MIN"),
            Movie("Wonder Woman 1984", R.drawable.preview_wonder_woman, "13+", "Action, Advature, Fantasy", 5, "74 REVIEWS", "120 MIN"),
            Movie("Avengers: End Game", R.drawable.preview_avengers,"13+", "Action, Adveture, Fantasy", 4, "125 REVIEWS", "137 MIN" ),
            Movie("Tenet", R.drawable.preview_tenet, "16+", "Action, Sci-Fi, Thriller", 5, "98 REVIEWS", "97 MIN"),
            Movie("Black Widow", R.drawable.preview_black_widow,"13+", "Action, Adventure, Sci-Fi", 4, "38 REVIEWS", "102 MIN"),
            Movie("Wonder Woman 1984", R.drawable.preview_wonder_woman, "13+", "Action, Advature, Fantasy", 5, "74 REVIEWS", "120 MIN")
        )
    }
}