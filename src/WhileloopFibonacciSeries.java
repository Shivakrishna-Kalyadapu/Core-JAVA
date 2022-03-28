import java.util.Scanner;

public class WhileloopFibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int a=s.nextInt();
		int fac=1;
		int i=1;
		do {
			fac=fac*i;
			i++;
		}
		while (i<a);
		// Below code is for while loop
		/*while(i<=a)
		{
		fac=fac*i;
		i++;
		
	}*/
		System.out.println("Factorial of the number is :" + fac);
}
}