import java.io.IOException;
import java .io.FileWriter;

//Writing to answers.txt file
public class Task11 {
	public static void main(String[] args) {
		try {
			FileWriter myWriter = new FileWriter("answers.txt");
			myWriter.write("A system control anti-lock bracking in a  car - GENERIC SOFTWARE MODEL NEEDED IS THE WATERFALL MODEL "
					+ "\n-Anti-lock bracking is a system that requires alot of safety planning and  requirements are to be understood "
					+ ",thats why the waterfall model is the appropriate generic software model."
					+ "\nA virtual reality system to support software maintenance - GENERIC SOFTWARE MODEL NEEDED IS THE INCREMENTAL DEVELOPMENT  "
					+ "\n-Virtual Reality system will require alot of changes."
					+ "\nA  univeristy accounting system that replaces an existing system - GENERIC SOFTWARE MODEL NEEDED IS THE REUSE-ORIENTED SOFTWARE ENGINEERING"
					+ "\n-University accounting system requirements are well known ."
					+ "\nAn interactive travel planning system that helps users plan journeys with the lowest environmental impact GENERIC SOFTWARE MODEL NEEDED IS THE"
					+ " INCREMENTAL DEVELOPMENT "
					+ "\n-A interactive travel planning system needs to be reliable and stable because the system requirements will change as user uses the system."
					+ "\nI think that incremental development is the most effective approach for developing business software systems "
					+ " and less appropriate for real-time system engineering because business software are complex and are frequently having changes when processes are changed "
					+ " and real-time systems deal with many hardware components which are not easily changeable and cannot be incremental"
					+ "/nIt is important to understand the system  and be able to adapt to reach  the requirements according to the capabilities of the"
					+ " system to be reused."); 
			myWriter.close();
			System.out.println("File ready ");
		 
		} catch(IOException e) {
		    System.out.println("An error occured");
			 e.printStackTrace();
		}	 
	}
}	
		
	
