package CollectionFramework;
import java.util.HashSet;
public class SetOperationsOfHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <Integer> A = new HashSet <Integer>();//We can use Stung also
	    HashSet <Integer> B = new HashSet <Integer>();
	    HashSet <Integer> C = new HashSet <Integer>();
	      A.add(1);
	      A.add(2);
	      A.add(3);
	      A.add(4);
	      A.add(5);
	      A.add(1);
	      A.add(3);
	      
	      B.add(1);
	      B.add(2);
	      B.add(3);
	      B.add(4);
	      
	      C.add(1);
	      C.add(2);
	      C.add(3);
	      
	      System.out.println("A = " + A);
	      System.out.println("B = " + B);
	      System.out.println("C = " + C);
	      
	      
          A.addAll(B);
	      System.out.println("Union AUB = " + A);
	      
	      System.out.println("A = " + A);
	      
	      A.retainAll(B);
	      System.out.println("Intersection = " + A);
	      
	      System.out.println("A = " + A);
	      
	      A.removeAll(C);
	      System.out.println("Difference A-C = " + A);
	}

}
