package Q3;

public class MultiplyThread implements Runnable 
{

	Object lock;
	int start;
	int range;
	
	public MultiplyThread(Object lock, int start, int range)
	{
		super();
		this.lock = lock;
		this.start = start;
		this.range = range;
	}
	
	public void multiplydNumber(Object lock, int start, int range)
	{
		synchronized (lock)
		{
			for(int i=start ; i<=range ; i++)
			{				
				try {
					System.out.println(Thread.currentThread().getName()+" =>" + i + "x" +i + "="+(i*i));
					Thread.sleep(1000);
					lock.notify();
					lock.wait();
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}			
				
			}			
		}		
	}

	@Override
	public void run()
	{
		multiplydNumber(lock, start, range);		
	}
	
	
}
