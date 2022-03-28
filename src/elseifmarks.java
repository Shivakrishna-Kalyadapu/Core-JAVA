import java.util.Scanner;

public class elseifmarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter your score");
Scanner s=new Scanner(System.in);
float obtained_marks=s.nextFloat();
if (obtained_marks >= 1 && obtained_marks <=100) {
	if (obtained_marks >=90) {
		System.out.println("A+ Grade - Excellent");
	}
	else if (obtained_marks >=80 && obtained_marks <90) {
		System.out.println("A Grade - Very Good");
	}
	else  if (obtained_marks >=70 && obtained_marks <80) {
		System.out.println("B+ Grade - Good");
	}
	else if (obtained_marks >=60 && obtained_marks <70) {
		System.out.println("B Grade - Satisfactory");
	}
	else if (obtained_marks >=50 && obtained_marks <60) {
		System.out.println("C+ Grade - Work hard");
	}
	else if (obtained_marks >=40 && obtained_marks <50) {
		System.out.println("C Grade - Just passed");
	}
	else {
		System.out.println("Failed");
		}
}
	else {
		System.out.println("Please enter marks between 1 and 100");
	}
	}
}
