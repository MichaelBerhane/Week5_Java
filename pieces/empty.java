package pieces;

public class empty extends AbstractPiece {

	public empty(boolean isWhite) {
		super(isWhite);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.print("\t ");
	}

	@Override
	public boolean isMoveValid(int srcRow, int srcCol, int destRow, int destCol) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int relativeValue() {
		// TODO Auto-generated method stub
		return 0;
	}

}
