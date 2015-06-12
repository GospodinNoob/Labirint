package com.example.Labirint;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void onClickToSettings1(View view) {
        Intent intent = new Intent(MyActivity.this, SettingsActivity.class);
        startActivity(intent);
    }

    public void onClickToAboutProgram(View view) {
        Intent intent = new Intent(MyActivity.this, AboutActivity.class);
        startActivity(intent);
    }

    public void onClickExit(View view) {
      finish();
    }
}
