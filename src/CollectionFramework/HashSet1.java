package CollectionFramework;
import java.util.HashSet;
import java.util.Set;
public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> set=new HashSet<String>();
		
		set.add("Apple");
        set.add("Mango");
        set.add("Grapes");
        set.add("Orange");
        set.add("Lemon");
        
        System.out.println("List of Elements:"+ set);
		System.out.println("Add Element:"+set.add("Pomegranate"));
		System.out.println("List of Elements:"+ set);
		System.out.println("Add Element:"+set.add("Watermelon"));
		System.out.println("Set Element:"+set);
		System.out.println("Add Element:"+set.add("Watermelon"));
		System.out.println("Set Element:"+set);
      
	}

}
