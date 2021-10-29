import java.util.Arrays;
//First need to sort the arrays first
public class NoDups {
	   public static int removeDuplicates(int arr[],int num) 
	   {
		   if(num == 0 || num == 1) {
			   return num;
		   }
		   int[] temp = new int[num];
		   int j = 0;
		   for(int i = 0; i < num-1; i++){
			   if(arr[i] != arr[i + 1]) {
				   temp[j++] = arr[i];
			   }
		   }
		   temp[j++] = arr[num-1];
		   //Changing original array
		   for(int i = 0; i < j; i++) {
			   arr[i] = temp[i];
		   }
		   return j;
		}
		public static void main(String[] args) {
			int arr[] = {20,100,10,80,70,1,0,-1,2,10,15,300,7,6,2,18,19,21,9,0};
			Arrays.sort(arr);
			int length = arr.length;
			length = removeDuplicates(arr,length);
			//print updated array
			for(int i = 0; i < length; i++) 
				System.out.print(arr[i] + " " );
		}	
}

	
	
