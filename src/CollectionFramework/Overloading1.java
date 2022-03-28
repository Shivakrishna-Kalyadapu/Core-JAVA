package CollectionFramework;

public class Overloading1 {

	
		// TODO Auto-generated method stub

		void sum(int a, int b) {
			System.out.println(a+b);
		}
		void sum(int a, int b, int c) {
			System.out.println(a+b+c);
		}
		void sum(int a, double b) {
			System.out.println(a+b);
		}
		public static void main(String[] args) {
			Overloading1 ovl=new Overloading1();
			ovl.sum(10,10,10);
			ovl.sum(20,20);
			ovl.sum(10, 10.5);
		}
	}