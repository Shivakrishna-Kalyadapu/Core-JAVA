package CollectionFramework;

public class StaticKeyinOverloading {
		
public static int sum(int a, int b)
{
	return a+b;
}
	public static int sum(int a, int b, int c)
	{
		return a+b+c;
	}
		public static double sum(int a, double b)
		{
		    return a+b;
	}
	public static void main(String[] args) {
		StaticKeyinOverloading stk=new StaticKeyinOverloading ();
		
		System.out.println("Addition : "+StaticKeyinOverloading.sum(10,10,10));
		System.out.println("Addition : "+StaticKeyinOverloading.sum(20, 20));
		System.out.println("Addition : "+StaticKeyinOverloading.sum(10, 10.5));
}
	}
