package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Bishop extends ChessPiece{

	public Bishop(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "B";
		
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean [][] mat = new boolean[getBoard().getRows()][getBoard().getColums()];
		
		Position p = new Position (0,0);
		
		//nw
		p.setValue(position.getRow() -1, position.getColumn() -1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setValue(p.getRow()-1, p.getColumn() -1);
		}
		if(getBoard().positionExists(p) && isThereOppponentPiece(p)){
			mat[p.getRow()][p.getColumn()] = true;
		}

		//ne
		p.setValue(position.getRow() -1, position.getColumn() +1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setValue(p.getRow()-1, p.getColumn()+1);
		}
		if(getBoard().positionExists(p) && isThereOppponentPiece(p)){
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//se
		p.setValue(position.getRow()+1, position.getColumn() +1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setValue(p.getRow()+1, p.getColumn()+1);
		}
		if(getBoard().positionExists(p) && isThereOppponentPiece(p)){
			mat[p.getRow()][p.getColumn()] = true;
		}	
		
		
		//sw
		p.setValue(position.getRow()+1, position.getColumn()-1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setValue(p.getRow()+1, p.getColumn()-1);
		}
		if(getBoard().positionExists(p) && isThereOppponentPiece(p)){
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		return mat;
	}
}





















































