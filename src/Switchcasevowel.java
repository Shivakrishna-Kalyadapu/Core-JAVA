import java.util.Scanner;

public class Switchcasevowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
char letter=s.next().charAt(0);

switch (letter) {
case 'a':
	System.out.println("The letter is vowel");
	break;
case 'e':
	System.out.println("The letter is vowel");
	break;
case 'i':
	System.out.println("The letter is vowel");
	break;
case 'o':
	System.out.println("The letter is vowel");
	break;
case 'u':
	System.out.println("The letter is vowel");
	break;
	default:
		System.out.println("The letter is consonent");
		break;
	}
	}
}
