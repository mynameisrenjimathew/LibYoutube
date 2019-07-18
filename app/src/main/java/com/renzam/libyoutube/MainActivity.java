package com.renzam.libyoutube;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.PlayerUiController;


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




    }
}
