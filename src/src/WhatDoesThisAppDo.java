import java.util.Scanner;
public class WhatDoesThisAppDo {
	public static void main(String[] args) {
		//Variables are first being declared
		final int Number = 5;//The value of this variable can not be changed
		int num2 = 0;
		int num1 = 0;
		long startTime = System.currentTimeMillis();//This will return the current time in millisecond
		String string1 = " ";
		
		Scanner uinput = new Scanner(System.in);
		
		while(num1 < Number) {
			int number1 = (int)(Math.random()*10);//a random integer will be generated between 1 and 10.
			int number2 = (int)(Math.random()*10);//a random integer will be generated between 1 and 10.
			if(number1 < number2) {
				//Changing or swapping the values in number1 and number2.
				//So that number1's initial value ends up being numbers2' initial value and vice verse
				int temp = number1;
				number1 = number2;
				number2 = temp;
			}
			
			//Displays a question to the user to enter an answer
			System.out.print("What is " + number1 + " - " + number2 + "?");
			int answer = uinput.nextInt();
			if(number1 - number2 == answer) {
				System.out.println("You are correct!");
				num2++;
			}
			else {
				System.out.println("Your answer is wrong.\n" + number1 + " - " + number2 + " should be " + (number1 - number2));
				num1++;
				long endTime  = System.currentTimeMillis();
				long testTime = endTime - startTime;
				System.out.println("Corect count is " + num2 + "\nTest time is " + testTime/1000 + "seconds\n" + string1);
			}
		}
	}
}
