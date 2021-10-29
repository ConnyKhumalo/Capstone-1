import java.util.Scanner;
import java.util.Arrays;
public class grades {

	public static void main(String[] args) {
		int[] myTestResults = new int[5];
		int i;
		int total = 0;
		double average;
		Scanner uinput = new Scanner(System.in);
		
		for(i = 0; i < 5; i++) {
			System.out.print("Enter marks of test " + (i + 1) + ":");
			myTestResults[i] = uinput.nextInt();
			total = total + myTestResults[i];
			
		}
		//Calculating the average
		average = total/5;
		System.out.println(Arrays.toString(myTestResults));
		System.out.println("Average: " + average);
		System.out.print("The student average grade is: ");
		if(average >= 80) {
			System.out.print("A");
		}
		else if(average >= 70 && average < 79) {
			System.out.print("B");
		}
		else if(average >= 60 && average  < 69) {
			System.out.print("C");
		}
		else if(average >= 50 && average < 59) {
			System.out.print("D");
		}
		else if(average <= 49) {
			System.out.print("F");
		}
	}

}
