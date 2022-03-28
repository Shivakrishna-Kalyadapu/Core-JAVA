import java.util.Scanner;

public class Percentage3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner (System.in);
		System.out.println("Enter value of A:");
		System.out.println("Enter value of B:");
		System.out.println("Enter value of C:");
		System.out.println("Enter value of D:");
		System.out.println("Enter value of E:");
		int A=s.nextInt();
		int B=s.nextInt();
		int C=s.nextInt();
		int D=s.nextInt();
		int E=s.nextInt();
		int Avg=(A+B+C+D+E)/5;
		int Per=(Avg*100)/100;
		System.out.println("Average:"+Avg);
		System.out.println("Percentage:"+Per+"%");
	}

}
