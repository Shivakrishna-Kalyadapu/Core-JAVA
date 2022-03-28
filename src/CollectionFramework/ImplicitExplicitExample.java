package CollectionFramework;

public class ImplicitExplicitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Explicit or Narrowing");

		double d = 35.7;
		float f = (float) d;
		long l = (long) f;
		int i = (int) l;

		System.out.println("Double value : " + d);
		System.out.println("Float value : " + f);
		System.out.println("Long value : " + l);
		System.out.println("Integer value : " + i);

		System.out.println("\n" + "Implicit or Widening");
		byte b = 38;
		short s = b;
		int a = s;
		long m = a;
		double n = m;

		System.out.println("Byte value : " + b);
		System.out.println("Short value : " + b);
		System.out.println("Integer value : " + b);
		System.out.println("Long value : " + b);
		System.out.println("Double value : " + b);
	}

}
