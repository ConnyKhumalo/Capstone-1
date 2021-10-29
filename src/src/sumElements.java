import java.util.Arrays;
import java.util.Scanner;
public class sumElements {
	public static void main(String args[]) {
		double sumOfRow = 0;
		double [][] matrix = new double[3][4];
		Scanner input = new Scanner(System.in);
		//Ask user to enter matrix numbers
		System.out.println("Enter a 3 by 4 matrix row by row: " );
		for(int i = 0 ; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
		for(int j = 0; j < matrix[0].length; j++) {
			double sumOfCol = 0;
			for(int i = 0; i < matrix.length; i++) {
				sumOfCol += matrix[i][j];	
			}
			System.out.println("Sum of all the numbers in column " + j + " is: " + sumOfCol);
		}
		
	}
		
	
} 

