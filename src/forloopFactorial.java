import java.util.Scanner;

public class forloopFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
//do {
System.out.println("Enter the number");
int a=s.nextInt();
int fac=1;
for(int i=1;i<=a;i++)
{
	fac=fac*i;
}
System.out.println("Factorial of the number is :" + fac);
//}
while (true);
}}