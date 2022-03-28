package CollectionFramework;

public class OverrideExample1 {

	public static void main(String[] args) {
		Dog d1=new Dog();
		d1.display();
	}
}
class Animal {
	public void display() {
	System.out.println("It's an Animal");
	}
}
	class Dog extends Animal{
		@Override
		public void display() {
			super.display(); // GIves output of parent class
			System.out.println("It's a Dog");
		}
	}