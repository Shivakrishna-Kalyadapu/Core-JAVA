import java.util.Scanner;
import java.util.Arrays;
public class Array7DifferentMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int numArr[] = { 1,2,35 }; 
		int numArr1[] = { 1,2,35,34 };
		
		        Arrays.sort(numArr); 
		        System.out.println("Input array:" + Arrays.toString(numArr));
		        System.out.println("Enter key from array");//To show enter command at output
		        // int key = 35; //Key value is in Static
		        int key=s.nextInt(); //Key value is in Dynamic

		        
		         System.out.println("Key " + key + " found at index = " + Arrays.binarySearch(numArr, key));
		System.out.println("Check Equality-->"+Arrays.equals(numArr,numArr1));
		System.out.println("Comparing ---->" + Arrays.compare(numArr,numArr1));

	}

}
