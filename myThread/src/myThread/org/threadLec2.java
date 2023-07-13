package myThread.org;

public class threadLec2 {
    public static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new Runnable() {
			public void run()
			{
				for(int i = 0;i<=1000;i++)
				{
					threadLec2.count++;
				}
				System.out.println("Thread one is stopped..");
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run()
			{
				for(int i = 0;i<=1000;i++)
				{
					threadLec2.count++;
				}
				System.out.println("Thread two is stopped..");
			}
		});
		t1.start();
		t2.start();
		try {
			Thread.sleep(2000);	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	    
		System.out.println(threadLec2.count);

	}

}
