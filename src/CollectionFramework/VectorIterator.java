package CollectionFramework;

import java.util.Vector;

public class VectorIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vec = new Vector<String>();
		Vector<Integer> vec1 = new Vector<Integer>();
		Vector<String> vec2 = new Vector<String>();
		vec.add("Tiger");
        vec.add("Lion");
        vec.add("Dog");
        vec.add("Elephant");
        vec.add("Dog");
        vec.add(5,"Tiger");
        //Adding integer using addElement() method of Vector  
        /*vec1.addElement(2);
        vec1.addElement(4);
        vec1.addElement(6);*/
        vec2.add("Deer");
        vec2.add("ABC");
        vec2.addAll(vec);
        
        System.out.println("Access element is : "+vec.get(4));
        //System.out.println("Access integer is : "+vec1.get(2));
        System.out.println("Delete element is :"+vec.remove(4));
        System.out.println("Finding size is : "+vec.size());
        //System.out.println("Finding first position "+vec1.indexOf(2));
        System.out.println("Finding last position "+vec.lastIndexOf("Dog"));
        
        System.out.println("Elements are in vec : "+vec);
        //System.out.println("Integers are: "+vec1);
        System.out.println("Elements are: "+vec2);
	}

}
