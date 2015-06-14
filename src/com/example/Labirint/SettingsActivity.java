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
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.settings);

        switchTypeGame = (Switch)findViewById(R.id.switch_type);
        switchTypeExit = (Switch)findViewById(R.id.switch_exit);

        countPlayers = (EditText)findViewById(R.id.edit_players_counter);
        countChests = (EditText)findViewById(R.id.edit_count_chests);
        sizeSquareLabirint = (EditText)findViewById(R.id.edit_size_labirint_square);

        densityWalls = (SeekBar)findViewById(R.id.seekBar_walls);

    }



    public void onClickToGame(View view)
    {
        GameSettings gameSettings = new GameSettings();
        gameSettings.setHeight(Integer.parseInt(sizeSquareLabirint.getText().toString()));
        gameSettings.setWeidht(Integer.parseInt(sizeSquareLabirint.getText().toString()));
        gameSettings.setNumberPlayer(Integer.parseInt(countPlayers.getText().toString()));
        gameSettings.setNumberTreasure(Integer.parseInt(countChests.getText().toString()));
        if (switchTypeGame.isChecked()) {
            gameSettings.setType(GameTypes.Admin);
        }
        else{
            gameSettings.setType(GameTypes.OneByOne);
       }
       // if(switchTypeExit.isChecked()){
//
 //       }

   //     System.err.print(gameSettings.getDebugStateString());
        
        Intent intent = new Intent(SettingsActivity.this, GameActivity.class);
        startActivity(intent);
    }
}
