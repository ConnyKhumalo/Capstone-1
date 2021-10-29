import java.util.Scanner;
import java.util.*;
public class averageNumber {
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int positive = 0;
		int negative = 0;
		int total = 0;
		int count = 0;
		double average;
		System.out.println("Enter a number: ,if you would like to stop entering numbers enter 0 to stop: " );
		int number = 0 ;
		while((number = s.nextInt()) != 0 ) {
			total += number;
			count++;
			if(number  > 0) {
				positive++;
			}else if(number < 0) {
				negative++;}
		}
		average = (double)total/count;
		System.out.println("The number of positive " + positive);
		System.out.println(" The number of negative " +  negative);
		System.out.println(" The total is " +  total );
		System.out.println(" The average is " + average );
	}
	}

