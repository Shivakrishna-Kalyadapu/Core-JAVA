import java.util.Scanner;

public class elsecondition1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=5,b=10,c=15;
if (a>b && a>c)
System.out.println("a is greater");

else if (b>c && b>a)
	System.out.println("b is greater");
	
	else
		System.out.println("c is greater");//By static programming
		
	//By Dynamic programming
Scanner s=new Scanner(System.in);
System.out.println("Enter a,b,c");
int d=s.nextInt();
int e=s.nextInt();
int f=s.nextInt();
if (a>b && a>c)
System.out.println("a is greater");

else if (b>c && b>a)
	System.out.println("b is greater");
	
	else
		System.out.println("c is greater");
}
	
	
}

