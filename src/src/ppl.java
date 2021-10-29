import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
public class ppl {

	public static void main(String[] args) throws  IOException{
		//File text = new File("calculator.txt");
		//creating an object of Scanner class
		Scanner uinput = new Scanner(System.in);
		FileWriter pw = new FileWriter(new File ("calculator.txt"));
		//Asking user to enter a number
		System.out.println("Please enter a number: ");
		int number = uinput.nextInt();
		//Asking user to enter a number
		System.out.println("Please enter a second number : ");
		int number2 = uinput.nextInt();
		//Asking user to enter operator
		System.out.println("Please enter the operation you would like to perform on the numbers.\nEnter:\n+ To add the two numbers"
				+ "\n- To subtract \nx To multiply: ");
		char operation = uinput.next().charAt(0);
		double results = 0;

		switch (operation) {
		//adds the two numbers
		case '+' :
			results = number + number2;
			System.out.println(number + " + " + number2 + " = " + results);
			//pw.write(number + " + " + number2 + " = " + results);
			break;
			//Subtracts
		case '-' :
			results = number - number2;
			System.out.println(number + " - " + number2 + " = " + results);
			//pw.write(number + " - " + number2 + " = " + results);
			break;
			//performs multiplication between the two numbers
		case 'x' :
			results = number * number2;
			System.out.println(number + " x " + number2 + " = " + results);
			//pw.write(number + " x " + number2 + " = " + results);
			break;
		}
		uinput.close();
		pw.close();

	}
}
