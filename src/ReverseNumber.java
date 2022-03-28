import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the number to reverse: ");
int n=s.nextInt();
int reverse=0;
while (n!=0)
{
	int remainder=n%10;
	reverse=reverse*10+remainder;
	n=n/10;
}
System.out.println("The reverse of the given number is: " + reverse);
	}

}
