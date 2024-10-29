package Q3;

public class PlusThread implements Runnable {
	
	Object lock;
	int start;
	int range;
	
	public PlusThread(Object lock, int start, int range)
	{
		super();
		this.lock = lock;
		this.start = start;
		this.range = range;
	}
	
	public void addNumber(Object lock, int start, int range)
	{
		synchronized (lock)
		{
			for(int i=start ; i<=range ; i++)
			{				
				try {
					System.out.println(Thread.currentThread().getName()+" =>" + i + "+" +i + "="+(i+i));
					Thread.sleep(1000);
					lock.notify();
					lock.wait();

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
			}			
		}		
	}

	@Override
	public void run()
	{
		addNumber(lock, start, range);		

		
	}
	
	
}
