package version_B;

public class SoundOnCommand implements Command 
{

	SoundSystem soundSystem;
	
	public SoundOnCommand(SoundSystem soundSystem) 
	{
		super();
		this.soundSystem = soundSystem;
	}

	
	@Override
	public void execute() 
	{
		soundSystem.turnOn();
		
	}

}
