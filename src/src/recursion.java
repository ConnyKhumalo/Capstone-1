import java.util.Scanner;
public class recursion {

	public static void main(String[] args) {

		String word = "Money";
		System.out.println("The word is " + word);
		String reversed = reverseString(word);
		System.out.println("The word in reverse is " + reversed);

		int number;
		System.out.println("\nEnter a number: ");
		Scanner uinput  = new Scanner(System.in);
		number = uinput.nextInt();
		System.out.println("Fibonacci Series up to : " + number);
		//printing the Fibonacci series up to the number entered
		for(int i = 1; i<= number;i++) {
			System.out.print(fibonacci2(i) + " ");
		}

	}
	//Using recursion to calculate Fibonacci number.
	public static String  reverseString(String word) {
		if(word.isEmpty())
			return word;
		//Calling Function Recursively
		return  reverseString(word.substring(1)) + word.charAt(0);
	}
	
	public static int fibonacci(int number) {
		if(number == 1 || number == 2) {
			return 1;
		}
		return fibonacci(number - 1) + fibonacci(number - 2);
	}
	//Calculating Fibonacci number using loop
	public static int fibonacci2(int number) {
		if(number == 1 || number == 2) {
			return 1;
		}
		int a = 1,b = 1,fibonacci = 1;
		for(int i = 3; i <= number;i++) {
			//Fibonacci number is the sum of the previous two Fiboncci number
			fibonacci = a + b;
			a = b;
			b = fibonacci;
		}
		return fibonacci;//Fibonacci number
	}


}
