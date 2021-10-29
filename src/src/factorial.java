import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		//Finding the factorial of users input
		System.out.println("Please enter a  positive number: ");
		Scanner uinput = new Scanner(System.in);
		int number = uinput.nextInt();
		//uinput.close();
		long fact = 1;
		int i = 1;
		for (i= 1; i <= number; i++) {
			fact = fact*i;
		}
	    System.out.println(" The factorial of " + number + " is: " + fact);	
	}

}
