package CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<Integer>list=new LinkedList<Integer>();
list.add(2);
list.add(4);
list.add(6);
list.add(6);
list.add(8);

System.out.println("Access element is : "+list.get(4));
System.out.println("Delete element "+list.remove(4));
System.out.println("Finding size "+list.size());
System.out.println("Finding first position "+list.indexOf(6));
System.out.println("Finding last position "+list.lastIndexOf(6));
/*Iterator itr=list.iterator();

System.out.println("Integers in my list :");
while (itr.hasNext())
{
	System.out.println(itr.next());
	}*/
System.out.println("Integers in my list :"+list);
}
}