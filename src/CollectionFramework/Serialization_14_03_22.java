package CollectionFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Serialization implements Serializable {
	// class Emp implements Serializable {
	public static void main() {
		System.out.println("Employee");
	}

	int id;
	String name;
	char grade = 'A';

	Serialization(int id, String name, char grade) {
		// Emp(int id, String name, char grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		System.out.println("ID : " + id);
		System.out.println("Name : " + name);
		System.out.println("Grade : " + grade);
	}
}

public class Serialization_14_03_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Serialization se = new Serialization(15, "Chandrashekhar Azaad", 'A'); //Creating object of the class
		// Emp se = new Emp(15, "Chandrashekhar Azaad", 'A');
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("D:\\JavaTestInput.txt.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(se);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
