package com.example.capstonedesign.board

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.capstonedesign.R

class BoardEditActivity : AppCompatActivity() {

    private lateinit var key:String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_board_edit)

        key = intent.getStringExtra("key").toString()
    }
}