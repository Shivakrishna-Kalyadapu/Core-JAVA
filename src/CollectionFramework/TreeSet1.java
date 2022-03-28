package CollectionFramework;

import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> TS=new TreeSet<String>();
		
		TS.add("Apple");
		TS.add("Orange");
		TS.add("Mango");
		TS.add("Grapes");
		TS.add("Lemon");
		TS.add("Apple");
		
		System.out.println("Elements of TS : " + TS);
		
		System.out.println("First element is : " + TS.first());
		System.out.println("Last element is : " + TS.last());
		
		System.out.println("Lower element of Orange is : " + TS.lower("Orange"));
		System.out.println("Higher element of Lemon is : " + TS.higher("Lemon"));
		
		System.out.println("Remove first element : " + TS.pollFirst());
		System.out.println("Elements of TS : " + TS);
		
		System.out.println("Remove last element : " + TS.pollLast());
		
		System.out.println("Elements of TS : " + TS);
		
		System.out.println("Removing the element : " + TS.remove("Lemon"));
		System.out.println("Elements of TS : " + TS);
		
		System.out.println("Adding the element : " + TS.add("Lemon"));
		System.out.println("Elements of TS : " + TS);
		
		System.out.println("Reverse order is : "+ TS.descendingSet());
	
	}

}
