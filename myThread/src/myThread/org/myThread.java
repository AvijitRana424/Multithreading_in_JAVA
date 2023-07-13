package myThread.org;
class myCounter extends Thread{
	private int threadNo;

	public myCounter(int threadNo) {
		
		this.threadNo = threadNo;
	}
	public void run()
	{
		countMe();
	}
	public void countMe()
	{
		for(int i = 1;i<=9;i++)
		{
			try {
				sleep(500);
				
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			
			System.out.println("The value if i is: "+i+" and the thread number is: "+threadNo);
		}
	}

	
	
	
}


public class myThread {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myCounter count1 = new myCounter(1);
		myCounter count2 = new myCounter(2);
		long startTime = System.currentTimeMillis();
//		count1.countMe();
		//count1.run(); //Run should be called by JVM (Instaed of ourself)
		count1.start();
		System.out.println("**********************$$$$$$$$$$$*********************");
//		count2.countMe();
		//count2.run();
		count2.start();
		try {
			Thread.sleep(4528);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Total time required to end the Process is: "+(endTime-startTime));

	}

}
