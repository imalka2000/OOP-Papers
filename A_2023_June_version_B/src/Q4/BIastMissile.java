package Q4;

public class BIastMissile implements Missileoperationn 
{
	
	Missilesystem missile;	
	
	public BIastMissile(Missilesystem missile)
	{
		super();
		this.missile = missile;
	}

	
	@Override
	public void initiateoperation(String location)
	{
		missile.blast(location);
	}

}
