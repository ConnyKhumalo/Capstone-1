import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
//Writing to answers.txt file
public class mywork {
	public static void main(String[] args) {
		try {
			FileWriter myWriter = new FileWriter("calculator.txt");
			myWriter.write("");
			myWriter.close();
			System.out.print("File Ready");
		}
		catch(IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}
	
}

