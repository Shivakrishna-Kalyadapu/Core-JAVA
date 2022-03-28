package CollectionFramework;

class Thread1 extends Thread {

	public void run() {

		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Value of Thread1 : " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}

	class Thread2 extends Thread {
		public void run() {

			try {
				for (int i = 5; i > 0; i--) {
					System.out.println("Value of Thread2 : " + i);
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}

	public class MultiThreadExample {
	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		t1.start();
		t2.start();
		System.out.println("Thread state : " + t1.getState());
		System.out.println("Thread is live : " + t1.isAlive());
		System.out.println("Thread priority : " + t1.getPriority());
		System.out.println("Thread class : " + t1.getClass());
		System.out.println("Active count : " + t1.activeCount());
	}
		}