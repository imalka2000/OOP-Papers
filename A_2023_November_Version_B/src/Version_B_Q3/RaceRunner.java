package Version_B_Q3;

public class RaceRunner 
{
	public static void main(String[] args) 
	{
		Thread car=new Car();
		Thread bike=new Bike();
		
		car.start();
		
		try {
			car.join();
			bike.join();
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
			
		bike.start();		
	}

}
