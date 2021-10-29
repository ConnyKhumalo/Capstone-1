import java.util.Scanner;
import java.util.Arrays;
public class identicalArrays {

	public static void main(String[] args) {
		Scanner uinput = new Scanner(System.in);
		//ask user to how many numbers they want for the first array
		System.out.println("Enter number of elements: ");
		int n = uinput.nextInt();
		int arr[] = new int [n];
		System.out.println("enter numbers: ");
		for(int i = 0; i < n ; i++) {
			arr[i] = uinput.nextInt();
			}
		//ask user to how many numbers they want for second array
		System.out.println("Enter number of elements: ");
		int m = uinput.nextInt();
		int arr1[] = new int [m];
		System.out.println("Enter numbers: ");
		for(int i = 0; i < m; i++) {
			arr1[i] = uinput.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
		//now compare the two arrays
		Arrays.sort(arr);
		Arrays.sort(arr1);
		int count = 0;
		for(int i = 0; i < n ; i++) {
			if(arr[i] != (arr1[i])) {
			 count += 1;
			}
			}
	    if(count > 1 ) {
	    	System.out.println("The two arrays are not identical.");
	    }else {
	    	System.out.println("The two arrays are identical.");
	    }
	}
}

