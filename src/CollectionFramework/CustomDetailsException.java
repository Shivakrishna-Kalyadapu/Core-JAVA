package CollectionFramework;

import java.util.Scanner;

class Details extends Exception {

	public Details(int age, String str) {
		super(str);
	}
}

public class CustomDetailsException {
	static void validate(int age, String name) throws Details {
		if (name == "Netaji" && age == 25) {
			System.out.println("Name is Netaji");
			System.out.println("Age is 25");
		} else {
			System.out.println("Error");

			throw new Details(0, "Entered the Name is invalid");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validate(25, "Netaji");
		} catch (Details e) {
			System.out.println("Exception occured");
			System.out.println(e);
		}
	}

}
