package myThread.org;

public class JoinOverview {
    public int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JoinOverview j1 = new JoinOverview();
        Thread t1 = new Thread(new Runnable() {
        	public void run()
        	{
        		for(int i = 0;i<1000;i++)
        		{
        			j1.count++;
        		}
        	}
        });
        
        
        Thread t2 = new Thread(new Runnable() {
        	public void run()
        	{
        		try {
					t1.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        		for(int i = 0;i<1000;i++)
        		{
        			j1.count++;
        		}
        	}
        });
        t1.start();
        t2.start();
        
        try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        System.out.println("The value of count is: "+j1.count);
	}

}
