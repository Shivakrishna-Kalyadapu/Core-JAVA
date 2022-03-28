package CollectionFramework;

public class ExceptionExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int a=5, b=6, c;
	c=a/b;
	System.out.println("Value of c : " + c);
	String s=null;
	System.out.println("Value of s : " + s.length());
}
catch (NullPointerException e) {
	// TODO: handle exception
	System.out.println("Exception occured");
}
}
}
