package CollectionFramework;

import java.util.*;  
class Student{  
int id, age;  
String name,location,degree;  
int quantity;  
public Student(int id, String name, String degree,  int age, String location) {  
    this.id = id;  
    this.name = name;
    this.degree = degree;  
    this.age = age;
    this.location = location;
}
}
    public class ConstructorLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 

		    List<Student> list=new LinkedList<Student>();  
		      
		    Student S1=new Student(101, "Bhagath", "B.Tech", 25, "India");  
		    Student S2=new Student(102, "Subhash", "M.Tech", 27, "India");  
		    Student S3=new Student(103, "Chandrashekhar", "M.E", 25,"India");  
		    //Adding Student details to list 
		    list.add(S1);  
		    list.add(S2);  
		    list.add(S3);  
		    
		    //Traversing list  
		    for(Student S:list){  
		    System.out.println(S.id+" "+S.name+" "+S.location+" "+S.degree+" "+S.age); 
	}
	}
    }
