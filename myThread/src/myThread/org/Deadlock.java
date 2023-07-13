package myThread.org;
import java.util.concurrent.*;
public class Deadlock{
  ///create a deadlock sitution
	public static void main(String[] args) {
		String lock1 = "lock1";
		String lock2 = "lock2";
		//rentrantLock use for handle deadlock
//		Lock lock1 = new ReentrantLock();
//		Lock lock2 = new ReentrantLock();
		Thread t1 = new Thread(new Runnable() {
			public void run()
			{
				synchronized(lock1) {
					System.out.println("I am inside the Thread1 on lock 1");
					synchronized(lock2)
					{
						System.out.println("I am inside the thread1 on lock 2");
					}
				}
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run()
			{
				synchronized(lock2) {
					System.out.println("I am inside the Thread2 on lock 2");
					synchronized(lock1)
					{
						System.out.println("I am inside the thread2 on lock 1");
					}
				}
			}
		});
		
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("I am main method");

	}

}
