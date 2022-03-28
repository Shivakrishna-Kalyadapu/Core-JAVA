import java.util.Scanner;

public class forloopleftangletriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int row=s.nextInt();
		for (int i=0;i<=row;i++) //row
		{
			for(int j=2*(row-i);j>=0;j--) 
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++);
		    {
			System.out.print("* ");
		    }
		    System.out.println(" ");
}
}
}