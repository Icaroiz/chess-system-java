<<<<<<< HEAD
package chess;


import boardgame.Board;
import boardgame.Piece;

public abstract class ChessPiece extends Piece{

	public ChessPiece(Board board) {
		super(board);
		// TODO Auto-generated constructor stub
	}

	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}


	

	
	
	
	
	
	
	
}
=======
package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece{

	public ChessPiece(Board board) {
		super(board);
		// TODO Auto-generated constructor stub
	}

	private Color color;
	private int moveCount;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	public int getMoveCount() {
		return moveCount;
	}
	
	public void increaseMoveCount() {
		moveCount++;
	}
	
	public void decreaseMoveCount() {
		moveCount--;
	}
	
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position); 
	}

	protected boolean isThereOppponentPiece(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p.getColor() != color;
	}

	
}

















>>>>>>> 1aac1d55e2b3bb7c68d7ce3963136065db15c778
