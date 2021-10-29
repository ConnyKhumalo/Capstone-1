import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
public class help {

	public static void main(String[] args) throws  IOException{
		File w = new File("calculator.txt");
		try {
			if(!w.exists()) {
				
			}
		//File text = new File("calculator.txt");
		//creating an object of Scanner class
		Scanner uinput = new Scanner(System.in);
		FileWriter filewriter = new FileWriter(w,true);
		BufferedWriter pw = new BufferedWriter(filewriter);
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
			pw.write(number + " + " + number2 + " = " + results+"\n");
			break;
			//Subtracts
		case '-' :
			results = number - number2;
			System.out.println(number + " - " + number2 + " = " + results);
			pw.write(number + " - " + number2 + " = " + results+"\n");
			break;
			//performs multiplication between the two numbers
		case 'x' :
			results = number * number2;
			System.out.println(number + " x " + number2 + " = " + results);
			pw.write(number + " x " + number2 + " = " + results+"\n");
			break;
		}
		uinput.close();
		pw.close();

	}
		catch(IOException e) {
			System.out.println("Could not");
			}
		}
}

