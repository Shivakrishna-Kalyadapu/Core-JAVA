import java.util.Scanner;

public class Switchcase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the marks");
		Scanner score=new Scanner(System.in);
		int marks=score.nextInt();
		switch (marks/10)
		{
		case 9:
			System.out.println("Grade A");
			break;
		case 8:
			System.out.println("Grade B");
			break;
		case 7:
			System.out.println("Grade C");
			break;
		case 6:
			System.out.println("Grade D");
			break;
			case 5:
				System.out.println("Grade E");
				break;
				default:
					System.out.println("Failed");
					break;
		}
	}

	}
