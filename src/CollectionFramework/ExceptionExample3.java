package CollectionFramework;

public class ExceptionExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

try {
	int a=5, b=6, c;
	c=a/b;
	System.out.println("Value of c : " + c);
}
catch (ArithmeticException e) {
	System.out.println("Exception occured");
}
}
}
