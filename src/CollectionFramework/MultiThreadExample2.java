package CollectionFramework;

public class MultiThreadExample2 extends Thread{
	public void run() {
try {
	     for(int i = 5; i > 0; i--) {
	         System.out.println("Value of i : "+i);
	         Thread.sleep(1000);
	    }
	    }catch (InterruptedException e) {
	         System.out.println(e);
	    }
	        
		//stem.out.println("Thread is running");
		System.out.println("Running Thread Name : " + Thread.currentThread().getName());
		System.out.println("Running Thread Priority : "+Thread.currentThread().getPriority());
	}
	
	public static void main(String[] args) throws InterruptedException {
		MultiThreadExample2 mt1=new MultiThreadExample2();
		mt1.setName("First Thread");
		mt1.setPriority(Thread.MIN_PRIORITY);
		
		MultiThreadExample2 mt2=new MultiThreadExample2();
		mt2.setName("Second Thread");
		mt2.setPriority(Thread.MAX_PRIORITY);
		
		MultiThreadExample2 mt3=new MultiThreadExample2();
		mt3.setName("Third Thread");
		mt2.setPriority(Thread.NORM_PRIORITY);

		mt1.start();
		mt1.suspend();
		mt1.resume();
//mt1.sleep(1500);
		mt2.start();
		mt3.start();
		
	}
}
