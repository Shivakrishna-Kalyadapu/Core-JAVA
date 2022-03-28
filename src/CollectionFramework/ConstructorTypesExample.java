package CollectionFramework;

import java.util.Scanner;

public class ConstructorTypesExample {

	private String name;
	private int age;
	public ConstructorTypesExample() {
	}
		
		public ConstructorTypesExample(String name1, int age) { //Parameterized constructor
			name=name1;
			this.age=age;
		}
		public ConstructorTypesExample copyObject (ConstructorTypesExample std) { //Passing Object as Parameter
			this.name=std.name;
			this.age=std.age;
			return std;
		}
		public void displayData() {
			System.out.println("Name : " +this.name);
			System.out.println("Age : " +this.age);
		}
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the Name : ");
			String name=s.next();
			System.out.println("Enter the age : ");
			int age=s.nextInt();
			
			ConstructorTypesExample std=new ConstructorTypesExample(name, age);
			System.out.println("Contents of the original object : ");
			std.displayData();
			System.out.println("Contents of copy object : ");
			ConstructorTypesExample copyOfStd=new ConstructorTypesExample().copyObject(std);
			copyOfStd.displayData();
		}
			
	}
