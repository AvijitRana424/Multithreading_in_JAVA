package myThread.org;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class someThread extends Thread{
	private String name;

	public someThread(String name) {
		
		this.name = name;
	}
	
	public void run()
	{
		System.out.println("Starting Thread: "+name);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Ending Thread: "+name);
	}
	
}
public class ThreadPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		someThread t1 = new someThread("Thread-1");
		someThread t2 = new someThread("Thread-2");
		someThread t3 = new someThread("Thread-3");
		someThread t4 = new someThread("Thread-4");
		someThread t5 = new someThread("Thread-5");
		someThread t6 = new someThread("Thread-6");
		someThread t7 = new someThread("Thread-7");
		someThread t8 = new someThread("Thread-8");
		someThread t9 = new someThread("Thread-9");
		someThread t10 = new someThread("Thread-10");
		someThread t11 = new someThread("Thread-11");
		someThread t12 = new someThread("Thread-12");
		someThread t13 = new someThread("Thread-13");
		someThread t14 = new someThread("Thread-14");
		someThread t15 = new someThread("Thread-15");
		someThread t16 = new someThread("Thread-16");
		
		executorService.execute(t1);
		executorService.execute(t2);
		executorService.execute(t3);
		executorService.execute(t4);
		/*executorService.execute(t5);
		executorService.execute(t6);
		executorService.execute(t7);
		executorService.execute(t8);
		executorService.execute(t9);
		executorService.execute(t10);
		executorService.execute(t11);
		executorService.execute(t12);
		executorService.execute(t13);
		executorService.execute(t14);
		executorService.execute(t15);
		executorService.execute(t16);*/
		
		executorService.shutdown();
		
//		t1.start();
//		t2.start();
//		t3.start();
//		t4.start();
//		t5.start();
//		t6.start();
//		t7.start();
//		t8.start();
//		t9.start();
//		t10.start();
//		t11.start();
//		t12.start();
//		t13.start();
//		t14.start();
//		t15.start();
//		t16.start();
		
	}

}
