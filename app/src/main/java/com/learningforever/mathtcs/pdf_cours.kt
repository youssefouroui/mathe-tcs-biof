package com.learningforever.mathtcs

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference
import kotlinx.android.synthetic.main.activity_my_cours.*


@Suppress("DEPRECATION")
class pdf_cours : AppCompatActivity() {

var my_storage:StorageReference?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        my_storage=FirebaseStorage.getInstance().reference
        val pdf:Int=0;
        list_course.setOnItemClickListener { _, _, i, _ ->
            var intent=Intent(  Intent.ACTION_PICK)
            intent.type="pdf/*"
            startActivityForResult(intent,2)
        }













        }



}
