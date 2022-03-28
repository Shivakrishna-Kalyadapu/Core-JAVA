package CollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> A = new LinkedHashSet<Integer>();
		
		  A.add(1);
		  A.add(2);
	      A.add(3);
	      A.add(4);
	      A.add(5);
	      
	    // Note: This will not add new element
	    // as 1 already exists
	      A.add(1);
	      A.add(6);
	     
		
		// Getting size of LinkedHashSet
        // using size() method
        System.out.println("Size of LinkedHashSet = " + A.size());
 
        System.out.println("Original LinkedHashSet:" + A);
 
        // Removing existing entry from above Set
        // using remove() method
        System.out.println("Removing D from LinkedHashSet: " + A.remove("4"));
 
        // Removing existing entry from above Set
        // that does not exist in Set
        System.out.println(
            "Trying to Remove Z which is not " + "present: " + A.remove("10"));
 
        // Checking for element whether it is present inside
        // Set or not using contains() method
        System.out.println("Checking if A is present=" + A.contains("1"));
 
        // Now lastly printing the updated LinekdHashMap
        System.out.println("Updated LinkedHashSet: "+ A);A.add(1);
	      
	
	}

}
