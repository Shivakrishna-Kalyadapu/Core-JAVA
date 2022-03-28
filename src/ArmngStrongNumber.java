import java.util.Scanner;

public class ArmngStrongNumber {

	public static void main(String[] args) {
		
		//To check the number is Armngstrong number
		System.out.println("Enter the number : ");
		Scanner sc=new Scanner(System.in);
		int r, sum=0, temp;
		int n=sc.nextInt();
		temp=n;
		
		while (n!=0)
		{
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(temp==sum)
			System.out.println("The entered number is an Armngstrong number");
		else
			System.out.println("The entered number is not an Armngstrong number");
		
		// All Armngstrong numbers with in the range
    /*  System.out.println("Enter the number : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
			for (int i=1; i<=n; i++)
		{
			double result=0;
			int count=0;
			for (int temp=i; temp!=0; count++)
			{
				temp=temp/10;
			}
			for (int temp=i; temp!=0; temp=temp/10)
			{
				int remainer=temp%10;
				result +=Math.pow(remainer, count);
			}
			if (i==result)
			{
				System.out.println(i + " is an ArmngStrong number");
			}
		}*/
		
		
	}

}
