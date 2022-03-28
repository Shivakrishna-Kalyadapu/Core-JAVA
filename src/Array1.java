import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the number of elements");
int n=s.nextInt();
int arr[]=new int [n];

System.out.println("Enter elements");
for (int i=0;i<n;i++)
	arr[i]=s.nextInt();

	//for (int i:arr)
for(int i=0;i<n;i++)
	{
			System.out.println("arr["+i+"] = "+ arr[i]);
	}

}
}