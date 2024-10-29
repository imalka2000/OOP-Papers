package paper_2019_oct_V_B;

public class MultiplyNumbers implements Runnable
{

	DemoThreads lock;
	int begin;
	int end;
	String name;
	
	public MultiplyNumbers(DemoThreads lock, int begin, int end,String name)
	{
		super();
		this.lock = lock;
		this.begin = begin;
		this.end = end;
		this.name=name;
	}
	
	
	
	void multiplyNummbers(DemoThreads lock, int begin, int end,String name)
	{
		synchronized (this.lock)
		{
			for (int i=begin;i<=end;i++)
			{
				//System.out.print(Thread.currentThread().getName());
				System.out.println(this.name+ "=> " + i + "(*) " + i + " = " +(i*i));
				
				lock.notify();
				
				try {
					Thread.sleep(1000);
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
		
		multiplyNummbers(lock, begin, end, name);
		
	}
	
	
	

}
