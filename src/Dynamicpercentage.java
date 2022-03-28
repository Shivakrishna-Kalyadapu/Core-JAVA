import java.util.Scanner;

public class Dynamicpercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
int d=s.nextInt();
int e=s.nextInt();
float totalvalues=(a+b+c+d+e)/5;
float per=(totalvalues*100)/100;
System.out.println("Average is : "+ totalvalues);
System.out.println("Percentage is : "+per);
	}

}
