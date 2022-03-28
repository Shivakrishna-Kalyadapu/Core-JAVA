package CollectionFramework;

public class ExceptionExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

try {
	int a=5, b=6,c;
	c=a/b;
	System.out.println("Value of c : "+c);
	
	int m[]=new int[5];
	m[2]=5;
	System.out.println("Value of 2 position is : " + m[2]);
	
} catch (Exception e) {
	System.out.println("Exception occured"+e);
	}
}
}