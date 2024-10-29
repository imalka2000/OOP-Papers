package Paper_version_A_2022;

import java.util.ArrayList;

public class ConsumerThread implements Runnable
{	
	ArrayList<Integer> array=new ArrayList<Integer>();

	
	public ConsumerThread(ArrayList<Integer> array) 
	{
		super();
		this.array = array;
	}


	@Override
	public void run() 
	{
		while(true) 
		{
			synchronized (array) 
			{
				
				System.out.println("Consumer started");
				System.out.println("Consumer Thread consume " + array.get(0) );
				array.remove(0);
				
				System.out.println("Elements in queue = " + array );
				
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
