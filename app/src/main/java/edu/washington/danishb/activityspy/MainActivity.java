package edu.washington.danishb.activityspy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate event fired");
    }

    @Override
    protected void onDestroy(){
        Log.e(TAG, "We're going down, Captain!");
        super.onDestroy();
    }
}
