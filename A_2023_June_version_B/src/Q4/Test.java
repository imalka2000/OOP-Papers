package Q4;

public class Test {

	public static void main(String[] args)
	{
		
		HeatMissilesystem heatMissile=HeatMissilesystem.getInstance();
		RocketMissilesystem rocketMillile= RocketMissilesystem.getInstance();		
		Missilecontroller cont=Missilecontroller.getInstance();
		
		cont.setOperations(new LaunchMissile(heatMissile), new BIastMissile(heatMissile));
		cont.performLaunching("Colombo");
		cont.performBIasting("MH370");
		
		cont.setOperations(new LaunchMissile(rocketMillile), new BIastMissile(rocketMillile));
		cont.performLaunching("Kandy");
		cont.performBIasting("MH420");	
	}

}
