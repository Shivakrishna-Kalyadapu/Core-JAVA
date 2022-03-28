package CollectionFramework;

public class ThreadMethodExample1 extends Thread{

	public void run() {
		System.out.println("Thread is running");
	}
	public static void main(String[] args) {
		ThreadMethodExample1 t=new ThreadMethodExample1();
		t.start();
}
	}