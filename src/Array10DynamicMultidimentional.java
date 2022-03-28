import java.util.Scanner;

public class Array10DynamicMultidimentional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,c,d, sum=0,l,m,n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number of rows and columns of first matrix");
a=s.nextInt();
b=s.nextInt();
int first[][]=new int[a][b];

System.out.println("Enter elements of first matrics");

for(l=0;l<a;l++)
	for(m=0;m<b;m++)
		first[l][m]=s.nextInt();

System.out.println("Enter the number of rows and columns of second matrix");
c=s.nextInt();
d=s.nextInt();

if (b != c)
	System.out.println("The matrix can't be multiplied with each other");
else
{
	int second[][]=new int[c][d];
	int multiply[][]=new int[a][d];
	System.out.println("Enter elements of second matrics");
	
	for(l=0;l<c;l++);
			for(m=0;m<d;m++);
			second[l][m]=s.nextInt();
			
			for(l=0;l<a;l++)
			{
				for(m=0;m<d;m++)
				{
					for(n=0;n<c;n++)
					{
						sum=sum + first[l][n]*second[n][m];
			}
					multiply[l][m]=sum;
					sum=0;
				}
			}
			System.out.println("Product of the matrices:");
}
	}

}
