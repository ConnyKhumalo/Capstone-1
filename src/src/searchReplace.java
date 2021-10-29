import java.util.Scanner;
public class searchReplace {
	static String sentence,find,replaced;


	public static void main(String[] args) {
		System.out.println("Please enter a sentence: " );
		Scanner uinput = new Scanner(System.in);
		String sentence = uinput.nextLine();
		System.out.println("Please enter the substring you wish to find: ");
		String find = uinput.nextLine();
		System.out.println("Please enter a string to replace the given substring: ");
		String replaced = uinput.nextLine();
		String change = sentence.replace(find,replaced);
		System.out.println(change);
		System.out.println("Your new sentence is: " + change);
		uinput.close();
	}
	public static String replace(String find,String replaced) {
		if(sentence.contains(replaced)) {
			System.out.println(sentence);
		}
		else {
			sentence= sentence.replace(find, replaced);
			System.out.println(sentence);
		}
		return replaced;	
	}
}
