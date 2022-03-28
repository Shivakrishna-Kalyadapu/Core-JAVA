import java.util.Scanner;

public class Switchloopevennumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter number");
int a=s.nextInt();

if(a % 2 == 0)
{
    System.out.println("The given number "+a+" is Even ");
}
else
{
    System.out.println("The given number "+a+" is Odd ");
}
	}

}
