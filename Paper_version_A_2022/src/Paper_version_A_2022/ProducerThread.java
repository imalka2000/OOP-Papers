package Paper_version_A_2022;

import java.util.ArrayList;

public class ProducerThread implements Runnable
{
	ArrayList<Integer> array=new ArrayList<Integer>();

	public ProducerThread(ArrayList<Integer> array)
	{
		super();
		this.array = array;
	}

	@Override
	public void run()
	{
		int x=10;
		
		while(true)
		{
			
			synchronized (array)
			{
				
				System.out.println("producer started");
				array.add(x);
				
				System.out.println("Producer adding value = " + x + " to queue");
				x += 10;
				
				array.notify();
			
				
				try {
					Thread.sleep(1000);
					array.wait();
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				
				
			}
		}
		
	}
	
	
	

}
