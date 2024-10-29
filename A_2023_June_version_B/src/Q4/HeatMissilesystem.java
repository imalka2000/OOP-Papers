package Q4;

public class HeatMissilesystem implements Missilesystem 
{
	static HeatMissilesystem hmissile;

	
	private HeatMissilesystem()
	{
		
	}
	
	public static HeatMissilesystem getInstance()
	{
		
		if(hmissile==null)
		{			
			hmissile=new HeatMissilesystem();
			System.out.println("Initialize Heat missile System. . .");		

		}		
		return hmissile;
			
	}
	
	
	@Override
	public void launch(String source) 
	{
		System.out.print("Heat Missile launch from " + source );
	}

	@Override
	public void blast(String destination)
	{
		System.out.print(" and Heat Missile blast Flight " + destination);

	}


}
