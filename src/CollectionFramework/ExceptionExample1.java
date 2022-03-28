package CollectionFramework;

public class ExceptionExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int a=5, b=6,c;
	c=a/b;
	System.out.println("Value of c : "+c);
	//String s=null;
	System.out.println("Value of s : "+c);
	String s1="ABC";
	String s2="12";
	
	int i=Integer.parseInt(s2);   // Converting String to integer value
	System.out.println("Value of i : "+i);
	
	int m[]=new int[5];
	m[2]=5;
	System.out.println(m[2]);
} catch (Exception e) {
	System.out.println("Exception occured"+e);
	// TODO: handle exception
}
	}

}
