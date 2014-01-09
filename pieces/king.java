package pieces;

public class king extends AbstractPiece {

	public king(boolean isWhite){
		super(isWhite);
	}
	
	@Override
	public boolean isWhite() {
		// TODO Auto-generated method stub
		return super.isWhite();
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		if(isWhite()){
			System.out.print("\t\u2654");
		}
		else{
			System.out.print("\t\u265A");
		}	
	}

	@Override
	public boolean isMoveValid(int srcRow, int srcCol, int destRow, int destCol) {
		// TODO Auto-generated method stub
		boolean result = false;
			if (
					((destRow == (srcRow + 1)) && (destCol == srcCol)) || // up
					((destRow == (srcRow - 1))	&& (destCol == srcCol)) ||		// down
					((destCol == (srcCol + 1)) && (destRow == srcRow)) || // right
					((destCol == (srcCol - 1)) && (destRow == srcRow)) || // left
					((destRow == (srcRow -1)) && (destCol == (srcCol - 1))) ||  // down left diagonal 
					((destRow == (srcRow - 1)) && (destCol == (srcCol + 1))) || // down right diagonal
					((destRow == (srcRow + 1)) && (destCol == (srcCol + 1))) || // up right diagonal
					((destRow == (srcRow + 1)) && (destCol == (srcCol - 1))) // up left diagonal
				)	{result = true;}
			else{
				 
				result = false;
			}
			
			return result;
			
		}
			
		
	

	@Override
	public int relativeValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
}
