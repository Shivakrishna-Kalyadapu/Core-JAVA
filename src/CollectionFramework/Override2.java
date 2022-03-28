package CollectionFramework;

public class Override2 {

	public static void main(String[] args) {
		Child c=new Child();
		c.display();
	}
}
		class Parent {
			void display() {
				System.out.println("It's parent class");
			}
		}
		class Child extends Parent {
			void display() {
				super.display();
				System.out.println("It's child class");
			}
		}
