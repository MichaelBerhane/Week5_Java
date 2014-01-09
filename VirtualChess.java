package Chess;
import pieces.*;

import java.util.Scanner;

public class VirtualChess {

	final int CHESSBOARD_WIDTH = 8;
	final int CHESSBOARD_HEIGHT = 8;
	

	//The Chess Piece
	//As sub class / objects
		
	pawn WHITE_PAWN = new pawn(true);
	pawn BLACK_PAWN = new pawn(false);
	king WHITE_KING = new king(true);
	king BLACK_KING = new king(false);
	rook WHITE_ROOK = new rook(true);
	rook BLACK_ROOK = new rook(false);
	bishop WHITE_BISHOP = new bishop(true);
	bishop BLACK_BISHOP = new bishop(false);
	knight WHITE_KNIGHT = new knight(true);
	knight BLACK_KNIGHT = new knight(false);
	queen WHITE_QUEEN = new queen(true);
	queen BLACK_QUEEN = new queen(false);
	empty EMPTY = new empty(false);
	

	//Create Chess board
	public AbstractPiece[][] board(){
		AbstractPiece [][] chessboard = new AbstractPiece[CHESSBOARD_WIDTH][CHESSBOARD_HEIGHT];
		for(int rows = 0; rows < chessboard.length; rows++){
			for(int column = 0; column < chessboard[0].length; column++){
					if(rows >= 2 && rows <= 5){
						chessboard[rows][column] = EMPTY;
					}
					if(rows == 1)
						chessboard[rows][column] = BLACK_PAWN;
					if(rows == 6)
						chessboard[rows][column] = WHITE_PAWN;
					if(rows == 0){
						chessboard[rows][0] = BLACK_ROOK;
						chessboard[rows][1] = BLACK_KNIGHT;
						chessboard[rows][2] = BLACK_BISHOP;
						chessboard[rows][3] = BLACK_QUEEN;
						chessboard[rows][4] = BLACK_KING;
						chessboard[rows][5] = BLACK_BISHOP;
						chessboard[rows][6] = BLACK_KNIGHT;
						chessboard[rows][7] = BLACK_ROOK;
					}
					if(rows == 7){
						chessboard[rows][0] = WHITE_ROOK;
						chessboard[rows][1] = WHITE_KNIGHT;
						chessboard[rows][2] = WHITE_BISHOP;
						chessboard[rows][3] = WHITE_QUEEN;
						chessboard[rows][4] = WHITE_KING;
						chessboard[rows][5] = WHITE_BISHOP;
						chessboard[rows][6] = WHITE_KNIGHT;
						chessboard[rows][7] = WHITE_ROOK;										
					}						
			}		
		}
		return chessboard;
	}
	
	//The Users Starting Position
	public int [] starting_position(String move){

		 String [] components = move.split(" ");
		 
		 int [] starting_position = new int[2];
		
		 //Discover users starting position 
														 
		 if(components[0].charAt(0) == 'a')
			 starting_position[1] = 0;
		 if(components[0].charAt(0) == 'b')
			 starting_position[1] = 1;
		 if(components[0].charAt(0) == 'c')
			 starting_position[1] = 2;
		 if(components[0].charAt(0) == 'd')
			 starting_position[1] = 3;
		 if(components[0].charAt(0) == 'e')
			 starting_position[1] = 4;
		 if(components[0].charAt(0) == 'f')
			 starting_position[1] = 5;
		 if(components[0].charAt(0) == 'g')
			 starting_position[1] = 6;
		 if(components[0].charAt(0) == 'h')
			 starting_position[1] = 7;
		 
		 // vertical position
		 
		 if(components[0].charAt(1) == '8')
			 starting_position[0] = 0;
		 if(components[0].charAt(1) == '7')
			 starting_position[0] = 1;
		 if(components[0].charAt(1) == '6')
			 starting_position[0] = 2;
		 if(components[0].charAt(1) == '5')
			 starting_position[0] = 3;
		 if(components[0].charAt(1) == '4')
			 starting_position[0] = 4;
		 if(components[0].charAt(1) == '3')
			 starting_position[0] = 5;
		 if(components[0].charAt(1) == '2')
			 starting_position[0] = 6;
		 if(components[0].charAt(1) == '1')
			 starting_position[0] = 7; 
	 	 
		 
		 return starting_position;
		 
	}

	
	//The Users Ending Position
	public int [] end_position(String move){
		 
		 String [] components = move.split(" ");
		 int [] end_position = new int[2];
		
		 //Discover users new position
	 	 
		 if(components[2].charAt(0) == 'a')
			 end_position[1] = 0;
		 if(components[2].charAt(0) == 'b')
			 end_position[1] = 1;
		 if(components[2].charAt(0) == 'c')
			 end_position[1] = 2;
		 if(components[2].charAt(0) == 'd')
			 end_position[1] = 3;
		 if(components[2].charAt(0) == 'e')
			 end_position[1] = 4;
		 if(components[2].charAt(0) == 'f')
			 end_position[1] = 5;
		 if(components[2].charAt(0) == 'g')
			 end_position[1] = 6;
		 if(components[2].charAt(0) == 'h')
			 end_position[1] = 7;
		 
		 // vertical position
		 
		 if(components[2].charAt(1) == '8')
			 end_position[0] = 0;
		 if(components[2].charAt(1) == '7')
			 end_position[0] = 1;
		 if(components[2].charAt(1) == '6')
			 end_position[0] = 2;
		 if(components[2].charAt(1) == '5')
			 end_position[0] = 3;
		 if(components[2].charAt(1) == '4')
			 end_position[0] = 4;
		 if(components[2].charAt(1) == '3')
			 end_position[0] = 5;
		 if(components[2].charAt(1) == '2')
			 end_position[0] = 6;
		 if(components[2].charAt(1) == '1')
			 end_position[0] = 7; 
		  
		 return end_position;
		 
	}
	
	// Check if the piece can make that move
	public boolean correct(AbstractPiece [][] chessboard, int [] start, int [] end){	
		//Check if the piece we are starting at, can go to that end position requested.	
		boolean valid =	chessboard[start[0]][start[1]].isMoveValid(start[0], start[1], end[0], end[1]);
		return valid;
	
	}

	
	 // Move the piece
	 public AbstractPiece[][] move(AbstractPiece [][] chessboard, int[] start, int [] end){	

		 if(correct(chessboard, start, end)) //Check if its a valid move
		 {	 

						 for(int i = 0; i < chessboard.length; i++){					//Move piece to new position.
							 for(int j = 0; j < chessboard[0].length; j++){
								 if((i == start[0]) && (j == start[1])){
									 chessboard[end[0]][end[1]] = chessboard[start[0]][start[1]];
									 chessboard[i][j] = EMPTY;
								 } 
							 }
						 }
		 } 
	
		 return chessboard;
		 
	}
	 
	 
	 //The current position of the pieces
	 public void current_board(AbstractPiece [][] chessboard){	 
		 print(chessboard);
	 }
	 
	//Print out the Chess board 
	public void print(AbstractPiece [][] chessboard){
		int x = 8;
		System.out.println("  \tA\tB\tC\tD\tE\tF\tG\tH");
			for(int row = 0; row < chessboard.length; row++){
				System.out.print(x);
				x--;
					for(int column = 0; column < chessboard[0].length; column++){	
						if(chessboard[row][column] == EMPTY)
								{if((row + column) % 2== 0)System.out.print("\t#");
								else chessboard[row][column].draw();
								}
						else
						chessboard[row][column].draw();
					}
				System.out.println();
			}
	}
	
	
	public int points(AbstractPiece[][] chessboard, int [] start, int [] end){
		
		int value = 0;
		
		for(int row = 0; row < chessboard.length; row++){
			for(int column = 0; column < chessboard[0].length; column++){
				
				if(chessboard[row][column] == chessboard[end[0]][end[1]])
				{
					value = chessboard[end[0]][end[1]].relativeValue();
					
				}		
			}
		}
			
		return value;
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VirtualChess object = new VirtualChess(); // Create a new object
		
		AbstractPiece [][] x = object.board();
		String user_input = " ";
		int player1 = 0;
		int player2 = 0;
		boolean quit = true;
		
		while(quit){
				object.print(x);	//print original board
				System.out.println();
				System.out.println("Make Your Move (Format: e1 to e5)");
				System.out.println("Player 1: " + player1);
				System.out.println("Player 2: " + player2);
				Scanner input = new Scanner(System.in); // Get string from user
				user_input = input.nextLine();		// assign user input to move
					
				if(user_input.equals("exit"))
				{
							System.err.print("Game Over!");
							quit = false;
				}
				else
				{
							int [] starting = object.starting_position(user_input); // turn user string into a starting position
							int [] ending = object.end_position(user_input);	// turn user string into end position
							
							
							int value = object.points(x, starting, ending); //what points are due
		
							if(object.correct(x, starting, ending) == false) //Flagged if move is invalid
							{
								System.err.print("Invalid Move");
								
							} 
							   //check to see what points are given 
							
							if(x[starting[0]][starting[1]].isWhite())  //see which player deserves the point, black or white...
							{
								player2 += value;
							}
							else
							{
								player1 += value;
								
							}
							
							AbstractPiece [][] moved_piece = object.move(x, starting, ending); //change original board to new board position
							
							
							x = moved_piece;
							System.out.println();
				}
		}	
	}

}
