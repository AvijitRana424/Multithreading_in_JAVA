package myThread.org;
//use es of volatile keyword in java
public class useVolatileKeys {
	//its rear to use 
    volatile public static int flag = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new Thread(new Runnable() {
        	public void run()
        	{
        		while(true)
        		{
        			if(flag == 0)
        			{
        				System.out.println("Running...");
        			}
        			else
        			{
        				break;
        			}
        		}
        	}
        }).start();
        
        
        new Thread(new Runnable() {
        	public void run()
        	{
        		try{
        			Thread.sleep(200);
        		}
        		catch(InterruptedException e)
        		{
        			e.printStackTrace();
        		}
        		
        		useVolatileKeys.flag = 1;
        		System.out.println("Thread is Terminate..");
        	}
        }).start();
	}

}
