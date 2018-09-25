package model;

import constants.Owner;

public class BoardModel {
	private Piece[] pieces = new Piece[24];
	private Player[] players = new Player[2];
	
	public BoardModel() {
		
	}
	
	public void setPlayer(Owner owner, String name) {
		if (owner == Owner.PLAYER1) {
			players[0] = new Player(name);
		} else {
			players[1] = new Player(name);
		}
	}
	
	public Player getPlayer(Owner owner) {
		if (owner == Owner.PLAYER1) {
			return players[0];
		} else {
			return players[1];
		}
	}
	
	public void setPieceOnBoard(Piece piece) {
		pieces[piece.index] = piece;
	}
	
	public Piece getPieceOnBoardByIndex(int index) {
		return pieces[index];
	}

	public Piece[] getPieces() {
		return pieces;
	}

}