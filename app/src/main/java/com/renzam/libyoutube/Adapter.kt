package com.renzam.libyoutube

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Lifecycle
import androidx.recyclerview.widget.RecyclerView
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.PlayerUiController

class Adapter(private val context: Context, private val videoIds: Array<String>, private val lifecycle: Lifecycle) : RecyclerView.Adapter<Adapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {

        val youTubePlayerView = LayoutInflater.from(parent.context).inflate(R.layout.viedios_list, parent, false) as YouTubePlayerView

        lifecycle.addObserver(youTubePlayerView)
        return ViewHolder(youTubePlayerView)

    }

    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {

        holder.cueVideo(videoIds[position])

    }

    override fun getItemCount(): Int {
        return videoIds.size
    }

    inner class ViewHolder(private val youTubePlayerView: YouTubePlayerView) : RecyclerView.ViewHolder(youTubePlayerView) {
        private var youTubePlayer: YouTubePlayer? = null
        private var currentVideoId: String? = null

        init {

            youTubePlayerView.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
                override fun onReady(initializedYouTubePlayer: YouTubePlayer) {
                    youTubePlayer = initializedYouTubePlayer
                    youTubePlayer!!.cueVideo(currentVideoId!!, 0f)

                    val playerUiController = youTubePlayerView.getPlayerUiController()
                    //                    playerUiController.setFullScreenButton
                    playerUiController.setCustomAction1(context.resources.getDrawable(R.drawable.ic_fullscreen), View.OnClickListener { youTubePlayerView.enterFullScreen() })

                    playerUiController.setCustomAction1(context.resources.getDrawable(R.drawable.ic_fullscreen), View.OnClickListener { youTubePlayerView.toggleFullScreen() })


                }
            })

        }

        fun cueVideo(videoId: String) {
            currentVideoId = videoId

            if (youTubePlayer == null)
                return

            youTubePlayer!!.cueVideo(videoId, 0f)
        }
    }
}
