import java.util.Scanner;

public class ForloopFibonacciSeris {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("Enter the number");
			int a = s.nextInt();
			int f0 = 0, f1 = 1;
			System.out.print(f0 + " " + f1 + " ");
			int f2;
			for (int i = 1; i <= a; i++) {
				f2 = f0 + f1;
				System.out.print(f2 + " ");
				f0 = f1;
				f1 = f2;

			}
			System.out.println();
		} while (true);
	}
}
