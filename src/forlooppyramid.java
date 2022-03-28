import java.util.Scanner;

public class forlooppyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
for (int i=1;i<a;i++)
{
	for (int j=a-i;j>1;j--)
	{
System.out.print(" ");
	}
for (int j=1;j<=i;j++)
{
	System.out.print("* ");
}
System.out.println();
}
}
}