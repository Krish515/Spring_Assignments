package com.java.A2players;

import java.util.*;

import com.java.A2players.Country;

public class Player {
	private String playerId;
	private String playerName;
	private Country country;
	private Player player1;
	private Player player2;
	private Player player3;
	private Player player4;
	private Player player5;
	
public Player getPlayer1() {
		return player1;
	}

	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}

	public Player getPlayer3() {
		return player3;
	}

	public void setPlayer3(Player player3) {
		this.player3 = player3;
	}

	public Player getPlayer4() {
		return player4;
	}

	public void setPlayer4(Player player4) {
		this.player4 = player4;
	}

	public Player getPlayer5() {
		return player5;
	}

	public void setPlayer5(Player player5) {
		this.player5 = player5;
	}

public Player() {}

public String getPlayerId() {
	return playerId;
}

public void setPlayerId(String playerId) {
	this.playerId = playerId;
}

public String getPlayerName() {
	return playerName;
}

public void setPlayerName(String playerName) {
	this.playerName = playerName;
}

public Country getCountry() {
	return country;
}

public void setCountry(Country country) {
	this.country = country;
};
public Player(String playerId,String playerName, Country country) {
	this.playerId=playerId;
	this.playerName=playerName;
	this.country=country;
}
public Player(Player player1,Player player2, Player player3,Player player4,Player player5) {
	this.player1=player1;
	this.player2=player2;
	this.player3=player3;
	this.player4=player4;
	this.player5=player5;
}

public void displayInfo() {
	System.out.println("\nPlayerId : "+playerId);
	System.out.println("PlayerName : "+playerName);
	System.out.println(country);
}

public void displayPlayers(String cName) {
	System.out.println(cName);
	if (cName.equals("India")){
	System.out.println();
	System.out.println("Selected country : India");
	System.out.println(player1.playerName);
	System.out.println(player2.playerName);
	System.out.println(player3.playerName);
	}
	else if(cName.equals("Australia")){
	System.out.println();
	System.out.println("Selected country : Australia");
	System.out.println(player4.playerName);
	System.out.println(player5.playerName);
	}
	
}

}
