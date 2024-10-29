package version_B;

public class SetChannelCommand implements Command 
{	
	Television tv;
	int Channel;
	
	public SetChannelCommand(Television tv,int Channel) 
	{
		super();
		this.tv = tv;
		this.Channel=Channel;
	}

	@Override
	public void execute() 
	{
		tv.setChannel(Channel);
	}

}
