import java.util.Scanner;

public class Swichloop6 {

	public static void main(String[] args) {
		do {
		Scanner num=new Scanner(System.in);
		System.out.println(("Enter \n 1 for addition" + "\n 2 for subtraction" + "\n 3 for multiplication" + "\n 4 for division"));
		int a=num.nextInt();
		System.out.println("Enter the value of A");
		int A=num.nextInt();
		System.out.println("Enter value of B");
		int B=num.nextInt();
		
		if (a>0) {
			switch (a) {
			case 1:
				
				int add=A+B;
				System.out.println("Addition = "+add);
				break;
				
			case 2:
				int sub=A-B;
				System.out.println("Subtraction = "+sub);
				break;
				
			case 3:
				int mul=A*B;
				System.out.println("Multiplication = "+mul);
				break;
				
			case 4:
				int div=A/B;
				System.out.println("Division = "+div);
				break;
				
				default:
					System.out.println("Invalid");
			}
				
		}}
		while (true);


	}}