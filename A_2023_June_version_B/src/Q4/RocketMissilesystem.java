package Q4;

public class RocketMissilesystem implements Missilesystem 
{
	public static RocketMissilesystem rMissile;
	
	
	private RocketMissilesystem()
	{
		
	}
	
	public static RocketMissilesystem getInstance()
	{
		if(rMissile==null)
		{
			rMissile=new RocketMissilesystem();
			System.out.println("Initialize Rocket Missile System. . .");		
		}
		
		return rMissile;
		
	}
	
	
	
	@Override
	public void launch(String source) 
	{
		System.out.print("\nRocket Missile launch from " + source );
	}

	@Override
	public void blast(String destination)
	{
		System.out.println(" and Rocket Missile blast Flight " + destination);

	}

	
}
