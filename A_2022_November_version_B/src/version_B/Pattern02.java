package version_B;

public class Pattern02 extends Thread
{
	Object Lock;
	String pattern;
	int count;
	
	public Pattern02(Object lock, String pattern, int count) 
	{
		super();
		Lock = lock;
		this.pattern = pattern;
		this.count = count;
	}
	
	
	public void run() 
	{
		synchronized (Lock) 
		{
			for(int i=count ; i>0 ; i--) 
			{
				
				System.out.print("Pattern 02 Thread =");
				
				for(int j=0;j<count-i;j++)
				{
					System.out.print(" ");
				}
				
				for(int j=0;j<i;j++)
				{
					System.out.print(pattern + " ");
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
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}
		
	}
	
	

}
