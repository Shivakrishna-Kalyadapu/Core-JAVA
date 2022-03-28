import java.util.Scanner;

public class Switchloop5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int A,B;
char op;
Scanner s=new Scanner(System.in);
//Take two numbers as input from user
System.out.println("Enter two numbers");
A=s.nextInt();
B=s.nextInt();

//Taking operator as input from user
System.out.println("Enter an operator (+,-,*,/)");
op=s.next().charAt(0);

switch (op) 
{
case '+':
	System.out.format("%d + %d = &d/n", A,B,A+B);
	break;
case '-':
	System.out.format("%d - %d = &d/n", A,B,A-B);
	break;
case '*':
	System.out.format("%d * %d = &d/n", A,B,A*B);
	break;
case '/':
	System.out.format("%d / %d = &d/n", A,B,A/B);
	break;
	default:
		System.out.println("ERROR");
}
	}

}
