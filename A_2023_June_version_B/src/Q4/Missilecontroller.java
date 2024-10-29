package Q4;

public class Missilecontroller 
{
	
	private Missileoperationn operation1;
	private Missileoperationn operation2;	
	
	
	static Missilecontroller mControl;
	private Missilecontroller(){}//constructor
	
	public static Missilecontroller getInstance()
	{
		if(mControl==null)
		{
			mControl=new Missilecontroller();
			System.out.println("Initialize missile Controller. . .");		
		}	
		
		return mControl;		
	}
	
	
	
	
	
	public void setOperations(Missileoperationn lunch,Missileoperationn blast)
	{
		this.operation1=lunch;
		this.operation2=blast;
	}
	
	
	public void performLaunching(String start) 
	{
		operation1.initiateoperation(start);
	}
	
	public void performBIasting(String end) 
	{
		operation2.initiateoperation(end);
	}

}
