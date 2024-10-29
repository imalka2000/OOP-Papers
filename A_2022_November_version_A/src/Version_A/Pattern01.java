package Version_A;

public class Pattern01 extends Thread
{
	
	Object Lock;
	int count;
	String pattern;
	
	public Pattern01(Object lock, int count, String pattern) 
	{ 
		super();
		Lock = lock;
		this.count = count;
		this.pattern = pattern;
	}
	
	public void run()
	{	
		synchronized (Lock) 
		{
			for(int i=0;i<count;i++)
			{
				
				System.out.print("Pattern 01 Thread =");
				
				
				for(int  j=0;j<count-i;j++)//space
				{
					System.out.print(" ");
				}
				
				for(int j=0;j<i+1;j++)
				{
					System.out.print(pattern +" ");//pattern

				}
				System.out.println();
				
				
				
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			Lock.notify();
			try {
				Lock.wait();
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			
			
			}			
		}		
	}
}
