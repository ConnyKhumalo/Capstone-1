import java.io.File;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class drop {

	public static void main(String[] args) {
		try {
			File j = new File("input.txt");
			Scanner input = new Scanner(j);
			PrintWriter pw = new PrintWriter(new File("output.txt"));
			while(input.hasNext()) {
				String line = input.next();//Storing line in a variable 
				String[] numOperation = line.split(":");//Splitting line from the semi-colon
				String operation = numOperation[0];//assigning operation to a variable
				String[]digits= numOperation[1].split(",");//Assigning the numbers to a variable using index 1 ,and splitting the numbers
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
					pw.print("The max of " + Arrays.toString(arr) + " is " + max);
				}
				else if(operation.equalsIgnoreCase("Avg")) {
					double avg = 0.0;
					for(int i = 0;i < len; i++) {
						avg += arr[i];
					}
					avg/=len;
					pw.print("The average of " + Arrays.toString(arr) + " is " + avg);
				}
			}
			pw.close();
			input.close();

		}catch(FileNotFoundException e) {
			System.out.println("Error");
		}
	}
}
