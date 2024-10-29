package version_B;

public class TvOffCommand implements Command
{
	Television tv;
	
	
	public TvOffCommand(Television tv) {
		super();
		this.tv = tv;
	}


	@Override
	public void execute() 
	{
		tv.turnOff();
	}

}
