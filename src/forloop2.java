import java.util.Scanner;

public class forloop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int row=s.nextInt();
for (int i=1;i<=row;i++) //row
{
	for(int j=1;j<=i;j++) //column
	{
		System.out.print("* ");
	}
	System.out.println(" ");
	
}
	}

}
