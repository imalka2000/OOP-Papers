package paper2022june;

public class p2 extends Thread
{	
	Object lock;
	String pattern;
	int count;
	
	
	public p2(Object lock, String pattern, int count) 
	{
		super();
		this.lock = lock;
		this.pattern = pattern;
		this.count = count;
	}
	
	
	public void run()
	{
		synchronized (lock)
		{
			for(int i=count ; i>0 ; i-- )
			{
				System.out.print("Pattern 02 Thread =");
				
				for(int j=0;j<count-i;j++)
				{
					System.out.print(" ");
				}
				
				for(int j=0 ; j<i ; j++)
				{
					System.out.print(pattern + " ");
				}
				System.out.println();		
				
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e)
				{
					e.printStackTrace();
				}
				
				lock.notify();
				try {
					lock.wait();
				} catch (InterruptedException e)
				{
					e.printStackTrace();
				}
				
			}			
			
		}		
	}
	
	
	
	
	
	
	

}