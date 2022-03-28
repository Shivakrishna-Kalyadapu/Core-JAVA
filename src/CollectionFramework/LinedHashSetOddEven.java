package CollectionFramework;

import java.util.LinkedHashSet;

public class LinedHashSetOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<Integer> A=new LinkedHashSet<Integer>();
		LinkedHashSet<Integer> B=new LinkedHashSet<Integer>();
		A.add(1);
		A.add(3);
		A.add(5);
		A.add(7);
		A.add(11);
		
		B.add(2);
		B.add(4);
		B.add(6);
		B.add(8);
		B.add(10);
		
		System.out.println("Elements of A : " + A);
		System.out.println("Elements of B : " + B);
		
		A.removeAll(B);
		System.out.println("Odd numbers are : " + A);
		
		B.removeAll(A);
		System.out.println("Even numbers are : " + B);
	}

}
