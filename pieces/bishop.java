package pieces;

public class bishop extends AbstractPiece {

	public bishop(boolean isWhite) {
		super(isWhite);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isWhite() {
		// TODO Auto-generated method stub
		return super.isWhite();
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		if(this.isWhite){
			System.out.print("\t\u2657");
		}
		else{
			System.out.print("\t\u265D");
		}
	}

	@Override
	public boolean isMoveValid(int srcRow, int srcCol, int destRow, int destCol) {
		// TODO Auto-generated method stub
		
		boolean result = false;
		if(
				((destCol == (srcCol - (srcCol - destCol))) &&  (destRow == (srcRow + (srcCol - destCol)))) || // down left diagonal
				((destCol == (srcCol + (destCol - srcCol))) &&  (destRow == (srcRow + (destCol - srcCol)))) || // down right diagonal
				((destCol == (srcCol - (srcCol - destCol))) && (destRow == (srcRow - (srcCol - destCol)))) || // up left diagonal																			)	|| // up left diagonal
				((destCol == (srcCol + (destCol - srcCol))) && (destRow == (srcRow - (destCol - srcCol))))	// up right diagonal	
		   ){result = true;}
		else{result = false;}
			
		return result;
	}

	@Override
	public int relativeValue() {
		// TODO Auto-generated method stub
		return 3;
	}

	
	
	
}
