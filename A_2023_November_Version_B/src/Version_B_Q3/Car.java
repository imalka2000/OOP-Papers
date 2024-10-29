package Version_B_Q3;

public class Car extends Thread
{
	public void run() 
	{
			for(int i=0;i<5;i++)
			{
				System.out.println("Car is racing");				
			}	
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}
}
