package com.viveksoneja.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get the reference of buttons and initialise the listeners
        findViewById(R.id.btn_build_it_bigger).setOnClickListener(new AppButtonClickListener(this.getApplicationContext(), getString(R.string.build_it_bigger)));
        findViewById(R.id.btn_capstone_my_own_app).setOnClickListener(new AppButtonClickListener(this.getApplicationContext(), getString(R.string.capstone_my_own_app)));
        findViewById(R.id.btn_library_app).setOnClickListener(new AppButtonClickListener(this.getApplicationContext(), getString(R.string.library_app)));
        findViewById(R.id.btn_scores_app).setOnClickListener(new AppButtonClickListener(this.getApplicationContext(), getString(R.string.scores_app)));
        findViewById(R.id.btn_spotify_streamer).setOnClickListener(new AppButtonClickListener(this.getApplicationContext(), getString(R.string.spotify_streamer)));
        findViewById(R.id.btn_xyz_reader).setOnClickListener(new AppButtonClickListener(this.getApplicationContext(), getString(R.string.xyz_reader)));
    }

    private static class AppButtonClickListener implements View.OnClickListener {
        private Context context;
        private String appName;

        public AppButtonClickListener(Context context, String appName) {
            this.context = context;
            this.appName = appName;
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(context, "This button will launch " + getAppName() + "!", Toast.LENGTH_LONG).show();
        }

        public String getAppName() {
            return appName.toLowerCase();
        }
    }
}
