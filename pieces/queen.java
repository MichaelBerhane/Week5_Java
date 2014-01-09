package pieces;

public class queen extends AbstractPiece {

	public queen(boolean isWhite) {
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
			System.out.print("\t\u2655");
		}
		else
			System.out.print("\t\u265B");
	}

	@Override
	public boolean isMoveValid(int srcRow, int srcCol, int destRow, int destCol) {	
		boolean result = false;
		
		if(
				((destRow == (srcRow - (srcRow - destRow))) && (destCol == srcCol)) ||  //up
				((destRow == (srcRow + (srcRow - destRow)))	&& (destCol == srcCol)) ||	// down 
				((destCol == (srcCol + (destRow - srcCol))) && (destRow == srcRow)) || //right
				((destCol == (srcCol - (destRow - srcCol))) && (destRow == srcRow)) || //left
				((destCol == (srcCol - (srcCol - destCol))) &&  (destRow == (srcRow + (srcCol - destCol)))) || // down left diagonal
				((destCol == (srcCol + (destCol - srcCol))) &&  (destRow == (srcRow + (destRow - srcCol)))) || // down right diagonal
				((destCol == (srcCol- (srcCol - destRow))) && (destRow == (srcRow - (srcCol - destRow)))) || // up left diagonal																			)	|| // up left diagonal
				((destCol == (srcCol + (destRow - srcCol))) && (destRow == (srcRow - (destRow - srcCol))))	// up right diagonal			
				
				){result = true;;}
		else{
			result = false;
		}
			
		// TODO Auto-generated method stub
		return result;
	}

	
	
	
	
	@Override
	public int relativeValue() {
		// TODO Auto-generated method stub
		return 9;
	}
	
	
	

}
