import java.util.Scanner;

public class forloopsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the value");
int a=s.nextInt();
int sum=0;
for (int i=1;i<=a;i++)
{
	sum=sum+i;
}
System.out.println("Sum of digits:" +sum);
	}

}
