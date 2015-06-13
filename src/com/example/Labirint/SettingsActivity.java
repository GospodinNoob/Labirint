package com.example.Labirint;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Switch;

/**
 * Created by home-pc on 12.06.2015.
 */




public class SettingsActivity extends Activity {

    public Switch switchTypeGame;
    public Switch switchTypeExit;

    public EditText countPlayers;
    public EditText countChests;
    public EditText sizeSquareLabirint;

    public SeekBar densityWalls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        switchTypeGame = (Switch)findViewById(R.id.switch_type);
        switchTypeExit = (Switch)findViewById(R.id.switch_exit);

        countPlayers = (EditText)findViewById(R.id.edit_players_counter);
        countChests = (EditText)findViewById(R.id.edit_count_chests);
        sizeSquareLabirint = (EditText)findViewById(R.id.edit_size_labirint_square);

        densityWalls = (SeekBar)findViewById(R.id.seekBar_walls);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.settings);
    }


    public void onClickToGame(View view)
    {

    }
}
