import java.util.Scanner;

public class Percentage1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner (System.in);
		System.out.println("Enter value of A:");
		int A=s.nextInt();
		System.out.println("Enter value of B:");
		int B=s.nextInt();
		System.out.println("Enter value of C:");
		int C=s.nextInt();
		System.out.println("Enter value of D:");
		int D=s.nextInt();
		System.out.println("Enter value of E:");
		int E=s.nextInt();
		int Avg=(A+B+C+D+E)/5;
		int Per=(Avg*100)/100;
		System.out.println("Average:"+Avg);
		System.out.println("Percentage:"+Per+"%");
			}

		}