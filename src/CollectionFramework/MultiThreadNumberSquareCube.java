package CollectionFramework;

import java.util.Random;

class Square extends Thread {
	int x;

	Square(int n) {
		x = n;
	}

	public void run() {
		double sqr=Math.pow(x, 2);
		//int sqr = x * x;
		System.out.println("Square of the Integer Generated = " + sqr);
	}
}

class Cube extends Thread {
	int x;

	Cube(int n) {
		x = n;
	}

	public void run() {
		double cube=Math.pow(x, 3);
		//int cube = x * x * x;
		System.out.println("Cube of the Integer Generated = " + cube);
	}
}

class ThreadNumber extends Thread {
	public void run() {
		Random random = new Random();
		for (int i = 0; i < 1; i++) {
			int randomInteger = random.nextInt(10);

			System.out.println("Random Integer Generated : " + randomInteger);

			Square s = new Square(randomInteger);
			s.start();

			Cube c = new Cube(randomInteger);
			c.start();

		}
	}
}

public class MultiThreadNumberSquareCube {
	public static void main(String[] args) {
		ThreadNumber t = new ThreadNumber();
		t.start();
	}
}
