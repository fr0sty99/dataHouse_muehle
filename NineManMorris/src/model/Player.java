package model;

import java.util.ArrayList;
import java.util.Observable;

import constants.Players;

public class Player extends Observable {
	private Players isOwner;
	private int piecesToSet = 3;

	public int getPiecesToSet() {
		return piecesToSet;
	}

	public void setPiecesToSet(int piecesToSet) {
		this.piecesToSet = piecesToSet;
		notifyObservers();
	}

	private String name;
	private int score;
	private boolean isOnTurn;
	private ArrayList<Piece> piecesOnBoard = new ArrayList<Piece>(); // ?
	private Players owner;

	public Players isOwner() {
		return owner;
	}

	public void setOwner(Players owner) {
		this.owner = owner;
	}

	public Player(String name) {
		this.name = name;
	}

	// returns true if the move is possible and done, false if there are no more
	// pieces to Set
	public boolean setPiece(int index) {
		if (piecesToSet > 0) {
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
