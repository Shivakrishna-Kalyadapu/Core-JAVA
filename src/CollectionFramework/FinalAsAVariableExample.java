package CollectionFramework;

public class FinalAsAVariableExample {

	final int speed;//final variable 
	public FinalAsAVariableExample (int s, int s1) {
		speed=s;
	}
	 void run(){  
		//int speed1=s1;
	  System.out.println("Speed is :"+speed);
	 }
	 public static void main(String args[]){  
		 FinalAsAVariableExample obj=new FinalAsAVariableExample(100, 200);
	 obj.run();  
	}  
	} 