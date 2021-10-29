import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
//Writing to answers.txt file
public class testing {
	public static void main(String[] args) {
		try {
			FileWriter myWriter = new FileWriter("testing.txt");
			myWriter.write("It is not necessary for a program to be completely free of defects before it is delivered to its customers"
					+ "\nbecause once the program is stable enough ,the benefit that its usage provides outweighs the few occasions when it fails,"
					+ "\nplus it is not always possible to deliver a defect free product to the customer which is 100%  correct"
					+ "\nWhat are the pros and cons of testing being carried out by the developers themselves?"
					+ "\nAdvantages(Pros) of developers testing their own program:"
					+ "\nTesting is easier since they know how their code. "
					+ "\nSaves time,dont waste time having to learn the code."
					+ "\nDisadvantages(Cons) of having developers  testing their own program:"
					+ "\nOne may not easily identify their own errors."
					+ "\nIncreases the effort of developers and may copromise with quality."
					+ "\nEthics of testing the system until the testing budget is exhausted are:"
					+ "\nIf the budget is too low only a few methods of testing are covered with the available budget"
					+ "\nAlso the quality of the software will be affected due to incomplete testing.");
			myWriter.close();
			System.out.print("File Ready");
		}
		catch(IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}
	
}
