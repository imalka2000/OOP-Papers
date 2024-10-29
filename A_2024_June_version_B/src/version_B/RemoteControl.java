package version_B;

public class RemoteControl 
{	
	static RemoteControl rControl;
	Command commands[];	
	
	private RemoteControl() 
	{
        commands = new Command[5];
	}
   
	public static RemoteControl getInstance()
	{		
		if(rControl==null)
		{
			rControl=new RemoteControl();
		}			
		return rControl;		
	}
	
	 public void setCommand(int slot, Command command) 
	 {		 
		 if(slot>=0 && slot<commands.length)
		 {
			 commands[slot]=command;
		 }		 
	 }
	 
	 public void pressButton(int slot) 
	 {
		 if(slot>=0 && slot<commands.length && commands[slot]!=null )
		 {
			 commands[slot].execute();
		 }
		 
		 else
		 {
	            System.out.println("No command assigned to this slot."); 
		 }
		 
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
}