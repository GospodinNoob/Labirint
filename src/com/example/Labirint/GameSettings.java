package com.example.Labirint;

public class GameSettings {
	
	//height, weidht - ������, ������
	//numberplayer, numbertreasure; - ����� �������, ������
	//type = ��� �����
	private Integer height, weidht, numberplayer, numbertreasure;
	private GameTypes type;
	
	public GameSettings() {
		
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
	
	
	
}
