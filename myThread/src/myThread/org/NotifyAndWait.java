package myThread.org;

public class NotifyAndWait {
    public static int balance = 0;
    
    //method-1 for withdraw amount
    public void withdraw(int amount)
    {
    	synchronized(this){
    		if(balance <= 0)
        	{
        		try {
        			System.out.println("waiting for balance updation..");
        			wait();
        		}catch(InterruptedException e)
        		{
        			e.printStackTrace();
        		}
        		
        	}
    	}
    	balance -= amount;
    	System.out.println("withdraw succesfull And The current Balanced is: "+balance);
    }
    
    //method-2 for deposite amount
    public void deposite(int amount)
    {
    	System.out.println("Deposital successfull..");
    	balance += amount;
    	synchronized(this) {
    	  notifyAll();
    	}
    	
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NotifyAndWait nw1 = new NotifyAndWait();
		Thread t1 = new Thread(new Runnable() {
			public void run()
			{
				
				nw1.withdraw(1000);
			}
		});
		t1.setName("Thread-1");	
		t1.start();
		
		Thread t2 = new Thread(new Runnable() {
			public void run()
			{
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				nw1.deposite(2000);
			}
		});
		t2.setName("Thread-2");
		t2.start();
		
	}

}
