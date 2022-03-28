package CollectionFramework;

public class FinalAsAMethodExample {

	public final void display() {
		System.out.println("INDIAN");
	}
	public static void main(String args[]) {
		new FinalAsAMethodExample().display();
	}
	class Sample extends FinalAsAMethodExample {
		public void display() {
			System.out.println("indian");//This will not print because we use the final method and that output only print
		}
	}
	}