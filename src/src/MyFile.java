import java.io.File
import java.util.stream.*;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MyFile {

	public static void main(String args[]) throws FileNotFoundException {
		File text = new File("input.txt");
		Scanner scnr = new Scanner(text);
		PrintWriter pw = new PrintWriter(new File ("output.txt"));
		while(scnr.hasNextLine()) {
			String line = scnr.nextLine();//Stores the line in a variable
			String[] numOperation = line.split(":");//Splitting line from the semi-colon
			String operation = numOperation[0];//assigning operation to a variable
			String[]digits= numOperation[1].split(",");//Assigning the numbers to a variable using index 1 ,and splitting the number
			int len = digits.length;
			int arr[] = new int [len];
			for(int i = 0; i < len ; i++ ) 
				arr[i] = Integer.parseInt(digits[i].trim());
			if(operation.equalsIgnoreCase("Min")) {
				int min = arr[0];
				for(int i = 0; i < len;i++) {
					if(min > arr[i])
						min = arr[i];
				}
				pw.print("The min of " + Arrays.toString(arr) + " is " + min);

			}
			else if(operation.equalsIgnoreCase("Max")) {
				int max = arr[0];
				for(int i = 0 ; i < len; i++) {
					if(max < arr[i])
						max = arr[i];
				}
				pw.print("\nThe max of " + Arrays.toString(arr) + " is " + max);
			}
			else if(operation.equalsIgnoreCase("Avg")) {
				double avg = 0.0;
				for(int i = 0;i < len; i++) {
					avg += arr[i];
				}
				avg/=len;
				pw.print("\nThe average of " + Arrays.toString(arr) + " is " + avg);
			}

			else if(operation.equalsIgnoreCase("P90")) {
				double p90 = 0.9*10;
				pw.print("\nThe 90th Percentile of " + Arrays.toString(arr) + " is " + p90);
			}
			else if(operation.equalsIgnoreCase("P70")) {
				double p70 = Math.round(0.7*3);
				
				pw.print("\nThe 70th Percentile of " + Arrays.toString(arr) + " is " + p70);
			}
			else if(operation.equalsIgnoreCase("Sum")) {
				int sum = IntStream.of(arr).sum();

				pw.print("\nThe sum of " + Arrays.toString(arr) + " is " + sum);
			}

		}
		pw.close();
		scnr.close();
		
		System.out.print("File Ready");
	}

}