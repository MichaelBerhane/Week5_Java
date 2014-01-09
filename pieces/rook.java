package pieces;

public class rook extends AbstractPiece {

	public rook(boolean isWhite) {
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
			System.out.print("\t\u2656");
		}
		else{
			System.out.print("\t\u265C");
		}	
	}

	@Override
	public boolean isMoveValid(int srcRow, int srcCol, int destRow, int destCol) {
		// TODO Auto-generated method stub
		boolean result = false;
				if(
						((destRow == (srcRow - (srcRow - destRow))) && (destCol == srcCol))	|| //up
						((destRow == (srcRow + (srcRow - destRow)))	&& (destCol == srcCol)) ||	// down 
						((destCol == (srcCol + (destCol - srcCol))) && (destRow == srcRow)) || //right
						((destCol == (srcCol - (destCol - srcCol))) && (destRow == srcRow))	
				  ){result = true;}
				else{
					result = false;
				}
					
		
		return result;
	}

	@Override
	public int relativeValue() {
		// TODO Auto-generated method stub
		return 5;
	}
	


}
