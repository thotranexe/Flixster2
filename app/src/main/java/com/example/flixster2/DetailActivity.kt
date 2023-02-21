package com.example.flixster2

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

private const val TAG = "DetailActivity"

class DetailActivity : AppCompatActivity() {
    private lateinit var mediaImageView: ImageView
    private lateinit var titleTextView: TextView
    private lateinit var abstractTextView: TextView
    private lateinit var bylineTextView: TextView
    private lateinit var ratingTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.movie_detail)

        // TODO: Find the views for the screen
        mediaImageView = findViewById(R.id.mediaImage)
        titleTextView = findViewById(R.id.mediaTitle)
        abstractTextView = findViewById(R.id.mediaAbstract)
        bylineTextView= findViewById(R.id.mediaByline)
        ratingTextView=findViewById(R.id.mediaRating)
        // TODO: Get the extra from the Intent
        val movie = intent.getSerializableExtra(ARTICLE_EXTRA) as Movie
        // TODO: Set the title, byline, and abstract information from the article
        titleTextView.text = movie.title
        abstractTextView.text = movie.overview
        bylineTextView.text ="Released: "+movie.date
        ratingTextView.text=movie.review +"/10"

        // TODO: Load the media image
        Glide.with(this)
            .load(movie.img)
            .into(mediaImageView)
    }
}