package com.learningforever.mathtcs

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_my_cours.*

class my_cours : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_cours)
        val my_array = arrayOf(
            "Arithmétique dans IN ",
            "Les ensembles de nombres N, Z, Q, D et R ",
            "L'ordre dans IR ",
            "Les polynômes",
            "Équations, inéquations et systèmes",
            "Calcul vectoriel dans le plan",
            "La projection dans le plan",
            "La droite dans le plan ",
            "Trigonométrie 1 (Règles du calcul trigonométrique) ",
            "Transformations du plan ",
            "Le produit scalaire ",
            "Généralités sur les fonctions ",
            "Trigonométrie 2 (Équations et inéquations trigonométriques) ",
            "Géométrie dans l'espace ",
            "Statistiques "
        )
        var my_adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, my_array)
        list_course.adapter = my_adapter
        list_course.setOnItemClickListener { _, _, i, _ ->
            var intent = Intent(this, pdf_cours::class.java)
            intent.putExtra("course",my_array[i])


            startActivity(intent)

        }
    }
}