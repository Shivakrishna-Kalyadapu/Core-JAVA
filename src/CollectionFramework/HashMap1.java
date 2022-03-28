package CollectionFramework;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> s=new HashMap<Integer, String>();
		
		s.put(101, "Apple");
		s.put(102, "Orange");
		s.put(103, "Mango");
		s.put(104, "Grapes");
		s.put(105, "Lemon");
		s.put(106, "Lemon");
		s.put(106, "Grapes");
		System.out.println("Elements of s : "+ s);
		
		s.remove(106, "Grapes");
		System.out.println("Elements of s : "+ s);
		
		s.putIfAbsent(107, "Grapes");
		System.out.println("Elements of s : "+ s);
		
		s.entrySet();
		System.out.println("Elements of entryset : "+ s.entrySet());
		
		
		
		System.out.println("List contains 101 : " + s.containsKey(101));
		System.out.println("List contains Apple : " + s.containsValue("Apple"));
	}

}
