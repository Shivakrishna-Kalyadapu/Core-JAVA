import java.util.Scanner;

public class Array2String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements");
	int n=s.nextInt();
		String arr[]=new String [n];

		System.out.println("Enter elements");
		for (int i=0;i<n;i++)
			arr[i]=s.next();

			//for (String i:arr)
		for(int i=0;i<n;i++)
			{
					System.out.println("arr["+i+"] = "+ arr[i]);
	}

}
}
