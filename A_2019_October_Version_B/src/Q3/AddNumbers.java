package Q3;

public class AddNumbers implements Runnable {
	
	DemoThreads demoThread;
	int begin;
	int end;
	
	public AddNumbers(DemoThreads demoThread, int begin, int end) {
		super();
		this.demoThread = demoThread;
		this.begin = begin;
		this.end = end;
	}
	
	public void addNumbers(DemoThreads demoThread, int begin, int end)
	{
		synchronized (demoThread)
		{
			for(int i=begin;i<=end;i++)
			{
				System.out.println(Thread.currentThread().getName()+" =>" + i +"(+)"+ i + " = "+(i+i));
				
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
		addNumbers(demoThread, begin, end);
		
	}
	

	


}
