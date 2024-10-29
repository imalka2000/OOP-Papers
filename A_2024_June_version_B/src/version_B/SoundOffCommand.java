package version_B;

public class SoundOffCommand implements Command 
{
	SoundSystem soundSystem;
	
	public SoundOffCommand(SoundSystem soundSystem) 
	{
		super();
		this.soundSystem = soundSystem;
	}



	@Override
	public void execute()
	{
		soundSystem.turnOff();

	}

}
