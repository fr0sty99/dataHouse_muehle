package model;

import java.util.ArrayList;

import constants.Owner;

public class Player {
	private int piecesToSet = 9;
	private String name;
	private int score;
	private boolean isOnTurn;
	private ArrayList<Piece> piecesOnBoard = new ArrayList<Piece>();
	private Owner owner;
	
	public Player(String name) {
		this.name = name;
	}
	
	// returns true if the move is possible and done, false if there are no more pieces to Set
	public boolean setPiece(int index) {
		if(piecesToSet > 0) { 
			piecesOnBoard.add(new Piece(index, owner));
			piecesToSet--;
			return true;
		} else {
			return false;
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public boolean isOnTurn() {
		return isOnTurn;
	}

	public void setOnTurn(boolean isOnTurn) {
		this.isOnTurn = isOnTurn;
	}
	
	
}