package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class DataSource {

    fun loadAffirmations(): List<Affirmation>{

        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.ic_launcher_background),
            Affirmation(R.string.affirmation2, R.drawable.image2ic_launcher_foreground),
            Affirmation(R.string.affirmation3, R.drawable.image2ic_launcher_background),
            Affirmation(R.string.affirmation4, R.drawable.image2ic_launcher_foreground),
            Affirmation(R.string.affirmation5, R.drawable.image5ic_launcher_background),
            Affirmation(R.string.affirmation6, R.drawable.image6ic_launcher_foreground),
            Affirmation(R.string.affirmation7, R.drawable.ic_launcher_background)
        )
    }
}