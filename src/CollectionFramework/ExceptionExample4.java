package CollectionFramework;

public class ExceptionExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

try {
	int a=5, b=6,c;
	c=a/b;
	System.out.println("Value of c : "+c);
	
	String s1="ABC";
	String s2="15";
	
	int i=Integer.parseInt(s2);   // Converting String to integer value
	System.out.println("Value of i : "+i);
	}
catch (Exception e) {
	System.out.println("Exeception occured");
}
	}
}
