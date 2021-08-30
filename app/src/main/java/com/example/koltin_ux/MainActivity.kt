package com.example.koltin_ux


import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions


class MainActivity : AppCompatActivity() {
    private lateinit var elon:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        elon=findViewById(R.id.elon)


        Glide.with(this).load(R.drawable.elon_musk).apply(RequestOptions.circleCropTransform()).into(elon)

    }
}