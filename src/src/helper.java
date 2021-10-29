import java.util.Scanner;
public class helper
{

	public static void main(String[] args) 
	{
		try(Scanner uinput = new Scanner(System.in)) {
		String name = uinput.nextLine();
		char gender = uinput.nextLine().charAt(0);
		int age = uinput.nextInt();
		long mobileNo = uinput.nextLong();
		double cgpa = uinput.nextDouble();
		System.out.println("Name: " + name);
		System.out.println("Gender: " + gender);
		System.out.println("Age: " + age);
		System.out.println("mobileNo: " + mobileNo);
		System.out.println("CGPA: " + cgpa);
	}
}
}