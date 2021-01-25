package com.adintech.kidsyoutube;

import android.app.PictureInPictureParams;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.util.Rational;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.adintech.kidsyoutube.databinding.ActivityYoutubePlayBinding;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerFullScreenListener;

public class YoutubePlayActivity extends AppCompatActivity {
    private ActivityYoutubePlayBinding mActivityYoutubePlayBinding;
    private String title, description, videoId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivityYoutubePlayBinding = DataBindingUtil.setContentView(this, R.layout.activity_youtube_play);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().hide();

        //Get Intent
        title = getIntent().getStringExtra("videoTitle");
        description = getIntent().getStringExtra("videoDescription");
        videoId = getIntent().getStringExtra("videoId");

        mActivityYoutubePlayBinding.playTitle.setText(title);
        mActivityYoutubePlayBinding.playDescription.setText(description);

        getLifecycle().addObserver(mActivityYoutubePlayBinding.youtubePlayerView);

        mActivityYoutubePlayBinding.youtubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {

            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                if (videoId != null) {
                    youTubePlayer.loadVideo(videoId, 0);
                }
            }
        });

        mActivityYoutubePlayBinding.youtubePlayerView.addFullScreenListener(new YouTubePlayerFullScreenListener() {
            @Override
            public void onYouTubePlayerEnterFullScreen() {
                //getSupportActionBar().hide();
                getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_VISIBLE);
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            }

            @Override
            public void onYouTubePlayerExitFullScreen() {
                //getSupportActionBar().show();
                getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_VISIBLE);
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
            }
        });


    }


    @Override
    public void onUserLeaveHint() {
        PictureInPictureParams pictureInPictureParams = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            pictureInPictureParams = new PictureInPictureParams.Builder().build();
            enterPictureInPictureMode(pictureInPictureParams);
        }
    }

    @Override
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode, Configuration newConfig) {
        if (isInPictureInPictureMode) {
            getSupportActionBar().hide();
        } else {
            getSupportActionBar().show();
        }
        super.onPictureInPictureModeChanged(isInPictureInPictureMode, newConfig);
    }

    /*   @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }*/

  /*  @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }*/
}