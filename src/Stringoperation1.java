
public class Stringoperation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="JAVA Programming";  
		   s.concat(" Immutable test");//concat() method appends the string at the end  
		   System.out.println(s);//will print JAVA Programming because strings are immutable objects  

		   s=s.concat(" Immutable test");
		   System.out.println(s);
		   
		   StringBuffer sb=new StringBuffer("JAVA Programming");
		   sb.append(" Immutable test");
		   System.out.println(sb); //will print JAVA Programming Immutable test
	}

}
