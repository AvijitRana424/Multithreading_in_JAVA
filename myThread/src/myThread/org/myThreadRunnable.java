package myThread.org;
import java.util.*;
class Myrunabble implements Runnable{
	private int threadNo;
	public Myrunabble(int threadNo)
	{
		this.threadNo = threadNo;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Random random = new Random();
		for(int i = 1;i<=9;i++)
		{
			try {
				Thread.sleep(random.nextInt(500));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("The value if i is: "+i+" and the thread number is: "+threadNo);
		}
		
	}
	
	
	
}
public class myThreadRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread1 = new Thread(new Myrunabble(1));
		Thread thread2 = new Thread(new Myrunabble(2));
		thread1.start();
		thread2.start();
		

	}

}
