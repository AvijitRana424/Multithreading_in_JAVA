package myThread.org;

import java.util.concurrent.ArrayBlockingQueue;

//with the help of producer and consumer problem
class Producer implements Runnable{
	ArrayBlockingQueue<Integer> queue;

	public Producer(ArrayBlockingQueue<Integer> queue) {
		
		this.queue = queue;
	}
	
	public void run()
	{
		while(true)
		{
			try {
				Thread.sleep(1000);
				queue.put(BlockingQueue.counter++);
				System.out.println("Value added in the queue: "+BlockingQueue.counter);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}

class Consumer implements Runnable{
	ArrayBlockingQueue<Integer> queue;

	public Consumer(ArrayBlockingQueue<Integer> queue) {
		
		this.queue = queue;
	}
	
	public void run()
	{
		while(true)
		{
			try {
				Thread.sleep(4000);
				queue.take();
				BlockingQueue.counter--;
				System.out.println("Value removed in the queue: "+BlockingQueue.counter);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
public class BlockingQueue {
    static int counter = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
		Producer p1 = new Producer(queue);
		Thread t1 = new Thread(p1);
		t1.start();
		
		Consumer s1 = new Consumer(queue);
		Thread t2 = new Thread(s1);
		t2.start();
        
	}

}
