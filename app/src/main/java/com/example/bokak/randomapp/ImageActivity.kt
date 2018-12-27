package com.example.bokak.randomapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_image.*

class ImageActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)

        Picasso.get().load("https://www.sideshowtoy.com/wp-content/uploads/2016/11/marvel-iron-man-avengers-assemble-statue-sideshow-feature-200354-2.jpg").into(image1)
        Picasso.get().load("https://img00.deviantart.net/f0a3/i/2012/244/8/c/thor_avengers_wallpaper_by_osx_mkx-d549uf9.jpg").into(image2)
        Picasso.get().load("https://www.hindustantimes.com/rf/image_size_960x540/HT/p2/2018/06/15/Pictures/_1caf1900-7098-11e8-bbf6-b72314b60444.jpg").into(image3)
        Picasso.get().load("https://static1.squarespace.com/static/51b3dc8ee4b051b96ceb10de/t/5988e1246b8f5bd70da98974/1502142762355/?format=2500w").into(image4)
        Picasso.get().load("https://uproxx.files.wordpress.com/2018/04/infinity-war-23.jpg?quality=95&w=650").into(image5)

    }
}
