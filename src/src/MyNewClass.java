import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
//Writing to answers.txt file
public class MyNewClass {
	public static void main(String[] args) {
		try {
			FileWriter myWriter = new FileWriter("input.txt");
			myWriter.write("min:1,2,3,4,5,6\r\n"
					+ "max:1,2,3,4,5,6\r\n"
					+ "avg:1,2,3,4,5,6"
					+ "\np90:1,2,3,4,5,6,7,8,9,10"
					+ "\nsum:1,2,3,4,5,6"
					+ "\np70:1,2,3");
			myWriter.close();
			System.out.print("File Ready");
		}
		catch(IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}
	
}








