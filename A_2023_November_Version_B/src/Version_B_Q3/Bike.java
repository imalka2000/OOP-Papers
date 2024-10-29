package Version_B_Q3;

public class Bike  extends Thread
{
	public void run() 
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("bike is racing");					
		}			

		try 
		{
			Thread.sleep(500);
		}
		catch (InterruptedException e) 
		{
					e.printStackTrace();
		}
		
	}
}
