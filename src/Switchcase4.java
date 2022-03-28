import java.util.Scanner;

public class Switchcase4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int A,B;
Scanner s=new Scanner(System.in);
System.out.println("Enter value of A");
A=s.nextInt();
System.out.println("Enter an operator (+,-,*,/)");
char op=s.next().charAt(0);
System.out.println("Enter value of B");
B=s.nextInt();

switch (op)
{
case '+':
	System.out.println("Addition : "+(A+B));
	break;
case '-':
	System.out.println("Subtraction : "+(A+B));
	break;
case '*':
	System.out.println("Multiplication : "+(A+B));
	break;
case '/':
	System.out.println("Division : "+(A+B));
	break;
}
	}

}
