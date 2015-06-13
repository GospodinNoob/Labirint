package com.example.Labirint;

import android.app.Activity;

public class Game extends Activity{
	
	GameSettings gs;
	private Activity[] floorlist;
	
	public Game(GameSettings gs) {
		this.gs = gs;
		floorlist = new Activity[gs.getNumberFloor()];
	}
	
}
