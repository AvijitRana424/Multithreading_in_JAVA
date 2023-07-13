package myThread.org;
class Break{
	private Object lock = "lock";
	public void generate()
	{
		synchronized (lock)
		{
		for(int i = 1;i<=10;i++)
		{
			try {
				Thread.sleep(10);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			
			if(i <= 5)
			{
				System.out.print("[");
			}
			else
			{
					System.out.print("]");
			
			}
		}
		}
		System.out.println();
		for(int i = 1;i<=10;i++)
		{
			try {
				Thread.sleep(25);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			
			
		}
	}
}
public class synBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Break b1 = new Break();
		new Thread(new Runnable() {
			public void run()
			{
				long startTime = System.currentTimeMillis();
				for(int i = 1;i<=5;i++)
				{
					b1.generate();

				}
				long endTime = System.currentTimeMillis();
				System.out.println("Time require for thread 1 was: "+(endTime-startTime));
			}
		}).start();
		
				new Thread(new Runnable() {
					public void run()
					{
						long startTime = System.currentTimeMillis();
						for(int i = 1;i<=5;i++)
						{
							b1.generate();

						}
						long endTime = System.currentTimeMillis();
						System.out.println("Time require for thread 2 was: "+(endTime-startTime));
					}
				}).start();

	}

}



