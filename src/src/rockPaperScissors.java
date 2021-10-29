import java.util.Scanner;

public class rockPaperScissors {

	public static void main(String args[]) {
		//getting the users input
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter your move. Type in rock,paper or scisscors: ");
		String myMove = in.nextLine();
		
		//Verify that my move is valid
	    if(!myMove.equals("rock") && !myMove.equals("paper") && !myMove.equals("scissors")) {
	    System.out.println("Your move isn't valid!");    
	    } else {
	    	// Randomly generate opponents move
			int rand =(int)( Math.random()*3);
			String opponentMove = "";
			if (rand == 0) {
				opponentMove = "rock";
			}   else if(rand == 1) {
				opponentMove = "paper";
				
			}   else {
				opponentMove = "scisscors";
			}
			System.out.println("Opponent Move: " + opponentMove);
				
			//Calculate wheather the user has won,lost or draw
			if(myMove.equals(opponentMove)) {
			  System.out.println("Draw!");
			} else if((myMove.equals("rock") && 
			  opponentMove.equals("scissors")) || (myMove.equals
		      ("scissors") && opponentMove.equals("paper")) || 
			  (myMove.contentEquals("paper") && opponentMove.equals("rock"))) {
			  System.out.println("You Win!");
			} else {
				System.out.println("You Lose!");
			}
	    }
	}
}
