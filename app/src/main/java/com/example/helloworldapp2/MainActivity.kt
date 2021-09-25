package com.example.helloworldapp2

import android.media.AudioAttributes
import android.media.MediaPlayer
import android.media.session.MediaController
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import android.os.Environment

import android.widget.VideoView





class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
/*
        val mediaController =MediaController(this)
        val videoView=findViewById<View>(R.id.videoview)
        mediaController.setAnchorView(videoView)
        val onlineuri= Uri.parse("https://www.youtube.com/watch?v=Jd3nTm-wvyA&t=118s")
        val offlineuri=Uri.parse("android.resource://$packageName/${R.raw.codemovie}")

*/      //android.resource://" + packageName + "/" + R.raw.codemovie)
        val videoView = findViewById<View>(R.id.videoview) as VideoView
        val onlineuri= Uri.parse("https://youtu.be/C1nVzOzEE-c")
        val offlineuri=Uri.parse("android.resource://" + packageName + "/" + R.raw.codes)
        videoView.setVideoURI(offlineuri)

        // create an object of media controller
        val mediaController =  MediaController(this)
        mediaController.setAnchorView(videoView)
        // set media controller object for a video view
        videoView.setMediaController(mediaController)
        videoView.start()
    }
}