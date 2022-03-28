package CollectionFramework;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferReaderClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		InputStreamReader sr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(sr);
		System.out.println("Enter the Name");
		String name = br.readLine();
		System.out.println("Hi " + name);
		System.out.println("Enter the age");
		int age = Integer.parseInt(br.readLine());
		System.out.println("Your age is " + age);
	}

}
