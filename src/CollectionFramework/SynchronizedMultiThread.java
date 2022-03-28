package CollectionFramework;

class Table {
	synchronized void printTable(int n) { // Synchronized
		//void printTable(int n) { // Asynchronized
		for (int i = 0; i <= 5; i++) {
			System.out.println(n + "*" + i + "=" + n * i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}

		}
	}
}

class ThreadA extends Thread {
	Table t1;

	ThreadA(Table t) {
		t1 = t;
		// this.t1=t
	}

	public void run() {
		t1.printTable(5);
	}
}

class ThreadB extends Thread {
	Table t2;

	ThreadB(Table t) {
		// t2=t;
		this.t2 = t;
	}

	public void run() {
		t2.printTable(100);
	}
}

public class SynchronizedMultiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table obj = new Table();
		ThreadA t1 = new ThreadA(obj);
		ThreadB t2 = new ThreadB(obj);
		t1.start();
		t2.start();
	}
}
