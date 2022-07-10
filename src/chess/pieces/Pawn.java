package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.Color;

public class Pawn extends ChessPiece {
	
	private ChessMatch chessMatch;

	public Pawn(Board board, Color color, ChessMatch chessMatch) {
		super(board, color);
		this.chessMatch = chessMatch;
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean [][] mat = new boolean[getBoard().getRows()][getBoard().getColums()];
		
		Position p = new Position (0,0);
		//WHITE
		if(getColor() == Color.WHITE) {
			p.setValue(position.getRow() -1, position.getColumn());
			if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;		
		}
			p.setValue(position.getRow() -2, position.getColumn());
			Position p2 = new Position(position.getRow() -1, position.getColumn());
			if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) && getBoard().positionExists(p2) && !getBoard().thereIsAPiece(p2) && getMoveCount() == 0) {
				mat[p.getRow()][p.getColumn()] = true;	
		}
			p.setValue(position.getRow() -1, position.getColumn() -1);
			if(getBoard().positionExists(p) && isThereOppponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;		
		}
			p.setValue(position.getRow() -1, position.getColumn() +1);
			if(getBoard().positionExists(p) && isThereOppponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;		
		}
		//especialmove en passant white
			if(position.getRow() == 3) {
				Position left = new Position(position.getRow(), position.getColumn() -1);
				if(getBoard().positionExists(left) && isThereOppponentPiece(left) && getBoard().piece(left) == chessMatch.getEnPassantVunerable()) {
				mat[left.getRow() -1][left.getColumn()] = true;
			}
				Position right = new Position(position.getRow(), position.getColumn() +1);
				if(getBoard().positionExists(right) && isThereOppponentPiece(right) && getBoard().piece(right) == chessMatch.getEnPassantVunerable()) {
				mat[right.getRow() -1][right.getColumn()] = true;
		}
	}
}
		//BLACK
		else {
			p.setValue(position.getRow() +1, position.getColumn());
			if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;		
		}
			p.setValue(position.getRow() +2, position.getColumn());
			Position p2 = new Position(position.getRow() +1, position.getColumn());
			if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) && getBoard().positionExists(p2) && !getBoard().thereIsAPiece(p2) && getMoveCount() == 0) {
				mat[p.getRow()][p.getColumn()] = true;	
		}
			p.setValue(position.getRow() +1, position.getColumn() -1);
			if(getBoard().positionExists(p) && isThereOppponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;		
		}
			p.setValue(position.getRow() +1, position.getColumn() +1);
			if(getBoard().positionExists(p) && isThereOppponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;		
		}
			
			//especialmove en passant black
			if(position.getRow() == 4) {
				Position left = new Position(position.getRow(), position.getColumn() -1);
				if(getBoard().positionExists(left) && isThereOppponentPiece(left) && getBoard().piece(left) == chessMatch.getEnPassantVunerable()) {
				mat[left.getRow() + 1][left.getColumn()] = true;
			}
				Position right = new Position(position.getRow(), position.getColumn() +1);
				if(getBoard().positionExists(right) && isThereOppponentPiece(right) && getBoard().piece(right) == chessMatch.getEnPassantVunerable()) {
				mat[right.getRow() + 1][right.getColumn()] = true;
		}
	}
}
		
	return mat;
	
	}
	@Override
	public String toString() {
		return "P";
	}
	
}
