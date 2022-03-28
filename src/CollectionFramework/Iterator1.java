package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String>list=new ArrayList<String>();
list.add("Apple"); //Adding object in Array list
list.add("Mango");
list.add("Grapes");
list.add("Apple");
list.add("Lemon");
//Traversing list through Iterator
System.out.println("Access element is : "+list.get(4));
System.out.println("Delete element "+list.remove(4));
System.out.println("Finding size "+list.size());
System.out.println("Finding first position "+list.indexOf("Apple"));
System.out.println("Finding last position "+list.lastIndexOf("Apple"));
Iterator itr=list.iterator();
System.out.println("Elements in my list :");
while (itr.hasNext())
{
	System.out.println(itr.next());
}
	}

}
