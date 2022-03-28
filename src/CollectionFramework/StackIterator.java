package CollectionFramework;

import java.util.Stack;

public class StackIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>();
		Stack<Integer> s=new Stack<Integer>();
		stack.add("Apple");
        stack.add("Mango");
        stack.add("Grapes");
        stack.add("Lemon");
        stack.add("Orange");
        
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        
        System.out.println("Elements are : " + stack);
        System.out.println("Search element position "+stack.search("Grapes"));
        System.out.println("Pick operation : "+stack.peek());//Pick top of the elements
        System.out.println("Delete elemet : "+stack.pop());//Top element will be delete
        System.out.println("Elements are : " + stack);
        System.out.println("Pushing the element : "+ stack.push("Orange"));//Add as the last element
        System.out.println("Elements are : " + stack);
        
        System.out.println();
        
        System.out.println("Elements are : " + s);
        System.out.println("Search element position "+s.search(30));
        System.out.println("Pick operation "+s.peek());//Pick top of the elements
        System.out.println("Delete elemet "+s.pop());//Top element will be delete
        System.out.println("Elements are : " + s);
        System.out.println("Pushing the element :"+ s.push(20));//Add as the last element
        System.out.println("Elements are : " + s);
	}

}
