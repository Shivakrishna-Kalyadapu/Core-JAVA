package CollectionFramework;

public class InterfaceThreadExample implements Runnable {
	@Override
public void run() {
	System.out.println("Thread is running");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceThreadExample t=new InterfaceThreadExample();
		Thread t1=new Thread(t);
		t1.start();
		System.out.println("Thread1");
		Thread t2=new Thread(t);
		t2.start();
		System.out.println("Thread2");
	}

}

/*class ThreadExample extends Thread {
	public void run() {
		System.out.println("Thread is running");
	}
	public static void main(String[] args) {
		ThreadExample t=new ThreadExample();
		t.start();
	}
}*/