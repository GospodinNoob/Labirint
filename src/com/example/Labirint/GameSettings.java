package com.example.Labirint;

public class GameSettings {
	
	//height, weidht - длинна, ширина
	//numberplayer, numbertreasure; - колво игроков, кладов
	//type = тип игры
	private Integer height, weidht, numberplayer, numbertreasure;
	private Integer walldensity, numberfloor;
	private boolean isexitinwall;
	private GameTypes type;
	
	public GameSettings() {
		numberfloor = 1;
		height = 4;
		weidht = 5;
		
	}
	
	public String getDebugStateString(){
		String s = "Labirint settings was set:";
		s += "( " + height.toString() + " x " + weidht.toString() + " )\t";
		s += "players - " + numberplayer.toString() + ";";
		s += "treasure - " + numbertreasure.toString() + "\t";
		s += "number of floor - " + numberfloor.toString() + "\r\n";
		s += "del this from final version\r\n";
		s += "it contain in GameSettings.getDebugStateString()\r\n";
		return s;
	}
	
	public Integer getNumberPlayer() {
		return numberplayer;
	}
	public void setNumberPlayer(Integer numberplayer) {
		this.numberplayer = numberplayer;
	}
	public Integer getNumberTreasure() {
		return numbertreasure;
	}
	public void setNumberTreasure(Integer numbertreasure) {
		this.numbertreasure = numbertreasure;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public Integer getWeidht() {
		return weidht;
	}
	public void setWeidht(Integer weidht) {
		this.weidht = weidht;
	}
	public GameTypes getType() {
		return type;
	}
	public void setType(GameTypes type) {
		this.type = type;
	}

	public Integer getWallDensity() {
		return walldensity;
	}

	public void setWallDensity(Integer walldensity) {
		this.walldensity = walldensity;
	}
	
	public Integer getNumberFloor() {
		return numberfloor;
	}

	public void setNumberFloor(Integer numberfloor) {
		this.numberfloor = numberfloor;
	}
	
}
