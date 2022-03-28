import java.util.*;
public class programmultiline2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner (System.in);
		//a means Name
		String a=s.nextLine();
		//b means Age
		int b=s.nextInt();
		//c means Address
		String c=s.next();
		//d means Language
		String d=s.next();
		//e means Percentage in ELAT
		float e=s.nextFloat();
		
		System.out.println("Name:"+a);
		System.out.println("Age:"+b);
		System.out.println("Address:"+c);
		System.out.println("Language known:"+d);
		System.out.println("Percentage in ELAT"+e);
	}

}
