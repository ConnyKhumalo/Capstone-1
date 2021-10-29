public class Errors
{

	public static void main (String[] args)
	{

		System.out.println("Welcome to my first program!\n");//This was a Syntax error because a semi-colon was missing
		//I removed years old so that the string ageStr = "24" could be parsed into an int
		String ageStr = "24";

		int age = Integer.parseInt(ageStr);

		System.out.println("I'm " + age + " years old.");

		int three = 3;//Compilation error  cannot say that an integer is equal to a string,remove the quotation marks from 3

		int answerYears = age + three;

		System.out.println("Total number of years: " + answerYears);

		int answerMonths = answerYears * 12 + 6; //Logic error six months must be added

		System.out.println("In 3 years and 6 months, I'll be " + answerMonths + " months old");

		//Once you've corrected all the errors, the answer should be 330.
	}
	//Syntax error because another brace was missing to close the classbody
}