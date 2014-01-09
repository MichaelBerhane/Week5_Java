package pieces;

public class knight extends AbstractPiece {
	
	public knight(boolean isWhite) {
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
			System.out.print("\t\u2658");	
		}
		else
			System.out.print("\t\u265E");
	}

	@Override
	public boolean isMoveValid(int srcRow, int srcCol, int destRow, int destCol) {
		// TODO Auto-generated method stub
		boolean result = false;
		
		if (
				
				((destRow == (srcRow - 2)) && (destCol == (srcCol -1))) || // up left
				((destRow == (srcRow - 2))	&& (destCol == (srcCol + 1))) || //up right
				((destRow == (srcRow - 1)) && (destCol == (srcCol - 2))) || //up low left
				((destRow == (srcRow - 1)) && (destCol == (srcCol + 2))) || // up low right
				((destRow == (srcRow + 2)) && (destCol == (srcCol	- 1)))	|| // down left
				((destRow == (srcRow + 2))	&& (destCol == (srcCol + 1))) || // down right
				((destRow == (srcRow + 1)) && (destCol == (srcCol - 2))) || // down low left
				((destRow == (srcRow + 1)) && (destCol == (srcCol + 2)))
				
				){result  = true;}
				else { result = false;}
		
		
		
		return result;
	}

	@Override
	public int relativeValue() {
		// TODO Auto-generated method stub
		return 3;
	}

	
	
	
	
}
