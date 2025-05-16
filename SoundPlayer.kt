package com.example.myportfolio

import android.content.Context
import android.media.MediaPlayer

object SoundPlayer {
    fun playPop(context: Context) {
        val popSound = MediaPlayer.create(context, R.raw.popcartoon)
        popSound.setOnCompletionListener {
            it.release()
        }
        popSound.start()
    }
}
