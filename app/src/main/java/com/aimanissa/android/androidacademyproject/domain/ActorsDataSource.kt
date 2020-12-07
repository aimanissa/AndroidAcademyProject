package com.aimanissa.android.androidacademyproject.domain

import com.aimanissa.android.androidacademyproject.R
import com.aimanissa.android.androidacademyproject.data.models.Actor

class ActorsDataSource {
    fun getActors(): List<Actor> {
        return listOf(
            Actor(R.string.actor_1_name, R.drawable.actor_image_1),
            Actor(R.string.actor_2_name, R.drawable.actor_image_2),
            Actor(R.string.actor_3_name, R.drawable.actor_image_3),
            Actor(R.string.actor_4_name, R.drawable.actor_image_4),
            Actor(R.string.actor_1_name, R.drawable.actor_image_1),
            Actor(R.string.actor_2_name, R.drawable.actor_image_2),
            Actor(R.string.actor_3_name, R.drawable.actor_image_3),
            Actor(R.string.actor_4_name, R.drawable.actor_image_4)
        )
    }
}