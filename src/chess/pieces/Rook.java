package chess.pieces;

import boardgame.Board;
<<<<<<< HEAD
=======
import boardgame.Position;
>>>>>>> 1aac1d55e2b3bb7c68d7ce3963136065db15c778
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece{

	public Rook(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "R";
		
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean [][] mat = new boolean[getBoard().getRows()][getBoard().getColums()];
<<<<<<< HEAD
		return mat;
	}
	
	
}
=======
		
		Position p = new Position (0,0);
		
		//above
		p.setValue(position.getRow()-1, position.getColumn());
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow() -1);
		}
		if(getBoard().positionExists(p) && isThereOppponentPiece(p)){
			mat[p.getRow()][p.getColumn()] = true;
		}
		

		//left
		p.setValue(position.getRow(), position.getColumn()-1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setColumn(p.getColumn()-1);
		}
		if(getBoard().positionExists(p) && isThereOppponentPiece(p)){
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		
		//right
		p.setValue(position.getRow(), position.getColumn() +1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setColumn(p.getColumn() +1);
		}
		if(getBoard().positionExists(p) && isThereOppponentPiece(p)){
			mat[p.getRow()][p.getColumn()] = true;
		}	
		
		
		//below
		p.setValue(position.getRow()+1, position.getColumn());
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow() +1);
		}
		if(getBoard().positionExists(p) && isThereOppponentPiece(p)){
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		return mat;
	}
}





>>>>>>> 1aac1d55e2b3bb7c68d7ce3963136065db15c778
