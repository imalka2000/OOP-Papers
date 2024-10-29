package Q4;

public class LaunchMissile implements Missileoperationn
{
	Missilesystem missile;
	
	

	public LaunchMissile(Missilesystem missile) 
	{
		super();
		this.missile = missile;
	}

	@Override
	public void initiateoperation(String location) 
	{
		missile.launch(location);
	}

}
