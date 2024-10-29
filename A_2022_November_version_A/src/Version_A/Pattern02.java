package Version_A;

public class Pattern02 extends Thread
{
	
	Object Lock;
	int count;
	String pattern;
	
	public Pattern02(Object lock, int count, String pattern) 
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
				
				System.out.print("Pattern 02 Thread =");
				
				
				for(int  j=0;j<count-i;j++)//space
				{
					System.out.print(" ");
				}
				
				for(int j=0;j<i+1;j++)
				{
					System.out.print(pattern +" ");

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
