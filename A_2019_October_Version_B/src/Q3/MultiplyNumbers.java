package Q3;

public class MultiplyNumbers implements Runnable{

	DemoThreads demoThread;
	int begin;
	int end;
	
	public MultiplyNumbers (DemoThreads demoThread, int begin, int end) {
		super();
		this.demoThread = demoThread;
		this.begin = begin;
		this.end = end;
	}
	
	public void multiplyNumbers(DemoThreads demoThread, int begin, int end)
	{
		synchronized (demoThread)
		{
			for(int i=begin;i<=end;i++)
			{
				System.out.println(Thread.currentThread().getName()+" =>" + i +"(x)"+ i + " = "+(i*i));
				
				try {
					Thread.sleep(1000);
					demoThread.notify();
					demoThread.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		}
		
	}

	
	
	@Override
	public void run() 
	{
		multiplyNumbers(demoThread, begin, end);
		
	}
	

	


}
