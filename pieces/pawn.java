package pieces;

public class pawn extends AbstractPiece {
	
	public pawn(boolean isWhite) {
		 super(isWhite);
		
		// TODO Auto-generated constructor stub
	}
	
	public boolean isWhite(){
		return super.isWhite;
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		if(isWhite)
			System.out.print("\t\u2659");
		else
			System.out.print("\t\u265F");
	}
	
	@Override
	public int relativeValue() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public boolean isMoveValid(int srcRow, int srcCol, int destRow, int destCol) {
		// TODO Auto-generated method stub
		boolean result = false;
		//For Black Pawn
		if(isWhite == false){       
			if(((destRow == (srcRow + 1)) && (destCol == srcCol))){
				result = true;
			}
			else{
				
				return result;
				}
			}

		else if(isWhite){
			if ((destRow == (srcRow - 1)) && (destCol == srcCol)){
				result = true;
			}
			else{
			
				return result;
			}
		}
		
		return result;
	}

	
	
	
	
}
