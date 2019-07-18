package com.renzam.libyoutube;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class MainActivity extends AppCompatActivity {

    //YouTubePlayerView youTubePlayerView;
    RecyclerView recyclerView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleview);
       recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);

        String[] videoIds = {"kVYB4PJlwZ8", "74yb9E3WY1I", "XM2Q2rpmxmY", "Ginx7WKq5GE", "QRUNUtZUtEo", "GP4okspbfMM", "KlOodL9Gw4", "LiM7QGy0BSI", "KlOodL9Gw4", "TMSIR210mRg", "nUFT6oN01wI", "BqGCJUXEqxQ"};

        RecyclerView.Adapter recyclerViewAdapter = new Adapter(this,videoIds, this.getLifecycle());
        recyclerView.setAdapter(recyclerViewAdapter);


//        youTubePlayerView= findViewById(R.id.youtube_player_view);
//        getLifecycle().addObserver(youTubePlayerView);
//
//
//
//        final String videoId = "P1Mq9s2LzXs";
//        youTubePlayerView.addYouTubePlayerListener(new YouTubePlayerListener() {
//            @Override
//            public void onReady(YouTubePlayer youTubePlayer) {
//
//                youTubePlayer.loadVideo(videoId,0);
//
//            }
//
//            @Override
//            public void onStateChange(YouTubePlayer youTubePlayer, PlayerConstants.PlayerState playerState) {
//
//            }
//
//            @Override
//            public void onPlaybackQualityChange(YouTubePlayer youTubePlayer, PlayerConstants.PlaybackQuality playbackQuality) {
//
//            }
//
//            @Override
//            public void onPlaybackRateChange(YouTubePlayer youTubePlayer, PlayerConstants.PlaybackRate playbackRate) {
//
//            }
//
//            @Override
//            public void onError(YouTubePlayer youTubePlayer, PlayerConstants.PlayerError playerError) {
//
//            }
//
//            @Override
//            public void onCurrentSecond(YouTubePlayer youTubePlayer, float v) {
//
//            }
//
//            @Override
//            public void onVideoDuration(YouTubePlayer youTubePlayer, float v) {
//
//            }
//
//            @Override
//            public void onVideoLoadedFraction(YouTubePlayer youTubePlayer, float v) {
//
//            }
//
//            @Override
//            public void onVideoId(YouTubePlayer youTubePlayer, String s) {
//
//            }
//
//            @Override
//            public void onApiChange(YouTubePlayer youTubePlayer) {
//
//            }
//        });





    }
}
